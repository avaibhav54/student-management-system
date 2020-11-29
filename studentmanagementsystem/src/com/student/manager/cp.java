package com.student.manager;

import java.sql.*;

public class cp {
static Connection con;
	public static Connection create() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user="root";
			String password="vaibhav";
			String url="jdbc:mysql://localhost:3306/student_manage";
			con=DriverManager.getConnection(url,user,password);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
}
