package package_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_xpath {

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://www.freecrm.com/index.html");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//button[@type='button' and @class='btn']")).click();
		//d.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		//d.findElement(By.xpath("//Select[@name='payment_plan_id']")).click();
        //d.findElement(By.xpath("//Option[@value='1']")).click();
        //d.findElement(By.xpath("//input[@name='first_name']")).sendKeys("bhushan");
		//List <WebElement> linklist = d.findElements(By.tagName("a"));
		List <WebElement> inputlist = d.findElements(By.tagName("input"));
		System.out.println(inputlist.size());
	}

}
