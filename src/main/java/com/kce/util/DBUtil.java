package com.kce.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static final String url = "jdbc:mysql://localhost:3306/airline";
	private static final String userName = "root";
	private static final String passWord = "Karpagam123";

	public static Connection getDBConnection() {
		try {
			return DriverManager.getConnection(url, userName, passWord);
		} catch (SQLException sql) {
			System.out.println(sql);
		}
		return null;
	}
}
