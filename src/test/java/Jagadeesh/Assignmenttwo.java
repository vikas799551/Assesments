package Jagadeesh;
                                          //Info : Assessment 2 - Amazon Drop down X paths//

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class Assignmenttwo {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void OpenUrl() {	
	driver.get("https://www.amazon.in/ref=nav_logo");
	driver.manage().window().maximize();
	}
	@Test
	public void Testcaseone() {
    WebElement AccountList =driver.findElement(By.id("nav-link-accountList"));
    Actions action = new Actions(driver);
    action.moveToElement(AccountList).perform();
    
    WebElement Createlist = driver.findElement(By.xpath("//a[@class='nav-link nav-item']//span[text()='Create a Wish List']"));
    Createlist.click();
    driver.navigate().back();
    
    WebElement AccountList1 =driver.findElement(By.id("nav-link-accountList"));
    Actions action1 = new Actions(driver);
    action.moveToElement(AccountList1).perform();

    WebElement babylist = driver.findElement(By.xpath("//a[@class='nav-link nav-item']//span[text()='Baby Wishlist']"));
    babylist.click();
	}
	@AfterTest
	public void close() {
	driver.close();
	}

}
