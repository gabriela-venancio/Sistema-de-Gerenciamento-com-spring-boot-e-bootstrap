package br.com.gabzay.demo.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FactoryConnection {
	
	private static final String USERNAME ="root";
	
	private static final String PASSWORD ="3629Mudar#";

	
	private static final String DATABASE_URL ="jdbc:mysql://localhost:3306/gerenciador";

	/*coneccao com o banco**/
	
	public static Connection createConnectionToMySql() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD );
	
	return connection;
	
	
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con=createConnectionToMySql();
		
		if(con != null) {
			System.out.print("conexao sucessida");
			con.close();
		}
		
	}
	
	
}
