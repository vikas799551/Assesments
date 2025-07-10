package Jagadeesh;
                                                              //Info : Assessment 1 - OrangeHrm Login //

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignmentone {

	WebDriver driver = new ChromeDriver();
	WebDriverWait wait;
	@BeforeTest
	
	public void OpenUrl() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=1)
	public void Testcaseone() {
	WebElement UsernameTextbox = driver.findElement(By.xpath("//input[@name='username']"));
	UsernameTextbox.sendKeys("Admin");
	
	WebElement PasswordTextbox = driver.findElement(By.xpath("//input[@name='password']"));
	PasswordTextbox.sendKeys("admin123");
	
	WebElement loginbotton = driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button')]"));
	loginbotton.click();
	}
	
	@Test(priority=2)
	
	public void Testcasetwo() {
	WebElement Adminpagelink = driver.findElement(By.xpath("//a[contains(@class,'main-menu-item')]//span[text()='Admin']"));
	Adminpagelink.click();
	}
	
	@Test(priority=3)
	public void Testcasethree() {
		
	WebElement addbuttom = driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button') and normalize-space()='Add']"));
	addbuttom.click();
	
	WebElement Dropdown = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
	Dropdown.click();
	
	WebElement Admin =driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='Admin']"));
	Admin.click();
	
	WebElement Ess = driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='ESS']"));
	Ess.click();
	
	WebElement Employeename = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
	Employeename.click();
	Employeename.sendKeys("Jagadeesh");
	
	WebElement Status = driver.findElement(By.xpath("//label[text()='Status']/following::div[@class='oxd-select-wrapper']//div[@class='oxd-select-text--after']"));
	Status.click();
	
	WebElement Enable = driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='Enabled']"));
	Enable.click();
	
	WebElement Username = driver.findElement(By.xpath("//label[text()='Username']/following::input[@class='oxd-input oxd-input--active']"));
	Username.click();
	Username.sendKeys("Jagadeesh katta");
	
	WebElement password = driver.findElement(By.xpath("//label[text()='Password']/following::input[@class='oxd-input oxd-input--active']"));
	password.click();
	password.sendKeys("Katta@123");
	
	WebElement confirmpassword = driver.findElement(By.xpath("//label[text()='Confirm Password']//following::input[@class='oxd-input oxd-input--active']"));
	confirmpassword.click();
	confirmpassword.sendKeys("Katta@123");
	
	WebElement savebuttom = driver.findElement(By.xpath("//button[contains(@class,'oxd-icon-button oxd-main')]"));
	savebuttom.click();
	
	WebElement cancelbuttom = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']"));
	cancelbuttom.click();
		
	}
	@Test(priority=4)
	public void TestcaseFour() {
		
	WebElement adbtn = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
	adbtn.click();
	
	WebElement UserRoleDropDownOption = driver.findElement(By.xpath("//div[@class='oxd-select-text--after']"));
	UserRoleDropDownOption.click();
	
	WebElement Ess = driver.findElement(By.xpath("//div[@class='oxd-select-option']//span[text()='ESS']"));
	Ess.click();
	
	}
}	
	


	


