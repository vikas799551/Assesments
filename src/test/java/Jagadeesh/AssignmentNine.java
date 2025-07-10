
                                        //Info : Assessment 9 - WindowHandle in Rahul shetty//
package Jagadeesh;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssignmentNine {
	WebDriver driver = new ChromeDriver();
	@BeforeTest()
	public void TestUrl() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	@Test(priority=1)
	public void TestCaseone() {
		
	}
			

}
