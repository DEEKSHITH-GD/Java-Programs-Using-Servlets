package com.destination;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/akshu")
public class Program extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name= req.getParameter("your_name");
		PrintWriter writer = resp.getWriter();
		writer.println(name);
	}
}
