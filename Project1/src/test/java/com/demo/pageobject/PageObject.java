package com.demo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefiniation.BaseClass;

public class PageObject extends BaseClass{

	public WebDriver driver;
	public PageObject(WebDriver ndriver) {
			
		driver = ndriver;
		PageFactory.initElements(ndriver, this);
		
	}
	
	@FindBy(id ="userid")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//button[@class='button-orange wide']")
	@CacheLookup
	WebElement login;
	
	public void openHonmePage(String URL) {
		
		driver.get(URL);
		
	}
	
	public void enterUserName(String Username) {
		
		username.sendKeys(Username);		
		
	}
	
	public void enterPassword(String Password) {
	
		password.sendKeys(Password);
		
	}
	
	public void clickLogin() {
		login.click();
	}
	

}
