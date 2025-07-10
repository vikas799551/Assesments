import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                            //Handling child window to parentwindow by links in rahulshetty
    public class Assignment11 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest()
	public void TestUrl() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	@Test(priority=1)
	public void TestCaseOne()  {
		String parentwindow = driver.getWindowHandle();
		WebElement Link =driver.findElement(By.linkText("REST API"));
		
		Actions actions = new Actions(driver);
	    actions.keyDown(Keys.SHIFT).click(Link).keyUp(Keys.SHIFT).build().perform();
		
	    Set<String> allwindows = driver.getWindowHandles();
	    
	    for (String windowhandle : allwindows) {
	    if (!windowhandle.equals(parentwindow)) {
	    driver.switchTo().window(windowhandle);
	    }
	    }
	   System.out.println("New Tab Title : " + driver.getTitle());
	   driver.switchTo().window(parentwindow);
	   
	}
	
	   @Test(priority=2)
	   public void TestCaseTwo() {
	  String parentwindow = driver.getWindowHandle();
	  WebElement soapUi = driver.findElement(By.linkText("SoapUI"));
	
	  Actions actions1 = new Actions(driver);
	  actions1.keyDown(Keys.SHIFT).click(soapUi).keyUp(Keys.SHIFT).build().perform();
	
	  Set<String> allwindows = driver.getWindowHandles();
	
	  for (String windowhandle : allwindows) {
	  if (!windowhandle.equals(parentwindow)) {
	  driver.switchTo().window(windowhandle);
		}
	}
	System.out.println("New tab title :"+ driver.getTitle());
	driver.switchTo().window(parentwindow);
		}
      
	   @Test(priority=3)
	   public void Test() {
	String parentwindow = driver.getWindowHandle();
	WebElement Appium = driver.findElement(By.linkText("Appium"));
	
	Actions action2 = new Actions(driver);
	action2.keyDown(Keys.SHIFT).click(Appium).keyUp(Keys.SHIFT).build().perform();
	
	Set<String> allwindows = driver.getWindowHandles();
	
	for (String windowhandle : allwindows) {
	if  (!windowhandle.equals(parentwindow)) {
	driver.switchTo().window(windowhandle);
	}}
	System.out.println("New Tab title :" + driver.getTitle());
	driver.switchTo().window(parentwindow);
	
	}
	@Test(priority=4)
	public void test() {
	String parentwindow = driver.getWindowHandle();
	WebElement JMeter = driver.findElement(By.linkText("JMeter"));
	
	Actions actions3 = new Actions(driver);
	actions3.keyDown(Keys.SHIFT).click(JMeter).keyUp(Keys.SHIFT).build().perform();
	
	Set<String> allwindows = driver.getWindowHandles();
	
	for (String windowhandle : allwindows) {
	if  (!windowhandle.equals(parentwindow)) {
	driver.switchTo().window(windowhandle);
	}
	}
	System.out.println("New Tab title :" + driver.getTitle());
	driver.switchTo().window(parentwindow);
	}
	
	   @AfterTest()
	   public void Close() {
	 	driver.close();
	    }
       }
