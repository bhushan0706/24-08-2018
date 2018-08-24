package package_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Test 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.apple.com/in/iphone-8/specs/");
		String s=d.getCurrentUrl();
		System.out.println(s);
		String title=d.getTitle();
		System.out.println(title);
		if(title.equals("iPhone 8 - technical Specifications - apple (IN)"))
		{
			System.out.println("web page is displayed");
		}
		else
		{
			System.out.println("web page is not displayed");
		}
		if(title.contains("8"))
		{
			System.out.println("title page is displayed");
		
		}
		else
		{
			System.out.println("title page is not displayed");
		}
		if(title.equalsIgnoreCase("iPhone 8 - technical specifications - apple (IN)"))
		{
			System.out.println("it is accepted");
		}
		else
		{
			System.out.println("it is not accepted");
		}
		
	}
	
}
