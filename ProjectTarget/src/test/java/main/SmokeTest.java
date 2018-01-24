package main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTest;
import Base.UtilityClass;

public class SmokeTest extends BaseTest{
  @Test
  public void test() {
	  UtilityClass U=new UtilityClass(driver);
	  U.navigateMenu();
	  
  }
}
