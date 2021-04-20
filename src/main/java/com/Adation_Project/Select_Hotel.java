package com.Adation_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement Selectbtn;
	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this );
	}


	public WebElement getSelectbtn() {
		return Selectbtn;
	}


	public WebElement getContinue() {
		return Continue;
	}


	{
		

	}
	@FindBy(id = "continue")
	private WebElement Continue; {
		

	}

}
