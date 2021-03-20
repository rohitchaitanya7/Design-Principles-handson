package com.cts.hibernate.Singeltonhandson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Main {
	static Connection con = DBconn.getConnection(); 
	public static void main(String[] args) throws SQLException  {
		Services s = new Services();
		s.setProductid(120);
		s.setProductname("laptop");
		
		String Qua = "INSERT INTO SHOPE(ID,NAME) VALUES(?,?);";
		PreparedStatement p = con.prepareStatement(Qua);
		p.setInt(1, s.getProductid());
		p.setString(2, s.getProductname());
		p.executeUpdate();
//
//		Insert i = new Insert();
//		i.insert1();
//		Update u = new Update();
//		u.insert();
	
		
		String Qua1 = "update shope set name = ? where id = ?;";
		p = con.prepareStatement(Qua1);
		p.setString(1, "computer");
		p.setInt(2, s.getProductid());
		p.executeUpdate();
		
		
//		Qua = "SELECT *FROM SHOPE;";
//		PreparedStatement p2 = con.prepareStatement(Qua);
		
	}
	

}
		
