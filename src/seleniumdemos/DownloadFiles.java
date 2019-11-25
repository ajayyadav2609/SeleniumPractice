package seleniumdemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFiles {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		/*FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.dir", "C:\\Users\\Ajay\\Desktop\\Selenium study");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf,image/jpg");*/
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.softpost.org/selenium-test-page/");
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(3000);
		Robot RB = new Robot();
		RB.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		RB.keyPress(KeyEvent.VK_ENTER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	}

}
