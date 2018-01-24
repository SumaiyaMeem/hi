package Base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UtilityClass {
	WebDriver dr;
	public UtilityClass(WebDriver driver) {
		this.dr=driver;
		}
	public void navigateMenu() {
		dr.findElement(By.xpath(".//*[@id='js-toggleLeftNavLg']")).click();
		List<WebElement> element = dr.findElements(By.xpath(".//*[@id='leftNavigation']/ul[2]/li"));
		
		
	}
	

	
 
}
