package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("a077aa5e");
		System.out.println("Switch to frame");
		driver.findElement(By.xpath("html/body/a/Img")).click();
		System.out.println("Click on frame images");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		System.out.println("Switch to frame and move to main page");
		

	}

}
