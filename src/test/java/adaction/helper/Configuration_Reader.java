package adaction.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable  {
		File f=new File("C:\\Users\\Suriya prasath j\\eclipse-workspace\\Adation_Project\\src\\test\\java\\adaction\\configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		 p=new Properties();
		//load
		p.load(fis);
		}
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
		}
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
}
	public String getCvv() {
		String cvv = p.getProperty("db_Cvv");
		return cvv;
		}
	 public String getCreditCardNumber() {
		 String cardnumber = p.getProperty("db_Cardno");
return cardnumber;
}
	 public String getCreditCardType() {
		String cardtype = p.getProperty("db_Credit_Card_Type");
		return cardtype;

	}
	 public String getBillingAddress() {
		String billaddress = p.getProperty("billing_Address");
return billaddress;
	}
	
	
	
}
