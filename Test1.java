package test.ng;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


public class Test1 

{
	
/*
	@Test
	
public void f()

	{
		
System.out.println("Method F");

	}
	
	
@AfterClass
	
public void ac()
	
{
		
System.out.println("After Class");
	
}
	
	
@BeforeClass
	
public void bc()
	
{
		
System.out.println("Before Class");
	
}
	
	
@BeforeTest
	
public void bt()
	
{
		
System.out.println("Before Test");
	
}
	
	
@BeforeMethod
	
public void bm()
	
{
		
System.out.println("Before Method");

}
	
	
@AfterTest
	
public void at()
	
{
		
System.out.println("After Test");
	
}
	
	
@AfterMethod
	
public void am()
	
{
		
System.out.println("After Method");
	
}
	
	
@Test
	public void s()
	
{
		
System.out.println("Method S");
	
}*/
	
	
WebDriver w;
	
@BeforeTest
	
public void openBrowser()
	
{
		
System.setProperty("webdriver.gecko.driver", "P:\\TECHNOLEARN TRAININGS\\SELENIUM\\geckodriver.exe");
		
w=new FirefoxDriver();
		
		
w.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	
}
	
	
@Test
	public void data1()
	
{
		
w.findElement(By.name("login")).sendKeys("qwert");
		
w.findElement(By.id("password")).sendKeys("456464");
	
}
	
	
@Test(priority=50)
	
public void data2() throws InterruptedException
	
{
		
w.findElement(By.id("remember")).click();
		
//Thread.sleep(2000);
		
		
//w.findElement(By.name("proceed")).click();
		
		
Thread.sleep(5000);
	
}
	
	
	
@AfterTest
	
public void navigate()
	
{
		
//w.navigate().to("http://www.google.com");
		
//w.close();
		
	
}
	

}
