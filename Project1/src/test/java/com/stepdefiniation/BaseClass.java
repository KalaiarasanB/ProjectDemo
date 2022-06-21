package com.stepdefiniation;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.demo.pageobject.PageObject;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public  WebDriver driver;
	public static PageObject po;
	public static Properties prop;
	public static FileReader fr;
	
	@Before
	public void openBrowser() throws IOException {		
		prop = new Properties();		
		FileReader fr = new FileReader("D:\\Kalai_Auto\\Project1\\src\\test\\resources\\config.properties");
		prop.load(fr);
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(prop.getProperty("testurl"));
}
}
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}
	
	
}