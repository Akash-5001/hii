package com.AdactinPOM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.InterfaceValues.LoginPageElements;


public class AdactinLoginPOM extends BaseClass implements LoginPageElements {

	static WebDriver driver;

    public AdactinLoginPOM(WebDriver driver) {
    this.driver =driver;
    PageFactory.initElements(driver, this);
    }


	@FindBy(id=username_id)
	private WebElement username;
	
	@FindBy(name=password_name)
	private WebElement password;
	
	@FindBy(xpath=login_xpath)
	private WebElement loginBtn ;
	
	public void getUsername(String userName) {
		inputValues(driver,username,userName);
	}
	public void getPassword(String PassWord) {
		inputValues(driver,password,PassWord);
	}
	
	
	public void getLogin() {
	click(driver,loginBtn);
	
     }
}

