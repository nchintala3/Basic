package com.testng.com.testng.anotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NawabLoginTestCase {
	WebDriver driver; 
  @Test
  public void LoginToDashboard() throws InterruptedException {
	  driver.findElement(By.id("txtUserName")).sendKeys("hotel");
	  driver.findElement(By.id("txtPassword")).sendKeys("Restaurant@30");
	  driver.findElement(By.id("btnLogin")).click();
	  Thread.sleep(5000);
	  String Dashboardurl= driver.getCurrentUrl();
	  System.out.println(Dashboardurl);
	  String actualtitle=driver.getTitle();
	  System.out.println(actualtitle);
	  String expectedtitle="Restaurant";
	  if (actualtitle.equals(expectedtitle)) {
		  System.out.println("Login Successful");
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "F:\\100 chrome\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://restaurant.callistoitsolutions.com/");
	  String url= driver.getCurrentUrl();
	  System.out.println("This is current url :"+url);
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
