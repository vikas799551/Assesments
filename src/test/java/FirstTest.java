
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	ChromeDriver driver = new ChromeDriver();
	@Test
	public void f1() throws InterruptedException {
		driver.get("https://www.instagram.com/");
		System.out.println("hi");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	@Test
	public void f2() throws InterruptedException {
		WebElement element = driver.findElement(By.name("username"));
		element.sendKeys("7995515291");
		Thread.sleep(3000);
	
	//	@Test
//	//	driver.findElement(By.name("password"));
//		
//		
//
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[1]/div[3]/button/div")).submit();
//		Thread.sleep(9000);
//		System.out.println("login successful");
//		
//		
//		System.out.println("hiiiiiiiiiiii");
	}
}