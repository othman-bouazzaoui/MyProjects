package dao;

import java.sql.Connection;
import java.util.List;

import models.User;

public class TestJDBC {

	public static void main(String[] args) {
		/*
		ConnectionManager cn =ConnectionManager.getInstance();
		Connection c = cn.openConnection();
		System.out.println(cn);
		*/
		User u = new User(5L,"BOUAZZAOUI", "Othman");
		User us = new User(1L);
		User user = new User();
		user.setId(2);
		IUserDao dao = new UserDaoImp();
		//dao.insert(u);
		//dao.update(u);
		//dao.delete(us);
		List<User> l=dao.select(user);
		System.out.println(l);
		

	}

}
