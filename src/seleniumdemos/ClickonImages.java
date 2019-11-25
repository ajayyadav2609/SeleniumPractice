package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickonImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".g-logo > img:nth-child(1)")).click();
		if(driver.getTitle().contains("Meet Guru99"))
		{
			System.out.println("We are in home page");
		}else{
		System.out.println("We are not in home page");
		}
	}

}
