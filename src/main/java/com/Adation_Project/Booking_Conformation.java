package com.Adation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Conformation {
	public WebDriver driver;
	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement bookconform; 
	public Booking_Conformation(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}


	public WebElement getBookconform() {
		return bookconform;
	}


	{
		

	}
	

}
