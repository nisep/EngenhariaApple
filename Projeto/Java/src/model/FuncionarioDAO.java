package model;

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
			String SQL = "SELECT * FROM veiculo";
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
}
