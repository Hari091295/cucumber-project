package adaction.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adation_Project.Book_Hotel;
import com.Adation_Project.Booking_Conformation;
import com.Adation_Project.Login_Page;
import com.Adation_Project.Logout_Page;
import com.Adation_Project.Search_Hotel;
import com.Adation_Project.Select_Hotel;

public class PageObjectManager {
	public WebDriver driver;
	private Login_Page login;
	private Search_Hotel search;
	private Select_Hotel select;
	private Book_Hotel bookhotel;
	private Booking_Conformation bookconform;
	private Logout_Page logout;
	
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public  Login_Page getInstanceLogin() {
		login=new Login_Page(driver);
		return login;
}
	public Search_Hotel getInstanceSearch() {
		search=new Search_Hotel(driver);
		return search;
		
	}
	public Select_Hotel getInstanceSelect() {
		select=new Select_Hotel(driver);
		return select;

	}
	public Book_Hotel getInstanceBookhotel() {
		bookhotel=new Book_Hotel(driver);
		return bookhotel;
		}
	public Booking_Conformation getInstanceBookconform() {
		bookconform=new Booking_Conformation(driver);
		return bookconform;
		}
	public Logout_Page getInstanceLogout() {
		logout=new Logout_Page(driver);
		return logout;
		

	}
	

}
