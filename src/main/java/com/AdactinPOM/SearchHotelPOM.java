package com.AdactinPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.InterfaceValues.HotelSearchPage;


public class SearchHotelPOM extends BaseClass implements HotelSearchPage{
	static WebDriver driver;

	 public  SearchHotelPOM (WebDriver driver) {
	     this.driver =driver;
	     PageFactory.initElements(driver, this);
	 }
	@FindBy(id=location_id)
	private WebElement locationId;
	
	@FindBy(id=hotels_id)
	private WebElement hotels;
	
	@FindBy(xpath=roomType_Xpath)
	private WebElement roomType;
	
	@FindBy(xpath=rooms_Xpath)
	private WebElement noOfRooms;
	
	@FindBy(id=adults_id)
	private WebElement adultPerRoom;
	
	@FindBy(id=child_id)
	private WebElement childrenPerRoom;
	
	@FindBy(id=search_id)
	private WebElement search;
	

public void getLocation(String locationSeletion) {
	     selectDropDownOption(driver,locationId,"value",locationSeletion);
}
		public void getSearchhotel() {
			click(driver,search);
}

}
