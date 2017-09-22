package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBase {

	private Connection Con;

	public DataBase() {
		this.Con = null;
	}

	public Connection Conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Con = DriverManager.getConnection("jdbc:mysql://localhost/apple", "root", "12345");
		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
		}
		return Con;
	}

	public void Desconectar(Connection Con) {
		try {
			Con.close();
		} catch (SQLException e) {
			e.getMessage();
		}
	}

}