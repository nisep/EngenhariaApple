package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	private Connection Con;
	private static DataBase dataBase;
	String driverName = "com.mysql.jdbc.Driver";                        
	String user = "root";
	String senha = "12345";
	String serverName = "localhost";
	String mydatabase ="apple";
	String url = "jdbc:mysql://" + serverName + "/" + mydatabase+"?autoReconnect=true&useSSL=false";
	
	public static synchronized DataBase getInstance() {
		if(dataBase == null) {
			dataBase = new DataBase();
		}
		return dataBase;
	}

	public DataBase() {
		this.Con = null;
	}

	public Connection Conectar() {
		try {
			Class.forName(driverName);
			Con = DriverManager.getConnection(url, user, senha);
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
