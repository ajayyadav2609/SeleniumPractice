package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollBarConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//1. web page Scroll bar
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("scroll(0,400)"); // first method
		//js.executeScript("window.scrollBy(0,400)"); // second method :This  will scroll down the page by  400 pixel vertical
		
		
		//3 method
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.linkText("Linux"));//Find element by link text and store in variable "Element" 
		js.executeScript("arguments[0].scrollIntoView();", ele);////This will scroll the page till the element is found, can be worked for horizontal
		System.out.println(ele.getText());
	}

}
