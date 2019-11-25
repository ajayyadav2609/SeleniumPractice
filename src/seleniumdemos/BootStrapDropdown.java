package seleniumdemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootStrapDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(@class,'multiselect')]")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//label"));
		System.out.println(list.size());
		//driver.findElement(By.xpath("//label[contains(text(),'Angular')]")).click();
		
		//selecting all check box options
		/*for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			list.get(i).click();
		}*/
		
		//selecting only one option
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("Angular")){
				list.get(i).click();			
			//driver.findElement(By.xpath("//label[contains(text(),'Angular')]")).click();
		break;
			}
		}
	
	}

}
