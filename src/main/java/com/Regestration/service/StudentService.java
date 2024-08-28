package com.Regestration.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.Regestration.Dto.StudentDto;

public class StudentService {

	/*
	
	public boolean save(StudentDto studentdto) {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData", "root", "root");
            System.out.println("Connection created successfully");

            ps = con.prepareStatement("INSERT INTO data1 (name, email, phone, password, branch) VALUES (?, ?, ?, ?, ?)");

            ps.setString(1, studentdto.getName());
            ps.setString(2, studentdto.getEmail());
            ps.setString(3, studentdto.getPhone());
            ps.setString(4, studentdto.getPassword());
            ps.setString(5, studentdto.getBranch());

            int rowsAffected = ps.executeUpdate(); // Execute the insert statement
            return rowsAffected > 0; // Return true if the data was inserted successfully

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false; // Return false if there was an issue
    }
	
	
	*/
	
	
	public boolean save(StudentDto studentdto) {
			
		PreparedStatement ps;
		Connection con;
		try {
      			

			
		     Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver loaded successfully");

	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentData","root", "root");
	            System.out.println("Connection created successfully");
			
			
			ps=con.prepareStatement(" INSERT INTO data1 (name, email, phone, password, branch) VALUES (?,?,?,?,?)");
		
		   ps.setString(1, studentdto.getName());
		   ps.setString(2, studentdto.getEmail());
		   ps.setString(3, studentdto.getPhone());
		   ps.setString(4, studentdto.getPassword());
		   ps.setString(5, studentdto.getBranch());
			
		   int row= ps.executeUpdate();
		   if(row>0) {
			   
			   System.out.println("Done");
		   }
		 
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return true;
	}
	
}
