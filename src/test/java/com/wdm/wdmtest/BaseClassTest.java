package com.wdm.wdmtest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClassTest {
	
	
	WebDriver driver;
	@BeforeMethod
	public void WebDriverManagerTest()
	    {
	        //setup the chromedriver using WebDriverManager
	       // WebDriverManager.chromedriver().setup();
	        WebDriverManager.chromedriver().version("2.26").setup();
	        //Create driver object for Chrome
	          driver = new ChromeDriver();
	 
	        //Navigate to a URL
	        driver.get("http://toolsqa.com");
	  
	    }
	
	@AfterMethod
	public void tearDown()
	    {
	         
	 
	        //quit the browser
	        driver.quit();
	    }
	
	

}
