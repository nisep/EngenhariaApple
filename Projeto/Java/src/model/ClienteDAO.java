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

public class ClienteDAO {
	DataBase bd = new DataBase();
	Connection conex;

	public boolean gravarCliente(Cliente c) {
		conex = bd.Conectar();
		try {
			Statement stmt = conex.createStatement();
			stmt.execute(
					"INSERT INTO Cliente(nomeCliente, ruaCliente, compCliente, numeroCliente, bairroCliente, cidadeCliente, cepCliente, fotoCliente, telefoneCliente, celularCliente, cpfCliente)VALUES ('"
							+ c.getNome() + "','" + c.getRua() + "','" + c.getComplemento() + "','" + c.getNumero()
							+ "','" + c.getBairro() + "','" + c.getCidade()  + "','" + c.getCep() + "','" + c.getFoto()
							+ "','" + c.getTelefone() + "','" + c.getCelular() + "','" + c.getCpf() +"') ");

			int codigo = buscaCodigoCliente(c.getCpf());
			CopiarImagemCliente(codigo, c.getFoto());
			System.out.println("deu bom");
			return true;
		} catch (SQLException sqle) {
			System.out.println("Erro ao inserir..." + sqle.getMessage());
			return false;
		} finally {
			bd.Desconectar(conex);
		}

	}
	
	
	public boolean verificaCPF(long CPF) {
		conex = bd.Conectar();
		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM cliente";
			ResultSet rs = stmt.executeQuery(SQL);
			double cpfF;
			while (rs.next()) {
				cpfF = rs.getDouble("cpfCliente");

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

	public void CopiarImagemCliente(int codigo, String caminho) {
		FileInputStream origem = null;
		FileOutputStream destino = null;
		FileChannel fcOrigem = null;
		FileChannel fcDestino = null;
		try {
			origem = new FileInputStream(caminho);
			System.out.println();
			destino = new FileOutputStream("Media/Cliente/" + codigo + ".jpg");
			fcOrigem = origem.getChannel();
			fcDestino = destino.getChannel();
			fcOrigem.transferTo(0, fcOrigem.size(), fcDestino);
			origem.close();
			destino.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
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
