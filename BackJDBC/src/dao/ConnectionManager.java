package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	private static ConnectionManager instance ;
	ConnectionManager()
	{
		
	}
	public static ConnectionManager getInstance()
	{
		if(instance ==null) 
			instance = new ConnectionManager();
		return instance;
	}

	public Connection openConnection() {
		Connection c = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jee";
			String user= "root";
			String pass="";
			c= DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	public void closeConection(Connection c)
	{
		if(c != null) {
			try {
				c.close();
			} catch (SQLException e) {
				System.out.println("Impossible de fermer la connexion !");
				e.printStackTrace();
			}
		}
	}
}
