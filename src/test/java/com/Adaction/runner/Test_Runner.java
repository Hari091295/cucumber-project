package com.Adaction.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adation_Project.Baseclass;

import adaction.helper.File_Reader_Manager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adaction//featurefile",glue = "com.adation.stepdefinition",monochrome=true,
tags = ("@Smoketest,@Sanitytest"),
plugin = {"html:Reports/HTML_Reports","pretty","json:Reports/json_Report" ,
		"com.cucumber.listener.ExtentCucumberFormatter:Report/Extentreports.html"
		}
)

public class Test_Runner {
	public static WebDriver driver; //Null driver
	@BeforeClass
	public static void set_Up() throws Throwable {
		//driver=Baseclass.getbrowser("chrome");
	String launch = File_Reader_Manager.getInstance().getInstanceCR().getBrowser();
	driver=Baseclass.getbrowser(launch);
		Thread.sleep(5000);
		}
	public static void tear_Down() {
		driver.close();
		
	}
	
	

}
