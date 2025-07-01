import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rahulshetty {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest()
	
	public void Url()
	{  
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		}
	@Test()
	public void rahulshetty() {
		driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[2]/td[1]"));
	}
	@Test()
	
	
	
	
	
}
