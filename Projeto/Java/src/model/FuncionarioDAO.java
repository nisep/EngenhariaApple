package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
			CopiarImagemFuncionario(codigo, f.getFoto());
			System.out.println("deu bom");
			return true;
		} catch (SQLException sqle) {
			System.out.println("Erro ao inserir..." + sqle.getMessage());
			return false;
		} finally {
			bd.Desconectar(conex);
		}

	}

	public int buscaCodigoFuncionario(long CPF) {
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
		FileInputStream origem = null;
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

	public boolean editarArmaSQL(Funcionario f) {
		conex = bd.Conectar();
		try {
			Statement stmt = conex.createStatement();
			stmt.execute("UPDATE funcionario SET nomeFunc='" + f.getNome() + "', ruaFunc='" + f.getRua()
					+ "', compFunc='" + f.getComplemento() + "', numeroFunc='" + f.getNumero() + "', bairroFunc='"
					+ f.getBairro() + "', cidadeFunc='" + f.getCidade() + "', dataNascFunc='" + f.getDataNascimento()
					+ "', cepFunc ='" + f.getCep() + "', celularFunc='" + f.getCelular() + "', senhaFunc='"
					+ f.getSenha() + "', salarioFunc='" + f.getSalario() + "', comissaoFunc='" + f.getComissao()
					+ "', telefoneFunc='" + f.getTelefone() + "'  WHERE idFuncionario='" + f.getIdFuncionario() + "' ");
			stmt.close();
			return true;
		} catch (SQLException sqle) {
			System.out.println("Erro ao alterar..." + sqle.getMessage());
		} finally {
			bd.Desconectar(conex);
		}
		return false;
	}

	public ArrayList<Funcionario> buscaCPFNomeFuncionario(String campo) {
		conex = bd.Conectar();

		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM funcionario WHERE nomeFunc LIKE '%" + campo + "%' OR cpfFunc LIKE '" + campo
					+ "'";
			ResultSet rs = stmt.executeQuery(SQL);
			ArrayList<Funcionario> funcs = new ArrayList<>();
			Funcionario func = new Funcionario();
			while (rs.next()) {
				func.setNome(rs.getString("nomeFunc"));
				func.setIdFuncionario(rs.getInt("idFuncionario"));
				func.setCpf(rs.getLong("cpfFunc"));
				func.setDataNascimento(rs.getDate("dataNascFunc"));
				func.setTelefone(rs.getLong("telefoneFunc"));
				func.setRua(rs.getString("ruaFunc"));
				funcs.add(func);

			}
			rs.close();
			stmt.close();
			return funcs;
		} catch (SQLException sqle) {
			System.out.println("Erro ao consultar..." + sqle.getMessage());
			return null;
		} finally {
			bd.Desconectar(conex);
		}
	}

	public ArrayList<Funcionario> listaFuncionario() {
		conex = bd.Conectar();

		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM funcionario";
			ResultSet rs = stmt.executeQuery(SQL);
			ArrayList<Funcionario> funcs = new ArrayList<>();
			Funcionario func = new Funcionario();
			while (rs.next()) {
				func.setNome(rs.getString("nomeFunc"));
				func.setIdFuncionario(rs.getInt("idFuncionario"));
				func.setCpf(rs.getLong("cpfFunc"));
				func.setDataNascimento(rs.getDate("dataNascFunc"));
				func.setTelefone(rs.getLong("telefoneFunc"));
				func.setRua(rs.getString("ruaFunc"));
				funcs.add(func);
			}
			rs.close();
			stmt.close();
			return funcs;
		} catch (SQLException sqle) {
			System.out.println("Erro ao consultar..." + sqle.getMessage());
			return null;
		} finally {
			bd.Desconectar(conex);
		}
	}

	public String[][] listaFuncionarioArray(String campo) {
		conex = bd.Conectar();
		try {
			Statement stmt = (Statement) conex.createStatement();
			String SQL = "SELECT * FROM funcionario WHERE nomeFunc LIKE '%" + campo + "%' OR cpfFunc LIKE '" + campo
					+ "'";
			ResultSet rs = stmt.executeQuery(SQL);
			rs.last();
			int size = rs.getRow();
			rs.beforeFirst();

			String funcs[][] = new String[size][6];
			int cont = 0;
			while (rs.next()) {
				funcs[cont][1] = rs.getString("nomeFunc");
				funcs[cont][0] = "" + rs.getInt("idFuncionario");
				funcs[cont][2] = "" + rs.getLong("cpfFunc");
				funcs[cont][4] = "" + rs.getDate("dataNascFunc");
				funcs[cont][3] = "" + rs.getLong("telefoneFunc");
				funcs[cont][5] = rs.getString("ruaFunc");
				cont++;
			}
			rs.close();
			stmt.close();
			return funcs;
		} catch (SQLException sqle) {
			System.out.println("Erro ao listar..." + sqle.getMessage());
			return null;
		} finally {
			bd.Desconectar(conex);
		}
	}

}
