package com.userfeedback.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection connection = null;

	public static void open(String driver,String url) {
		try {

			Class.forName("org.apache.derby.jdbc.ClientDriver");
			connection = DriverManager.getConnection("jdbc:derby://localhost:7089/D:/Documents/HSBC_Java/UserRatings/src/com/exercise/db/database");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection get() {
		return DBUtil.connection;
	}
}
