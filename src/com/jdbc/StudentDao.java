package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertUserData(Student s) {

		boolean f = false;

		try {

			// jdbc conn...

			Connection con = ConData.createCon();

			String q = "insert into student(name,phone,city) value(?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, s.getName());
			ps.setString(2, s.getPhone());
			ps.setString(3, s.getCity());

			ps.executeUpdate();
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return f;
	}

	public static boolean deleteUser(int id) {
		// TODO Auto-generated method stub

		boolean f = false;

		try {

			// jdbc conn...

			Connection con = ConData.createCon();

			String q = "delete from student where id=?";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setInt(1, id);

			ps.executeUpdate();
			f = true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return f;

	}

	
	public static void showUserAll() {
		// TODO Auto-generated method stub

		boolean f = false;

		try {

			// jdbc conn...

			Connection con = ConData.createCon();

			String q = "Select * from student";
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(q);

			while (rs.next()) {

				int id = rs.getInt(1);
				String name = rs.getString(2);
				String phone = rs.getString(3);
				String city = rs.getString(4);

			     System.out.println(" ID :-" +id);
			     System.out.println(" NAME :-" +name);
			     System.out.println(" PHONE :-" +phone);
			     System.out.println(" CITY :-" +city);
			     
			     System.out.println("+++++++++++++++++++++++++++++++++");
			
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
