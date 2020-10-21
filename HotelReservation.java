package com.hcl.day35;

import java.util.Date;

/**
 * 
 */

public class HotelReservation {
	private String checkinDate;
	private String checkoutDate;
	private String name;
	private String status;
	private String price;

	/**
	 * @param fromDate
	 * @param toDate
	 * @param name
	 * @param status
	 * @param price
	 */
	public HotelReservation(String checkinDate, String checkoutDate, String name, String status, String price) {
		super();
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
		this.name = name;
		this.status = status;
		this.price = price;
	}

	/**
	 * @return the fromDate
	 */
	public String getCheckinDate() {
		return checkinDate;
	}

	/**
	 * @param string the fromDate to set
	 */
	public void setCheckinDate(String string) {
		this.checkinDate = string;
	}

	/**
	 * @return the toDate
	 */
	public String getCheckoutDate() {
		return checkoutDate;
	}

	/**
	 * @param string the toDate to set
	 */
	public void setCheckoutDate(String string) {
		this.checkoutDate = string;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param string the price to set
	 */
	public void setPrice(String string) {
		this.price = string;
	}

}
