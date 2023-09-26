package com.destination;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Subtraction")
public class Subtraction extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		System.out.println(n1);
		int sub = n1-n2;
		System.out.println(sub);
		req.setAttribute("sub_temp", sub);
		RequestDispatcher s = req.getRequestDispatcher("Division");
		s.forward(req,resp);
	}

}