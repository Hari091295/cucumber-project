package com.Adation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//select[@class='search_combobox']")
	private WebElement Location;
	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomno() {
		return Roomno;
	}

	public WebElement getCheckin() {
		return Checkin;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getAdultroom() {
		return Adultroom;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	{
		

	}
	@FindBy(id = "hotels")
	private WebElement Hotel;{
		
		
	}
	@FindBy(id = "room_type")
	private WebElement Roomtype; {
		

	}
	@FindBy(id = "room_nos")
	private WebElement Roomno; {
		

	}
	@FindBy(id = "datepick_in")
	private WebElement Checkin; {
		

	}
	@FindBy(id = "datepick_out")
	private WebElement Checkout; {
		
	}
	@FindBy(id = "adult_room")
	private WebElement Adultroom; {
	

	}
	@FindBy(id = "child_room")
	private WebElement Childroom; {
		

	}
	@FindBy(id = "Submit")
	private WebElement Submit; {
		
	}

}
