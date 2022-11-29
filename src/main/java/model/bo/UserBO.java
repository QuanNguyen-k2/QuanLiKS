package model.bo;

import model.bean.User;
import model.dao.UserDAO;

;

public class UserBO {
	private static UserBO _instance = null;
	public static UserBO getInstance()
    {
        if (_instance == null)
            _instance = new UserBO();
        return _instance;
    }
	public User getUser(String username,String password) {
		return UserDAO.getInstance().getUser(username, password);
	}
}
