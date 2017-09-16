package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataBase {

	private Connection Con;
	String driverName = "com.mysql.jdbc.Driver";
	String user = "root";
	String senha = "12345";
	String serverName = "localhost";
	String mydatabase = "apple";
	String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

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

/*
 * ResultSet rs = stmt.executeQuery(SQL); rs.last(); int size = rs.getRow();
 * rs.beforeFirst(); Arma armas[][] = new Arma[size][9]; int cont = 0; while
 * (rs.next()) { armas[cont][0].setNome(rs.getString("nome"));
 * armas[cont][1].setTipo( rs.getString("tipo"));
 * armas[cont][2].setDano(Integer.parseInt(rs.getString("dano")));
 * armas[cont][3].setAlcance(Integer.parseInt(rs.getString("alcance")));
 * armas[cont][4].setPrecisao(Integer.parseInt(rs.getString("precisao")));
 * armas[cont][5].setTiroSemVisada(Integer.parseInt(rs.getString("tiroSemVisada"
 * )));
 * armas[cont][6].setEstabilidade(Integer.parseInt(rs.getString("estabilidade"))
 * ); armas[cont][7].setCadencia(Integer.parseInt(rs.getString("cadencia")));
 * armas[cont][8].setCapacidadeDoPente(Integer.parseInt(rs.getString(
 * "capacidadeDoPente"))); cont++;
 * 
 * } rs.close(); stmt.close(); return armas;
 * 
 * } catch (java.lang.Exception ex) {
 * System.out.println("erro ao listar arma "); ex.printStackTrace();
 * 
 * } finally { bd.Desconectar(conex); } return null;
 */
