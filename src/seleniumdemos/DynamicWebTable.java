package seleniumdemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/WebTable.html");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		/*String Fname = driver.findElement(By.xpath("//div[contains(text(),'Dipak')]")).getText();
		System.out.println(Fname);
		System.out.println("Print name");*/
		
		
		//Method 1
		String before_xpath = "/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[";
		String after_xpath = "]/div/div[2]/div";
		
		for(int i=2; i<=10;i++)
		{
			String getfname = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(getfname);
			if(getfname.contains("Dipak")){
				driver.findElement(By.xpath("/html/body/section/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[" + i + "]/div/div[2]/div"));
				System.out.println("found name in webtable");
				
			}
						
		}
		
		//Extract no of rows
		List<WebElement> rowsize = driver.findElements(By.id("1566900125616-0-uiGrid-0005-cell"));
		System.out.println(rowsize.size());
		driver.close();
		
		
		//Method 2
		
		
		
		
		
	}

}
