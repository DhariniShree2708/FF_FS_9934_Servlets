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
@WebServlet("/ListReservation")
public class ListReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//static ArrayList<HotelReservation> details = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body>");
		pw.println("<p><center>Welcome to Hotel Reservation Portal!!<p>");
		pw.println("The Reservation Details:");
		if (AddReservation.details.isEmpty()) {
			pw.println("<h3>" + "No Data Exists" + "</h3>");

		} else {
			pw.println("<table border=\"5\">" + "<tr><th>Checkin Date</th>"
					+ "<th>Checkout Date</th>" + "<th>Name</th>" + "<th>Status</th>" + "<th>Price</th></tr>");
			for (HotelReservation list1 : AddReservation.details) {
				pw.println("<tr><td>" + list1.getCheckinDate() + "</td>" + "<td>" + list1.getCheckoutDate() + "</td>" + "<td>"
						+ list1.getName() + "</td>" + "<td>" + list1.getStatus() + "</td>" + "<td>" + list1.getPrice()
						+ "</td>" + "<td>" + "<a href=\"/HotelReservationApp/form.jsp\">" + "Edit"
						+ "<a href=\"/HotelReservationApp/delete.jsp\">" + "|| Delete" + "</a>");
				pw.println("</tr></table>");
			}
			pw.println("<a href=\"index.jsp\">Home Page</a>");
			pw.println("</body></html>");

		}

	}

}