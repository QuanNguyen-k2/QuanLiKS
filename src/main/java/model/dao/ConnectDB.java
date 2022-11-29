package model.dao;


import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class ConnectDB {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/quanliphong";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";

	private static ConnectDB _instance = null;
	private static Connection con = null;
	
	private ConnectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con =(Connection) DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("connect successfully!");
		} catch (Exception ex) {
			System.out.println("connect failure!");
			ex.printStackTrace();
		}
	}
	
	public static ConnectDB getInstance()
    {
        if (_instance == null)
            _instance = new ConnectDB();
        return _instance;
    }

	public Connection getConnection() {
		return con;
	}

}
