package model.dao;

import java.sql.ResultSet;
import java.util.ArrayList;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import model.bean.Phong;

public class PhongDAO {
	
	private static PhongDAO _instance = null;
	public static PhongDAO getInstance()
    {
        if (_instance == null)
            _instance = new PhongDAO();
        return _instance;
    }
	
	public ArrayList<Phong> getAllPhongs() {
		Connection con= ConnectDB.getInstance().getConnection();
		try {
			ArrayList<Phong> dataPhong= new ArrayList<Phong>();
			
			String sql = "SELECT * FROM phong";
			Statement statement = (Statement) con.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()){
				Phong temp = new Phong();
				temp.setMaPhong(result.getString("MaPhong"));
				temp.setDonGia(result.getInt("DonGia"));
				temp.setTinhTrang(result.getBoolean("TinhTrang"));
				temp.setMoTa(result.getString("MoTa"));
				dataPhong.add(temp);
			}
			System.out.println();
			con.close();
			return dataPhong;	
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
//	public static void main(String[] args) {
//		PhongDAO.getInstance().getAllPhongs().forEach(a->System.out.println(a.toString()));
//	}
}
