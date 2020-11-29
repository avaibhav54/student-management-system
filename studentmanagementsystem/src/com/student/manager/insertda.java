package com.student.manager;
import java.sql.*;
public class insertda {

	
	public static boolean insertto(student st) {
		boolean f=false;
		try {
			
			Connection con=cp.create();
			String q="insert into students(sname,sphone,scity) values(?,?,?)";
			PreparedStatement pts=con.prepareStatement(q);
			
			pts.setString(1,st.getStudentName());
			pts.setString(2,st.getStudentPhone());
			pts.setString(3,st.getStudentCity());
			pts.executeUpdate();
			f=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean deletestu(int uid) {

		boolean f=false;
		try {
			
			Connection con=cp.create();
			String q="delete from students where sid=?";
			PreparedStatement pts=con.prepareStatement(q);
			
			pts.setInt(1,uid);
			
			pts.executeUpdate();
			f=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return f;		
	}

	public static void show() {
		// TODO Auto-generated method stub
try {
			
			Connection con=cp.create();
			String q="select * from students";
			
			Statement stmp=con.createStatement();
			ResultSet set =stmp.executeQuery(q);
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString(4);
				System.out.println("ID::"+id+"\nNAME::"+name+"\nPHONE::"+phone+"\nCITY::"+city+"\n*****************************\n\n");
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
