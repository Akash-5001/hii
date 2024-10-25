package com.StepDefinition;

import com.AdactinPOM.BaseClass;
import com.POM_Manager.PageObjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDefinition extends BaseClass {

	PageObjectmanager pm = new PageObjectmanager();

	@Given("User can Launch the Browser and the {string}")
	public void user_can_launch_the_browser_and_the(String url) throws Exception {
		getBrowser(pm.getConfigReader().getProperty("browser"));
		urlLaunch(pm.getConfigReader().getProperty(url));

	}

	@When("User enter the adactin {string} in the usename field")
	public void user_enter_the_adactin_in_the_usename_field(String username) {
		pm.getLoginPage().getUsername(pm.getConfigReader().getProperty(username));
	}

	@When("User enter the adactin {string} in the password field")
	public void user_enter_the_adactin_in_the_password_field(String password) {
		pm.getLoginPage().getPassword(pm.getConfigReader().getProperty(password));
	}

	@When("User click the adactin Login button")
	public void user_click_the_adactin_login_button() {
		pm.getLoginPage().getLogin();
	}

	@Then("User landed in search hotel page")
	public void user_landed_in_search_hotel_page() {
		System.out.println("User successgully landed on search hotel page");
	}

	@When("User selected the {string}")
	public void user_selected_the(String location) {
		pm.getsearch().getLocation(location);
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
		pm.getsearch().getSearchhotel();
	}

	@Then("User landed on select hotel page")
	public void user_landed_on_select_hotel_page() {
		System.out.println("User successfully landed on select hotel page");
	}

	@Then("User Terminate the Browser")
	public void user_terminate_the_browser() {
		quit();
	}
}
