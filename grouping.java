package test.ng;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterGroups;

import org.testng.annotations.BeforeGroups;

import org.testng.annotations.Test;


public class grouping
 {
	
WebDriver w;
  
@Test(groups={"one"})
  
public void f() 
  
{
	  
System.out.println("Group One Test");
	 
System.setProperty("webdriver.gecko.driver","P://TECHNOLEARN TRAININGS/SELENIUM/geckodriver.exe");
	  
w=new FirefoxDriver();
	  
w.get("http://www.google.com");
  
}
  
 
 @Test(groups={"two","one"})
  public void q()
  
{
	  
System.out.println("Group One and Two Test");
	 
 System.setProperty("webdriver.gecko.driver","P://TECHNOLEARN TRAININGS/SELENIUM/geckodriver.exe");
	 
 w=new FirefoxDriver();
	  
w.get("http://www.facebook.com");
  
}
  
 
 @Test(groups={"two"})
  public void e()
  
{
	  
System.out.println("Group Two Test");
	 
 System.setProperty("webdriver.gecko.driver","P://TECHNOLEARN TRAININGS/SELENIUM/geckodriver.exe");
	
  w=new FirefoxDriver();
	  
  w.get("http://www.yahoo.com");
  
}
  
 
 @Test(groups={"one"})
  public void t()
 
 {
	  
System.out.println("Group One Test");
	  
System.setProperty("webdriver.gecko.driver","P://TECHNOLEARN TRAININGS/SELENIUM/geckodriver.exe");
	 
 w=new FirefoxDriver();
	  
 w.get("http://www.gmail.com");
 
 }
 
/*@BeforeGroups(groups={"one","two"})
  
public void bg()
  
{
	  
	  
System.out.println("Before Group Method");
 
 }
  
 
 @AfterGroups(groups={"one","two"})
  
public void ag()
  
{
	  
System.out.println("After Groups Method");
  
}
 */

}
