import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
                                //Uploading files 
public class Assignment12 {

	ChromeDriver driver = new ChromeDriver();
	                      
	@BeforeTest()
	
	public void Url()
	{  
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		}
	@Test()
	public void rahulshetty() {
	WebElement upload =	driver.findElement(By.id("fileInput"));
	
	upload.sendKeys("C:\\Users\\vikki\\Downloads\\signature.JPG");
	
	driver.findElement(By.id("fileSubmit")).click();
    
     
     
	

	
	
		
		
		
	}
	
	
	
	
	
	
}
