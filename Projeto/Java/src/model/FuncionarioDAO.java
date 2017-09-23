package model;

import java.sql.Connection;
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
					"INSERT INTO funcionario(nomeFunc, fotoFunc, salarioFunc, comissaoFunc, cpfFunc, ruaFunc, compFunc, numeroFunc, bairroFunc, cidadeFunc, "
					+ "dataNascFunc, telefoneFunc, celularFunc, dataAdmissaoFunc, cepFunc, senhaFunc)VALUES ('"
							+ f.getNome() + "','" + f.getFoto() + "','" + f.getSalario() + "','" + f.getComissao() + "','"
							+ f.getCpf() + "','" + f.getRua() + "','" + f.getComplemento() + "','"
							+ f.getNumero() + "','" + f.getBairro() + "','" + f.getCidade() +  "','" + f.getBairro() +  "','" + 
							f.getDataNascimento() +  "','" + f.getTelefone() +  "','" + f.getCelular() +  "','" +f.getDataAdmissao()+  "','" +f.getCep()+ "','" +f.getSenha()+"') ");
			return true;
		} catch (SQLException sqle) {
			System.out.println("Erro ao inserir..." + sqle.getMessage());
			return false;
		} finally {
			bd.Desconectar(conex);
		}

	}
}
