package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class APItest {

	@Test
	public void postjira() {
		System.setProperty("webdriver.chrome.driver", "/Users/marksaniano/Documents/Automation_Java/chromedriver/");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		System.out.println("postjira");
	}
	@Test
	public void deletetwitter() {
		System.out.println("deletetwitter");
		
	}
}
