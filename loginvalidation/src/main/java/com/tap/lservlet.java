package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class lservlet extends HttpServlet{
	
	int count=3;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String oldpassword="Feb2025";
		String name=req.getParameter("username");
		String newpassword=req.getParameter("password");
		resp.setContentType("text/html");
		
		PrintWriter out=resp.getWriter();
		if (oldpassword.equals(newpassword)) {
			out.println("hi "+name+" welcome to homepage");
		}
		else if(count>0) {
			out.println("<h1>invalid password </h1>"+count+ " attempts remaining");
			RequestDispatcher rd=req.getRequestDispatcher("index.html");
			rd.include(req, resp);
			count--;
		}
		else {
			out.println("Attempts completed");
		}
		}
}
