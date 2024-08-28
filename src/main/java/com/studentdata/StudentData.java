package com.studentdata;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Regestration.Dto.StudentDto;
import com.Regestration.service.StudentService;

@WebServlet("/data")
public class StudentData extends HttpServlet {


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		  String name= req.getParameter("name");
		  String email=req.getParameter("email");
		  String phone=req.getParameter("phone");
		  String password= req.getParameter("password");
		  String branch= req.getParameter("branch");
		  
		  StudentDto data= new StudentDto();
		  
		  data.setName(name);
		  data.setEmail(email);
		  data.setPhone(phone);
		  data.setPassword(password);
		  data.setBranch(branch);
		  
		  StudentService service =new StudentService();
		  
		  boolean isregester= service.save(data);
		  
		  if(isregester) {
			    
			  out.println("<h1>regester successfully<h1>");
		  }
		  else {
			  
			  
			  out.println("<regester not successfully>");
		  }  
    }
}
	


