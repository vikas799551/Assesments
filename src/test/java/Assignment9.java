
                             //Info : Assessment 9 - WindowHandle in Rahul shetty//
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment9 {
	ChromeDriver driver = new ChromeDriver();
	@BeforeTest()
	public void OpenUrl() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	@Test()
	public void TestCase1() 
	{
	String parentWindow = driver.getWindowHandle();
    WebElement OpenTab =driver.findElement(By.id("opentab"));
	OpenTab.click();
	Set<String> allWindows = driver.getWindowHandles();
		
	for (String windowHandle : allWindows) {
	if (!windowHandle.equals(parentWindow)) {
	driver.switchTo().window(windowHandle);
	break;
	 }
	}
	System.out.println("Title of new window: " + driver.getTitle());
	driver.switchTo().window(parentWindow);
	}
}


	

