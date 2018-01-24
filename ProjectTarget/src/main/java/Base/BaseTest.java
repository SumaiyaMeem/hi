package Base;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver","/Users/SA/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		}

  @AfterClass
  public void afterClass() {
	//  driver.quit();
  }

}
