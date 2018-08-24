package package_selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Tools {

	public static void main(String args[])
	{
		// to launch browser & maximize the window
		FirefoxDriver d= new FirefoxDriver();
		
		d.manage().window().maximize();
		
		d.get("https://www.apple.com/in/");
		
		// to get the Current Url & save it
		String s=d.getCurrentUrl();
		System.out.println(s);
		
		// to get Title
        String t=d.getTitle();
        System.out.println(t);
        
        // string verification "equals"
         if(t.equals("Apple (India)"))
         {
        	 System.out.println("web page is displayed");
         }
         else
         {
        	 System.out.println("web page is not displayed");
         }
        
         // string verification "contains"
         if(t.contains("ppl"))
         {
        	 System.out.println("it is apple");
         }
         else
         {
        	 System.out.println("it is not");
         }
         
         // string verification "equalsIgnoreCase"
         if(t.equalsIgnoreCase("apple (india)"))
         {
        	 System.out.println("web page is showing");
         }
         else
         {
        	 System.out.println("web page is not showing");
         }
	}
	

}
