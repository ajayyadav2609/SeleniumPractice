package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//using xpath 
		// only relative xpath can be used not absolute xpath
		//driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("Sharda");
		//driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("Yadav");
		
		/*//using id
		driver.findElement(By.id("u_0_l")).sendKeys("Rishu");
		driver.findElement(By.id("u_0_n")).sendKeys("Yadav");
		*/
		
		//Using Name Locators
		
		/*driver.findElement(By.name("firstname")).sendKeys("Arsh");
		driver.findElement(By.name("lastname")).sendKeys("Yadav");*/
		
		
		//Using Link text
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		
		//Using partial linktext ----not useful
		
		//driver.findElement(By.partialLinkText("Create a")).click();
		
				
		// Using CSSselector
		
		/*driver.findElement(By.cssSelector("#u_0_l")).sendKeys("Shashank");
		driver.findElement(By.cssSelector("#u_0_n")).sendKeys("Yadav");*/
		
		
		// Using Class locator - not recommened because in one page many same class may be present
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("Ajay");
		
		 //Priorities to select locators
		 //First priority is ID if not available go for Next "Xpath" or "CSSSelector" then "Name"
		

	}

}
