package package_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_1 {

	public static void main(String[] args) 
	{
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("http://techbuzzbusinessgroup.com/demo/nrvg/packaging/");
		d.manage().window().maximize();
		d.findElement(By.id("name")).sendKeys("bhushan");
		
	}

}
