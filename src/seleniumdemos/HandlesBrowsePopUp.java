package seleniumdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlesBrowsePopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Learning\\Chapter1.rtf");
		//driver.close();
		System.out.println("File uploaded");

	}

}
