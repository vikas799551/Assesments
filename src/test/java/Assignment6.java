
                                               //Info : Assessment 6 - Radio button & Check box//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment6 {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void openurl() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();	
	}
	@Test()
	public void Testcaseone() {
	WebElement Checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption3']"));
	Checkbox.click();
	
	WebElement Radiobutton = driver.findElement(By.xpath("//input[@value='radio2']"));
	Radiobutton.click();
	}
	
	@AfterTest
	public void close() {
	driver.close();
	}
	

}
