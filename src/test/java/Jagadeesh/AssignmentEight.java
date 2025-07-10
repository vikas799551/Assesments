
                               //Info : Assessment 08 - Alert in Rahul shetty//
package Jagadeesh;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

   public class AssignmentEight {
   WebDriver driver = new ChromeDriver();
   @BeforeTest()
   public void TestUrl() {
   driver.get("https://rahulshettyacademy.com/AutomationPractice/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
   }
   @Test(priority=1)
   public void TestCaseOne() {
   WebElement Name = driver.findElement(By.id("name"));
   Name.click();
   Name.sendKeys("Jagadeesh");
   
   WebElement Alert = driver.findElement(By.id("alertbtn"));
   Alert.click();
   String Text = driver.switchTo().alert().getText();
   System.out.println(Text);
   driver.switchTo().alert().accept();
   }
   @Test(priority=2)
   public void TestCaseTwo() {
   WebElement Nametxt = driver.findElement(By.id("name"));
   Nametxt.click();
   Nametxt.sendKeys("katta");
   
   WebElement ConfirmButton = driver.findElement(By.id("confirmbtn"));
   ConfirmButton.click();
   String Txt = driver.switchTo().alert().getText();
   System.out.println(Txt);
   driver.switchTo().alert().accept();  
   }
   @Test(priority=3)
   public void TestCaseThree() {
   WebElement NameText = driver.findElement(By.id("name"));   
   NameText.click();
   NameText.sendKeys("katta jagadesh");
   WebElement Confirm = driver.findElement(By.id("confirmbtn"));
   Confirm.click();
   String textname = driver.switchTo().alert().getText();
   System.out.println(textname);
   driver.switchTo().alert().dismiss();
   }
   @AfterTest()
   public void closeUrl() {
   driver.quit();  
   }			
}
	