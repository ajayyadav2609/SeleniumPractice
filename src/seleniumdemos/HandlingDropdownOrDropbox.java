package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownOrDropbox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Select select = new Select(driver.findElement(By.id("day")));
        select.selectByVisibleText("26");
        Select Month = new Select(driver.findElement(By.id("month")));
        Month.selectByVisibleText("Sept");
        Select yrs = new Select(driver.findElement(By.id("year")));
        yrs.selectByVisibleText("1984");
        driver.findElement(By.id("u_0_9")).click();
        
	}

}
