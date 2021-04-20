package com.adation.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Adaction.runner.Test_Runner;
import com.Adation_Project.Baseclass;
import com.Adation_Project.Book_Hotel;
import com.Adation_Project.Booking_Conformation;
//import com.Adation_Project.Login_Page;
import com.Adation_Project.Logout_Page;
import com.Adation_Project.Search_Hotel;
import com.Adation_Project.Select_Hotel;

import adaction.helper.File_Reader_Manager;
import adaction.helper.PageObjectManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Baseclass {
	private static final String type = null;
	public static WebDriver driver=Test_Runner.driver;
	//public static Login_Page login=new Login_Page(driver);
	//public static Search_Hotel searchhotel=new Search_Hotel(driver);
	//public static Select_Hotel selecthotel=new Select_Hotel(driver);
	//public static Book_Hotel bookhotel=new Book_Hotel(driver);
	//public static Booking_Conformation bookconform=new Booking_Conformation(driver);
	//public static Logout_Page logout=new Logout_Page(driver);
	
	
	public static PageObjectManager pom=new PageObjectManager(driver);
	

@Given("^user Launch The Application$")
public void user_Launch_The_Application() throws Throwable {
	//geturl("https://adactinhotelapp.com/");
	String url = File_Reader_Manager.getInstance().getInstanceCR().getUrl();
   geturl(url);
	
}

@When("^user Enter The \"([^\"]*)\" In Textbox$")
public void user_Enter_The_In_Textbox(String Username) throws Throwable {
	inputvalueelement(pom.getInstanceLogin().getUser(),Username );
	
    
}

@When("^user Enter The \"([^\"]*)\" In Password Textbox$")
public void user_Enter_The_In_Password_Textbox(String Password) throws Throwable {
	inputvalueelement(pom.getInstanceLogin().getPassword(),Password);
    
}
@Then("^user Click On Login Button And It Navigate To The Search Hotel Page$")
public void user_Click_On_Login_Button_And_It_Navigate_To_The_Search_Hotel_Page() throws Throwable {
	//clickonelement(login.getLogin_btn());
	clickonelement(pom.getInstanceLogin().getLogin_btn());
	
   
}

@When("^user Enter The Location In Location Textbox$")
public void user_Enter_The_Location_In_Location_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceSearch().getLocation(), "Sydney", "byvisibletext");
   
}

@When("^user Enter The Hotel Name In Hotel Select Textbox$")
public void user_Enter_The_Hotel_Name_In_Hotel_Select_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceSearch().getHotel(), "Hotel Sunshine", "byvisibletext");
    
}

@When("^user Enter The Room Type In The Room Type Textbox$")
public void user_Enter_The_Room_Type_In_The_Room_Type_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceSearch().getRoomtype(), "Double", "byvisibletext");
   
}

@When("^user Enter The No Of Rooms In The Room No Textbox$")
public void user_Enter_The_No_Of_Rooms_In_The_Room_No_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceSearch().getRoomno(), "4", "byvalue");
    
}

@When("^user Enter The Checkindate In Checkindate Textbox$")
public void user_Enter_The_Checkindate_In_Checkindate_Textbox() throws Throwable {
	inputvalueelement(pom.getInstanceSearch().getCheckin(), "13/04/2021");
    
}

@When("^user Enter The Checkoutdate In Checkoutdate Textbox$")
public void user_Enter_The_Checkoutdate_In_Checkoutdate_Textbox() throws Throwable {
	inputvalueelement(pom.getInstanceSearch().getCheckout(), "14/04/2021");
    
}

@When("^user Enter The Adultperroom In Adultperroom Textbox$")
public void user_Enter_The_Adultperroom_In_Adultperroom_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceSearch().getAdultroom(), "byvalue", "3");
    
}
@When("^user Enter The Childrenperroom In Childrenperroom Textbox$")
public void user_Enter_The_Childrenperroom_In_Childrenperroom_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceSearch().getChildroom(), "byvalue", "3");
   
}


@Then("^user Click On Searchbutton And It Navigate To The Select Hotel Page$")
public void user_Click_On_Searchbutton_And_It_Navigate_To_The_Select_Hotel_Page() throws Throwable {
	clickonelement(pom.getInstanceSearch().getSubmit());
	
    
}

@When("^user Select The Hotel With Respective Particulars In Select Bullet Icon$")
public void user_Select_The_Hotel_With_Respective_Particulars_In_Select_Bullet_Icon() throws Throwable {
	clickonelement(pom.getInstanceSelect().getSelectbtn());
   
}

@Then("^user Click On Continuebutton And It Navigate To The Book Hotel Page$")
public void user_Click_On_Continuebutton_And_It_Navigate_To_The_Book_Hotel_Page() throws Throwable {
	clickonelement(pom.getInstanceSelect().getContinue());
    
}

@When("^user Enter The First Name In First Name Textbox$")
public void user_Enter_The_First_Name_In_First_Name_Textbox() throws Throwable {
	inputvalueelement(pom.getInstanceBookhotel().getFirstname(), "jayakumar");
    
}

@When("^user Enter The Last Name In Last Name Textbox$")
public void user_Enter_The_Last_Name_In_Last_Name_Textbox() throws Throwable {
	inputvalueelement(pom.getInstanceBookhotel().getLastname(), "Hariprasath");
    
}

@When("^user Enter The Billing Address In Billing Address Textbox$")
public void user_Enter_The_Billing_Address_In_Billing_Address_Textbox() throws Throwable {
	//inputvalueelement(bookhotel.getBillingaddress(), "no 16 paul wargees street");
	String billingAddress = File_Reader_Manager.getInstance().getInstanceCR().getBillingAddress();
	inputvalueelement(pom.getInstanceBookhotel().getBillingaddress(), billingAddress);
    
}

@When("^user Enter The Credit Card No In Creditcard Textbox$")
public void user_Enter_The_Credit_Card_No_In_Creditcard_Textbox() throws Throwable {
	//inputvalueelement(bookhotel.getCreditcardno(), "1254789612567852");
	String creditCardNumber = File_Reader_Manager.getInstance().getInstanceCR().getCreditCardNumber();
	inputvalueelement(pom.getInstanceBookhotel().getCreditcardno(),creditCardNumber);
   
}

@When("^user Enter The Card Type In Card Type Textbox$")
public void user_Enter_The_Card_Type_In_Card_Type_Textbox() throws Throwable {
	//dropdownselect(bookhotel.getCreditcardtype(), "VISA", "byvisibletext");
	String creditCardType = File_Reader_Manager.getInstance().getInstanceCR().getCreditCardType();
	dropdownselect(pom.getInstanceBookhotel().getCreditcardtype(), creditCardType,"byvisibletext");
	
	
    
}

@When("^user Enter The Expirydate Month In Month Textbox$")
public void user_Enter_The_Expirydate_Month_In_Month_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceBookhotel().getExpirydatemonth(),"4", "byvalue");
    
}

@When("^user Enter The Expirydate Year In Year Textbox$")
public void user_Enter_The_Expirydate_Year_In_Year_Textbox() throws Throwable {
	dropdownselect(pom.getInstanceBookhotel().getExpirydateyear(),"2014","byvalue");
    
}

@When("^user Enter The Cvv Number In Cvv Number Textbox$")
public void user_Enter_The_Cvv_Number_In_Cvv_Number_Textbox() throws Throwable {
	//inputvalueelement(bookhotel.getCvvno(), "223");
	String cvv = File_Reader_Manager.getInstance().getInstanceCR().getCvv();
	inputvalueelement(pom.getInstanceBookhotel().getCvvno(), cvv);
    
}

@Then("^user Click On Book Now Button And It Navigate To Booking Confirmation Page$")
public void user_Click_On_Book_Now_Button_And_It_Navigate_To_Booking_Confirmation_Page() throws Throwable {
	clickonelement(pom.getInstanceBookhotel().getBooknow());
	Thread.sleep(5000);
   
}


@Then("^user Click On My Itinerary Button And It Navigate To Booked Itinerary Page$")
public void user_Click_On_My_Itinerary_Button_And_It_Navigate_To_Booked_Itinerary_Page() throws Throwable {
	 
		clickonelement(pom.getInstanceBookconform().getBookconform());
	 
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
	
   
}


@Then("^user Click On Logout Button And It Navigate To The Homepage$")
public void user_Click_On_Logout_Button_And_It_Navigate_To_The_Homepage() throws Throwable {
	clickonelement(pom.getInstanceLogout().getLogout());
    
}



}
