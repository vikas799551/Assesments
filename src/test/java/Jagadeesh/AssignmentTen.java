
                               //Info : Assessment 10 - WindowHandles in Rahul shetty//
package Jagadeesh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

    public class AssignmentTen {
	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest()
	public void TestUrl() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	}
	@Test(priority=1)
	public void TestCaseOne() {
	WebElement Restapl=driver.findElement(By.linkText("REST API"));
	Restapl.click();
	System.out.println("Get Title:"+driver.getTitle());
	driver.navigate().back();
	}
	@Test(priority=2)
	public void TestCaseTwo() {
	WebElement Soapui=driver.findElement(By.linkText("SoapUI"));
	Soapui.click();
	System.out.println("Get Title:"+driver.getTitle());
	driver.navigate().back();
	}
	@Test(priority=3)
	public void TestCaseThree() {
	WebElement appium= driver.findElement(By.linkText("Appium"));
	System.out.println("Get Title:"+driver.getTitle());
	appium.click();
	driver.navigate().back();
	}
	@Test(priority=4)
	public void TestCaseFour() {
	WebElement jmeter=driver.findElement(By.linkText("JMeter"));
	System.out.println("Get Title:"+driver.getTitle());
	jmeter.click();
	driver.navigate().back();
	}
	@AfterTest()
	public void closeUrl() {
	driver.quit();	
	}
}
