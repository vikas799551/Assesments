
//Info : Assessment 7 - MouseOver in rahulshetty//


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assigment7 {
	
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	
	public void openurl() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test()
	public void Testcaseone() {	
	Actions actions = new Actions(driver);
	WebElement Mousehover = driver.findElement(By.id("mousehover"));
    actions.moveToElement(Mousehover).build().perform();
	driver.findElement(By.linkText("Top")).click();
	 }	
	
	@Test()
	public void Testcasetwo() {
	Actions actions = new Actions(driver);
	WebElement Mousehover = driver.findElement(By.id("mousehover"));
	actions.moveToElement(Mousehover).build().perform();
	driver.findElement(By.linkText("Reload")).click();		
	}
	
	@AfterTest
	public void CloseURL() {
		
	driver.close();
	}		
	
}
