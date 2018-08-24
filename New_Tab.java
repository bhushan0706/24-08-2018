package tab;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New_Tab {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d= new FirefoxDriver();
		d.get("https://www.google.com");
		// to open the new window
		d.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL+"t");
		Thread.sleep(10000);
		
		// to open the new browser
		d.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL+"n");
		Thread.sleep(5000);
        
		// to close the window
		d.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL+"w");
		Thread.sleep(5000);
	}

}
