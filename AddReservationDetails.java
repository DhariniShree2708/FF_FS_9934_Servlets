package com.hcl.day35;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddReservationDetails
 */
@WebServlet("/AddReservationDetails")
public class AddReservationDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList<ArrayList> details = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddReservationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AddReservationDetails addDetails = new AddReservationDetails() ;
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><head><title>");
		pw.println("Welcome to Hotel Reservation Portal!!");
		pw.println("</title></head><body>");
		pw.println("<p>Add Reservation Details:<p>");
		ArrayList<String> hotelDetails = new ArrayList<>();
		hotelDetails.add(request.getParameter("Date of Accomodating Rooms"));
		hotelDetails.add(request.getParameter("Date of Vacating Rooms"));
		hotelDetails.add(request.getParameter("Name"));
		hotelDetails.add(request.getParameter("Status"));
		hotelDetails.add(request.getParameter("Price (INR)"));
		for (String i : hotelDetails)
			pw.println(i + "<br />");
		addDetails.details.add(hotelDetails);
		pw.println("<p>Reservation Details Added Successfully!</p>");
		pw.println("<h2>Thanks and Visit Again!!</h2>");
		pw.println("<a href=\"index.html\">Home Page</a>");
		pw.println("</body></html>");
		pw.close();
		//hotelDetails = null;

	}

}
