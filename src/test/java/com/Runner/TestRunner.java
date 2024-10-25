package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src\\test\\java\\com\\featureFiles\\AdactinHotel.feature",

		glue = {"com.StepDefinition"},

		plugin = { "html:LoginPageHTMLReport/LoginPage.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }

)
public class TestRunner {

}
