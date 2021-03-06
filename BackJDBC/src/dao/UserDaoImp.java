package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.ISUB;

import models.User;

public class UserDaoImp implements IUserDao {

	@Override
	public boolean insert(User u) {
		ConnectionManager cn = ConnectionManager.getInstance();
		Connection c = null;
		String sql = "INSERT INTO USERS (NOM,PRENOM) VALUES ('"+u.getNom()+"','"+u.getPrenom()+"')";
		try 
		{
			c = cn.openConnection();
			Statement st = c.createStatement();
			st.execute(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			cn.closeConection(c);
		}
		return false;
	}

	@Override
	public List<User> select(User u) {
		ConnectionManager cn = ConnectionManager.getInstance();
		Connection c = null;
		List<User> list = new ArrayList<User>();
		String sql = "SELECT * FROM USERS WHERE 1=1 ";
		if(u.getId() != 0L ) {
			sql +="AND ID='"+u.getId()+"'";
		}
		if(u.getNom() != null) {
			sql +="AND NOM='"+u.getNom()+"'";
		}
		if(u.getPrenom() != null) {
			sql +="AND PRENOM='"+u.getPrenom()+"'";
		}
		try 
		{
			c = cn.openConnection();
			Statement st = c.createStatement();
			ResultSet resultat =  st.executeQuery(sql);
			while(resultat.next())
			{
				User us = new User();
				us.setId(resultat.getLong("ID"));
				us.setNom(resultat.getString("NOM"));
				us.setPrenom(resultat.getString("PRENOM"));
				list.add(us);
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			cn.closeConection(c);
		}
		return list;
	}

	@Override
	public boolean update(User u) {
		ConnectionManager cn = ConnectionManager.getInstance();
		Connection c = null;
		String sql = "UPDATE USERS set NOM='"+u.getNom()+"',PRENOM='"+u.getPrenom()+"' WHERE ID='"+u.getId()+"'";
		try 
		{
			c = cn.openConnection();
			Statement st = c.createStatement();
			st.execute(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			cn.closeConection(c);
		}
		return false;
	}

	@Override
	public boolean delete(User u) {
		ConnectionManager cn = ConnectionManager.getInstance();
		Connection c = null;
		String sql = "DELETE FROM USERS WHERE ID='"+u.getId()+"'";
		try 
		{
			c = cn.openConnection();
			Statement st = c.createStatement();
			st.execute(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			cn.closeConection(c);
		}
		return false;
	}

}
