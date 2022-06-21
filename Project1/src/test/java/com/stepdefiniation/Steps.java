package com.stepdefiniation;
import com.demo.pageobject.PageObject;
import io.cucumber.java.en.*;

public class Steps extends BaseClass{
		
	
		public static PageObject po= new PageObject(driver);
	

	@When("user enters the username {string} and the password {string}")
	public void user_enters_the_username_and_the_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		po.enterUserName(string);
		po.enterPassword(string2);

	}

	@When("user click on login")
	public void user_click_on_login() {
	    // Write code here that turns the phrase above into concrete actions
		po.clickLogin();
	    
	}

	@Then("I verify the title of the page")
	public void i_verify_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	
	


}
