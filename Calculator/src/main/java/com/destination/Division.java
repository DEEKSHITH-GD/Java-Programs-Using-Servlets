package com.destination;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Division")
public class Division extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int n1 = Integer.parseInt(req.getParameter("n1"));
		int n2 = Integer.parseInt(req.getParameter("n2"));
		int div = n1/n2;
		int add = (int)req.getAttribute("add_temp");
		int sub = (int)req.getAttribute("sub_temp");
		int mul = (int)req.getAttribute("mul_temp");
		PrintWriter w = resp.getWriter();
		w.println("Add : "+add);
		w.println("Sub : "+sub);
		w.println("Mul : "+mul);
		w.println("Div : "+div);
		/*System.out.println("Add : "+add);
		System.out.println("Sub : "+sub);
		System.out.println("Mul : "+mul);
		System.out.println("Div : "+div);*/
	}

}