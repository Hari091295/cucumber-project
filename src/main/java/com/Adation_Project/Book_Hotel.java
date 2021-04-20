package com.Adation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	public WebDriver driver;
	@FindBy(id = "first_name")
	private WebElement firstname; 
	public Book_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBillingaddress() {
		return billingaddress;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirydatemonth() {
		return expirydatemonth;
	}

	public WebElement getExpirydateyear() {
		return expirydateyear;
	}

	public WebElement getCvvno() {
		return cvvno;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	{
		

	}
	@FindBy(id = "last_name")
	private WebElement lastname; {
		
	}
	@FindBy(id = "address")
	private WebElement billingaddress; {


	}
	@FindBy(id = "cc_num")
	private WebElement creditcardno; {
		

	}
	@FindBy(id = "cc_type")
	private WebElement creditcardtype; {
		

	}
	@FindBy(id = "cc_exp_month")
	private WebElement expirydatemonth; {
		
	}
	@FindBy(id = "cc_exp_year")
	private WebElement expirydateyear; {
		

	}
	@FindBy(id = "cc_cvv")
	private WebElement cvvno; {
		

	}
	@FindBy(id = "book_now")
	private WebElement booknow; {
		
	}
		
	

}
