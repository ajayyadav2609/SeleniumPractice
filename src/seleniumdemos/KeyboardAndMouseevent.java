package seleniumdemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAndMouseevent {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement WB = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.moveToElement(WB).click().keyDown(WB, Keys.SHIFT)
		.sendKeys(WB, "hello").keyUp(WB, Keys.SHIFT).doubleClick(WB)
		.contextClick().build().perform();

	}

}
