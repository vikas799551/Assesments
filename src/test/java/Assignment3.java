
                                            //Info : Assessment3 - Test Pages X paths//
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment3 {

	ChromeDriver driver = new ChromeDriver();
	
	@BeforeTest()
	public void Url() 
	{
		driver.get("https://testpages.eviltester.com/styled/tag/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 	}
	@Test(priority = 1)
	public void HtmlTableTag()
	{
		WebElement Alan = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[2]/td[1]"));
		 Alan.click();
		System.out.println("Alan");
		
		 WebElement Bob = driver.findElement(By.xpath("/html/body/div/div[3]/div/table/tbody/tr[3]/td[1]"));
		 Bob.click();
		 System.out.println("Bob");
		 
		 WebElement Aleister = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[4]/td[1]"));
		 Aleister.click();
		 System.out.println("Aleister");
		 
		 WebElement Douglas = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[5]/td[1]"));
		 Douglas.click();
		 System.out.println("Douglas");
		 
		}
	  @Test(priority = 2)
	  public void Amount() 
	  {
		  WebElement AlanAmount1 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[2]/td[2]"));
		  AlanAmount1.click();
		  System.out.println("AlanAmount1");
		  
		  WebElement BobAmount2 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[3]/td[2]"));
		  BobAmount2.click();
		  System.out.println("BobAmount2");
		  
		  WebElement AleisterAmount3 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[4]/td[2]"));
		  AleisterAmount3.click();
		  System.out.println("AleisterAmount3");
		  
		  WebElement DouglasAmount4 = driver.findElement(By.xpath("//*[@id=\"mytable\"]/tbody/tr[5]/td[2]"));
		  DouglasAmount4.click();
		  System.out.println("DouglasAmount4");
		
		  
	  }

	  @AfterTest()
	  public void Close() {
		  driver.close();
	  }
 
}
	