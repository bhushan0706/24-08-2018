package test.test;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Test;


public class DEMO2 

{
	
	
WebDriver w;
  
@Test(priority=5)
  
public void f() 
  
{
	  
System.setProperty("webdriver.gecko.driver","P://TECHNOLEARN TRAININGS/SELENIUM/geckodriver.exe");
		
w=new FirefoxDriver();
		
		
w.get("http://www.google.com");
  
  
  
}
  
  
  
@Test(priority=1)
  public void ie()
  
{
	  	
System.setProperty("webdriver.ie.driver","P://TECHNOLEARN TRAININGS/SELENIUM/IEDriverServer.exe");
		
w=new InternetExplorerDriver();
		
		
		
w.get("http://www.facebook.com");
  
}

}
