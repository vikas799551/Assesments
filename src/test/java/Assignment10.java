 
                             //Info : Assessment 10 - WindowHandles in Rahul shetty//
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment10 {

	 WebDriver driver = new ChromeDriver();
	 
	  @BeforeTest 
	  public void OpenUrl() {
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      }
      @Test (priority=1)
      public void TestCaseone() {
      WebElement RestAPI = driver.findElement(By.linkText("REST API"));
      RestAPI.click();
      System.out.println("Title of RestAPI :" + driver.getTitle());
      driver.navigate().back();
      }
      @Test(priority=2)
      public void TestCaseTwo(){
      WebElement SoapUI = driver.findElement(By.linkText("SoapUI"));
      SoapUI.click();
      System.out.println("Title of SoapUI:" + driver.getTitle());
      driver.navigate().back();
      }
      @Test(priority=3)
      public void TestcaseThree() {
      WebElement Appium = driver.findElement(By.linkText("Appium"));
      Appium.click();
      System.out.println("Title of Appium:"+driver.getTitle());
      driver.navigate().back();
      }
      @Test(priority=4)
      public void TestcaseFour() {
      WebElement jmeter = driver.findElement(By.linkText("JMeter"));
      jmeter.click();
      System.out.println("Title of jmeter:"+driver.getTitle());     
      }
      @AfterTest
      public void CloseUrl() {
      driver.quit();  
      }
}