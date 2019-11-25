package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TooltipConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// handling tooltip
		String expectedtooltip = "Get Selenium";		
		String actualtooltip = driver.findElement(By.xpath("//a[@title='Get Selenium']")).getAttribute("title");
		System.out.println(actualtooltip);
		if(actualtooltip.equals(expectedtooltip))
		{
			System.out.println("Correct tooltip found");
			
		}else
		{
			System.out.println("Incorrect tooltip");
		}
	}

}
