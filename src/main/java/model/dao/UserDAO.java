package model.dao;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


import model.bean.User;

public class UserDAO {
	
	private static UserDAO _instance = null;
	public static UserDAO getInstance()
    {
        if (_instance == null)
            _instance = new UserDAO();
        return _instance;
    }
	
	public User getUser(String username, String password) {
		Connection con = ConnectDB.getInstance().getConnection();
		try {
			String sql = "Select * from user where username=? and password=?";
			PreparedStatement statement = (PreparedStatement) con.prepareStatement(sql);
			statement.setString(1, username);
			statement.setString(2, password);
			ResultSet resultSet = statement.executeQuery();
			
			if (resultSet.next()) {
				User user = new User();
				user.setTen(resultSet.getString("Ten"));
				user.setPassword(password);
				user.setUsername(username);
				
				con.close();
				return user;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
}
