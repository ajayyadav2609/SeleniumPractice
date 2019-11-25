package seleniumdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumfirstprogram {

	public static void main(String[] args) 
	{
		//String ProjectLoacation = System.getProperty("user.dir");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\JavaPractice\\SeleniumPractice\\drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Google"))
		{
			System.out.println("Title passed");
		}
		else
		{
			System.out.println("Title Failed");
		}
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//driver.close();
		driver.quit();
		
		
		
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		
		//String baseURL = "http://demo.guru99.com/test/newtours/";
		
		//String ExpecetdTitle = "Welcome: Mercury Tours";
		//String ActualTitle = "";
		//driver.get(baseURL); // // launch Fire fox and direct it to the Base URL
		//ActualTitle = driver.getTitle(); // // get the actual value of the title
		
		/*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
		
		/*if(ActualTitle.contentEquals(ExpecetdTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.close(); //Close browser
	}*/

}
}
