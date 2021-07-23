package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println(" Press 1 to Add Student...");
			System.out.println(" Press 2 to Delete Student...");
			System.out.println(" Press 3 to Display Student...");
			System.out.println(" Press 4 to Exist Student...");

			int c = Integer.parseInt(br.readLine());

			if (c == 1) {

				// Add Student

				System.out.println("Enter Your Name :-");
				String name = br.readLine();
				System.out.println("Enter Your Phone :-");
				String phone = br.readLine();
				System.out.println("Enter Your City :-");
				String city = br.readLine();

				// Create Student Object to Store

				Student s = new Student(name, phone, city);
				boolean ans = StudentDao.insertUserData(s);
				if (ans) {
					System.out.println(" Student Add Successfully... ");
				} else {
					System.out.println(" Please Try Again... ");

				}
//				System.out.println(s);

			} else if (c == 2) {

				// Delete Student

				System.out.println(" Enter Student Id to Delete :-");
				int id = Integer.parseInt(br.readLine());
				boolean d = StudentDao.deleteUser(id);

				if (d) {

					System.out.println(" Deleteing...");
				} else {

					System.out.println(" Please Try Again");

				}

			} else if (c == 3) {

				// Display Student
				
				 
				StudentDao.showUserAll();

			} else if (c == 4) {

				// Exist Student

				break;
			} else {

			}

		}
		System.out.println(" Thank You For Using My Application... ");

	}

}
