package Diff_web;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver d= new FirefoxDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		Thread.sleep(5000);
		
		// d.navigate().to
		d.navigate().to("http://techbuzzbusinessgroup.com/office/attendence_home.php");
		Thread.sleep(5000);
		
		// back to the previous url
		d.navigate().back();
		Thread.sleep(5000);
		
		// forward page
		d.navigate().forward();
		Thread.sleep(5000);
        d.get("https://www.google.com/");
		
        // to refresh/reload the page
		d.navigate().refresh();
		
		// change the dimension of the browser
		Dimension dm= new Dimension(981,1047);
	    d.manage().window().setSize(dm);
	    Thread.sleep(5000);
	    
	    // to set the browsers position
	    Point p= new Point(80,90);
	    d.manage().window().setPosition(p);
	    Thread.sleep(5000);
	}

}
