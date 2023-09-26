package com.destination;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Multiplication")
public class Multiplication extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		int mul = n1*n2;
		req.setAttribute("mul_temp", mul);
		RequestDispatcher m = req.getRequestDispatcher("Subtraction");
		m.forward(req,resp);
	}

}