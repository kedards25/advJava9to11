package com.learning.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessData
 */
@WebServlet("/ProcessData")
public class ProcessData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Receiving values from HTML form
		String nm=request.getParameter("usrName");
		String adr=request.getParameter("usrAddr");
		String email=request.getParameter("usrMail");
		
		//Creating object of Model class and assigning values to variables using
		//parameterized constructor
		DataModel model=new DataModel(nm, adr, email);
		
		
		//when we want to pass value from one servlet to other
		//we can pass it as part of request by setting it as an attribute of request
		//while setting the value in the form of Key-Value pair
		//request.setAttribute("star", Prajjwel);
		//request.setAttribute("key", value);
		request.setAttribute("DataObj", model);
		//in above line we are setting the object of DataModel class
		//as attribute of request and key to retrieve the value is "DataObj"
		
		//Using RequestDispatcher we are navigating to next servlet called as ShowDetails
		RequestDispatcher dispatcher=request.getRequestDispatcher("ShowDetails");
		//in following line we are forwarding the control to ShowDetails
		//using forward() method,which in turn is accepting request and response as a parameter
		//and in line no 43 we are setting the attribute as key-value pair
		//so when control navigates to ShowDetails Key-Value pair will also be sent
		// as a part of request embeded in forward() method
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
