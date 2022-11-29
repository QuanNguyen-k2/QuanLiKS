package model.bean;

import java.sql.Date;

public class DatPhong {
	int MaDatPhong;
	String MaPhong;
	String Username;
	String TenNguoiDat;
	Date GioDat;
	Date GioTra;
	int TongTien;
	
	public int getMaDatPhong() {
		return MaDatPhong;
	}
	public void setMaDatPhong(int maDatPhong) {
		MaDatPhong = maDatPhong;
	}
	public String getMaPhong() {
		return MaPhong;
	}
	public void setMaPhong(String maPhong) {
		MaPhong = maPhong;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getTenNguoiDat() {
		return TenNguoiDat;
	}
	public void setTenNguoiDat(String tenNguoiDat) {
		TenNguoiDat = tenNguoiDat;
	}
	public Date getGioDat() {
		return GioDat;
	}
	public void setGioDat(Date gioDat) {
		GioDat = gioDat;
	}
	public Date getGioTra() {
		return GioTra;
	}
	public void setGioTra(Date gioTra) {
		GioTra = gioTra;
	}
	public int getTongTien() {
		return TongTien;
	}
	public void setTongTien(int tongTien) {
		TongTien = tongTien;
	}
}
