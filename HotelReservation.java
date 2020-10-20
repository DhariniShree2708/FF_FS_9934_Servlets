package com.hcl.day35;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HotelReservation
 */
@WebServlet("/showDetails")
public class HotelReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList<ArrayList> details = new ArrayList<>();
	/**
	 * Default constructor.
	 */
	public HotelReservation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");// setting the content type
		PrintWriter pw = response.getWriter(); // get the stream to write the data
		
		if(request.getParameter("type").equals("List")) {
			response.setContentType("text/html");
			PrintWriter prw = response.getWriter();
			prw.println("<html><head>");
			pw.println("Welcome to Hotel Reservation System!!");
			pw.println("</head><body>");
			if(details.isEmpty()) {
				pw.println("No List Available!");
			}
			else {
				pw.println("<table><tr>");
				pw.println("<th>Date of Accomodating Rooms: </th>");
				pw.println("<th>Date of Vacating Rooms: </th>");
				pw.println("<th>Name: </th>");
				pw.println("<th>Status: </th>");
				pw.println("<th>Price (INR): </th></tr>");
					Object det;
					//for(ArrayList details : ) {
						for(Object name:details) 
							pw.println("<td>"+name+"</td>");
						
					}
					pw.println("</table>");	
			pw.println("<h2>Thanks and Visit Again!!</h2>");
			pw.println("<a href=\"index.html\">Home Page</a>");
			pw.close();
			}
		else {
			RequestDispatcher rds =request.getRequestDispatcher("/AddReservationDetails");
			rds.forward(request,response);
		}
		}
	}
