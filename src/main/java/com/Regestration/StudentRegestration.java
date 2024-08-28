package com.Regestration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regetration")
public class StudentRegestration extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		out.print("<html>");

		out.print("<head>");
		out.print("<style>");
		out.print("body { font-family: Arial, sans-serif; margin: 20px; }");
		out.print("label { display: inline-block; width: 100px; margin-bottom: 10px; }");
		out.print("input[type='text'], input[type='email'], input[type='phone'] { width: 200px; padding: 5px; }");
		out.print("input[type='submit'] { margin-top: 20px; padding: 10px 20px; background-color: #4CAF50; color: white; border: none; cursor: pointer; }");
		out.print("input[type='submit']:hover { background-color: #45a049; }");
		out.print("</style>");
		out.print("</head>");

		out.print("<body>");
		out.print("<form action='/StudentRegestrationDTO/data' method='get'>");

		out.print("<label for='name'>Name :</label>");
		out.print("<input type='text' name='name'>");
		out.print("<br>");

		out.print("<label for='email'>Email :</label>");
		out.print("<input type='email' name='email'>");
		out.print("<br>");

		out.print("<label for='phone'>Phone :</label>");
		out.print("<input type='phone' name='phone'>");
		out.print("<br>");

		out.print("<label for='password'>Password :</label>");
		out.print("<input type='text' name='password'>");
		out.print("<br>");

		out.print("<label for='branch'>Branch :</label>");
		out.print("<input type='text' name='branch'>");
		out.print("<br>");

		out.print("<input type='submit' value='Register'>");
		out.print("</form>");
		out.print("</body>");

		out.print("</html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		out.print("<html>");
		
		out.print("<head>");
		out.print("</head>");
		
		//out.print("<form action ='/StudentRegestrationDTO/data' method= 'post'>");
//		out.print("<form action='/StudentRegestrationDTO/data'>");
        out.print("<form action='/StudentRegestrationDTO/data' method='get'>");

		
		out.print("<label for 'name'> Name :</label>");
		out.print("<input type='text' name=name>");
		out.print("<br>");
		out.print("</br>");
		
		out.print("<label for 'email'> Email :</label>");
		out.print("<input type='email' name=email>");
		out.print("<br>");
		out.print("</br>");
		
		out.print("<label for 'phone'> Phone :</label>");
		out.print("<input type='phone' name=phone>");
		out.print("<br>");
		out.print("</br>");
		
		out.print("<label for 'password'> Password :</label>");
		out.print("<input type='text' name=password>");
		out.print("<br>");
		out.print("</br>");
		
		out.print("<label for 'branch'> Branch :</label>");
		out.print("<input type='text' name=branch>");
		out.print("<br>");
		out.print("</br>");
		
		out.println("<input type='submit' value=Regeater>");
		out.print("</form>");
		out.print("<html>");
		
		*/
	}
	
}
