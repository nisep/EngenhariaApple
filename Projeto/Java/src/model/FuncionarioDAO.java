package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import control.DataBase;

public class FuncionarioDAO {
	DataBase bd = new DataBase();
	Connection conex = bd.Conectar();

	public boolean gravarFuncionario(Funcionario f) {
		conex = bd.Conectar();
		try {
			Statement stmt = conex.createStatement();
			stmt.execute(
					"INSERT INTO funcionario(nomeFunc, ruaFunc, compFunc, numeroFunc, bairroFunc, cidadeFunc, dataNascFunc, dataAdmissaoFunc, cepFunc, senhaFunc, fotoFunc, telefoneFunc, celularFunc, cpfFunc, salarioFunc, comissaoFunc)VALUES ('"
							+ f.getNome() + "','" + f.getRua() + "','" + f.getComplemento() + "','" + f.getNumero()
							+ "','" + f.getBairro() + "','" + f.getCidade() + "','" + f.getDataNascimento() + "','"
							+ f.getDataAdmissao() + "','" + f.getCep() + "','" + f.getSenha() + "','" + f.getFoto()
							+ "','" + f.getTelefone() + "','" + f.getCelular() + "','" + f.getCpf() + "','"
							+ f.getSalario() + "','" + f.getComissao() + "') ");
			
			int codigo = buscaCodigoFuncionario(f.getCpf());
			CopiarImagemFuncionario(codigo,f.getFoto());
			System.out.println("deu bom");
			return true;
		} catch (SQLException sqle) {
			System.out.println("Erro ao inserir..." + sqle.getMessage());
			return false;
		} finally {
			bd.Desconectar(conex);
		}

	}

	private int buscaCodigoFuncionario(long CPF) {
		conex = bd.Conectar();
		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM funcionario";
			ResultSet rs = stmt.executeQuery(SQL);
			double cpfF;
			while (rs.next()) {
				cpfF = rs.getDouble("cpfFunc");

				if (cpfF == CPF) {
					return rs.getInt("idFuncionario");
				}
			}
		} catch (SQLException sqle) {
			System.out.println("Erro ao consultar..." + sqle.getMessage());
			return 0;
		} finally {
			bd.Desconectar(conex);
		}
		return 0;
	}

	public boolean verificaCPF(long CPF) {
		conex = bd.Conectar();
		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM funcionario";
			ResultSet rs = stmt.executeQuery(SQL);
			double cpfF;
			while (rs.next()) {
				cpfF = rs.getDouble("cpfFunc");

				if (cpfF == CPF) {
					return true;
				}
			}
		} catch (SQLException sqle) {
			System.out.println("Erro ao consultar..." + sqle.getMessage());
			return false;
		} finally {
			bd.Desconectar(conex);
		}
		return false;
	}

	public void CopiarImagemFuncionario(int codigo, String caminho) {
		FileInputStream origem= null;
		FileOutputStream destino = null;
		FileChannel fcOrigem = null;
		FileChannel fcDestino = null;
		try {
			origem = new FileInputStream(caminho);
			System.out.println();
			destino = new FileOutputStream("Media/Funcionario/" + codigo + ".jpg");
			fcOrigem = origem.getChannel();
			fcDestino = destino.getChannel();
			fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);
			origem.close();
			destino.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	

	}

		


}
