package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import control.DataBase;

public class ClienteDAO {
	DataBase bd = new DataBase();
	Connection conex;

	/*public boolean gravarCliente(Cliente c) {
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

			int codigo = buscaCodigoCliente(c.getCpf());
			CopiarImagemFuncionario(codigo, c.getFoto());
			System.out.println("deu bom");
			return true;
		} catch (SQLException sqle) {
			System.out.println("Erro ao inserir..." + sqle.getMessage());
			return false;
		} finally {
			bd.Desconectar(conex);
		}

	}
	*/
	public int buscaCodigoCliente(long CPF) {
		conex = bd.Conectar();
		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM cliente";
			ResultSet rs = stmt.executeQuery(SQL);
			double cpfF;
			while (rs.next()) {
				cpfF = rs.getDouble("cpfCliente");

				if (cpfF == CPF) {
					return rs.getInt("idCliente");
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
}
