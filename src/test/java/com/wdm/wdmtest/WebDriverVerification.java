package com.wdm.wdmtest;

import junit.framework.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverVerification extends BaseClassTest {
	
	 

	@Test
	public void WebDriverManagerTest()
	    {
	         Assert.assertTrue(true);
	    }
	
	@Test
	public void WebDriverManagerTest2()
	    {
	         Assert.assertTrue(false);
	    }
	
	
	
	@Test
	public void WebDriverManagerTest3()
	    {
	         Assert.assertTrue(true);
	    }
	
	
	@Test
	public void WebDriverManagerTest4()
	    {
	         Assert.assertTrue(false);
	    }
	
	
}

