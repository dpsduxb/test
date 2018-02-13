package com.hkjc.racing.sql;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	String db_connect_string = "jdbc:sqlserver://localhost";
	String db_userid = "dpsduxb34";
	String db_password = "Srujana7890";

	public Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(db_connect_string, db_userid, db_password);

			System.out.println("connected to database successfully");
			return conn;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
}
