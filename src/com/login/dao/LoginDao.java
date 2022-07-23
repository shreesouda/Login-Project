package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
	
	String query = "SELECT * FROM logtable WHERE uname=? and pwd=?";
	String url = "jdbc:mysql://localhost:3306/db1";
	String username = "root";
	String password = "kundapura@007";

	public boolean isValid (String usname, String passwd) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pt = con.prepareStatement(query);
		pt.setString(1, usname);
		pt.setString(2, passwd);
		ResultSet rs = pt.executeQuery();
		if (rs.next())
			return true;
		return false;
		
	}

}
