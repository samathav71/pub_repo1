package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class class1 {

	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samat\\Git\\repo1\\mavenproject1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		try {
			Thread.sleep(10000);
		
			driver.quit();
		} catch (Exception e){
			
		}		
	}
	
	@Test
	public void method1 () {
		System.out.println("testing maven project: Method11. ");
	}
	
	@Test
	public void method2 () {
		System.out.println("testing maven project: Method21.");
	}
	@Test
	public void method3 () {
		System.out.println("testing maven project: Method31.");
	}
}
