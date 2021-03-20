package com.cts.hibernate.Singeltonhandson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconn {

	private static Connection con = null;

	static {
		String url = "jdbc:mysql://localhost:3306/ormlearn";
		String user = "root";
		String password = "rohit";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}
}
