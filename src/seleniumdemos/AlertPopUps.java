package seleniumdemos;
//Alert popup programs.
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUps {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
		driver.findElement(By.xpath("//*[@id='content']/button")).click();
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		String text = alrt.getText();
		if(text.equals("Press a button!"))
		{
			System.out.println("Text showing is correct, so please click ok");
		}else
		{
			System.out.println("Text showing incorrect");
		}
		alrt.accept(); // to accept alert ok
		System.out.println("OK button clicked");
		//alrt.dismiss(); // to cancel alert 
		//System.out.println("Cancel button clicked");
		
	}

}
