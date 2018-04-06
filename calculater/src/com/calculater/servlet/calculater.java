package com.calculater.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.calculater.model.operation;

/**
 * Servlet implementation class calculater
 */
@WebServlet("/calculater")
public class calculater extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculater() {
        super();
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
				int num1 = Integer.parseInt(request.getParameter("num1"));
				 int num2 = Integer.parseInt(request.getParameter("num2"));
				 String operator = request.getParameter("operator");
				 operation calcul = new operation();
				 double result = calcul.calcul(operator, num1, num2);
				 request.setAttribute("result", result);
		
		
	this.getServletContext().getRequestDispatcher("/WEB-INF/calculater.jsp").forward(request, response);

	 
	}

}
