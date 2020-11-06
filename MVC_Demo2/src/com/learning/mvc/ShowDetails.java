package com.learning.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowDetails
 */
@WebServlet("/ShowDetails")
public class ShowDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//here we shall receive object of model class
		//sent as key(DataObj) of attribute along with request
		//As it is going to return me object of model class
		//receiver type should be of model class only hence we need to Object cast it
		DataModel dataModel=(DataModel) request.getAttribute("DataObj");
		//as dataModel is receiving object sent by ProcessData
		//we can access the values of model class set by the object
		//in line no.39 of ProcessData in this servlet
		//so lets display the same
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h1>Details<h1/>");
		out.print("<h1>Name: "+dataModel.getName()+"<h1/>");
		out.print("<h1>Address: "+dataModel.getAddr()+"<h1/>");
		out.print("<h1>Email Id: "+dataModel.getMail()+"<h1/>");
		
		request.setAttribute("Obj1", dataModel);
		RequestDispatcher dispatcher=request.getRequestDispatcher("DispDetails");
		dispatcher.forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
