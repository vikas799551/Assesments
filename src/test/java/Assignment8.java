
                               //Info : Assessment 08 - Alert in Rahul shetty//
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

    public class Assignment8 {
    WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void TestCase() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test(priority=1)
	public void TestCaseone() {
	WebElement AlertName = driver.findElement(By.id("name"));
	AlertName.click();
	AlertName.sendKeys("vikas");
		
	WebElement AlertClick = driver.findElement(By.id("alertbtn"));
	AlertClick.click();
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	driver.switchTo().alert().accept();
	}
	@Test(priority=2)
	public void TestCaseTwo() {
	WebElement AlertName = driver.findElement(By.id("name"));
	AlertName.click();
	AlertName.sendKeys("vikas");
	
	WebElement Confbut = driver.findElement(By.id("confirmbtn"));
	Confbut.click();
	String txt = driver.switchTo().alert().getText();
	System.out.println(txt);
	driver.switchTo().alert().accept();
	}
	@Test(priority=3)
	public void TestCasethree() {
	WebElement AlertName = driver.findElement(By.id("name"));
	AlertName.click();
	AlertName.sendKeys("vikas");
	
	WebElement Confbut = driver.findElement(By.id("confirmbtn"));
	Confbut.click();
	String txt = driver.switchTo().alert().getText();
	
	System.out.println(txt);
	driver.switchTo().alert().dismiss();
	
	}
	@AfterTest()
	public void CloseUrl() {
	driver.quit();
	}


}
