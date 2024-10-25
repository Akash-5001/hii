package com.POM_Manager;

import org.openqa.selenium.WebDriver;
import com.AdactinPOM.AdactinLoginPOM;
import com.AdactinPOM.SearchHotelPOM;
import com.ConfigReader.ConfigReader;

public class PageObjectmanager extends com.AdactinPOM.BaseClass {
	
	 static WebDriver driver;

    private AdactinLoginPOM login;
    
	public AdactinLoginPOM getLoginPage() {
		
		if(login==null) {
			login = new AdactinLoginPOM(driver);
		}
		return login;
	}
	
	private SearchHotelPOM searchHotel;
	 
	public SearchHotelPOM getsearch() {
		if(searchHotel==null) {
			searchHotel = new SearchHotelPOM(driver);
		}
		return searchHotel;
	}
	
  private ConfigReader cr;
		 public ConfigReader getConfigReader() {
				if(cr==null) {
					cr = new ConfigReader();
				}
				return cr;
		 }
	 }


	
