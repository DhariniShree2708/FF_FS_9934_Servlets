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
 * Servlet implementation class HotelReservation
 */
@WebServlet("/AddReservation")
public class AddReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static ArrayList<HotelReservation> details = new ArrayList<>();

	public AddReservation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AddReservation list = new AddReservation();
		int count = 0;
		response.setContentType("text/html");// setting the content type
		PrintWriter pw = response.getWriter(); // get the stream to write the data
		String title = "Welcome to Hotel Reservation Portal!";
		String doctype = ("<!DOCTYPE HTML>");
		pw.println(doctype + "<html>\n" + "<head><title>" + title + "</title></head><body>");
		pw.println("<p>Add Hotel Reservation Details:<p>");
		for (HotelReservation list1 :details) {
			if (list1.getName().equals(request.getParameter("Name"))) {
				list1.setCheckinDate(request.getParameter("Checkin Date"));
				list1.setCheckoutDate(request.getParameter("Checkout Date"));
				list1.setStatus(request.getParameter("Status"));
				list1.setPrice(request.getParameter("Price"));
				count = 1;
				break;
			}
		}
		if (count == 0) {
			details.add(new HotelReservation(request.getParameter("Checkin Date"),
					request.getParameter("Checkout Date"), request.getParameter("Name"),
					request.getParameter("Status"), request.getParameter("Price")));
			//for(HotelReservation listt :details) {
				//pw.println(listt);
			//}
		}
		pw.println("<p>Reservation Details Added Successfully!<p>");
		pw.println("</body></html>");
		pw.println("<h2>Thanks! Visit Again!</h2>");
		pw.println("<a href=\"index.jsp\">Home Page</a>");
		pw.close();

	}

}
