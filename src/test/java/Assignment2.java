
                                      //Info : Assessment 2 - Amazon Mousehover X paths//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;

public class Assignment2 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
    }

    @Test
    public void testHoverMenuOptions() throws InterruptedException {
        // Hover over "Accounts & Lists"
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();

        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Locators for elements after hover
        WebElement createWishlist = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create a Wish List']")));
        createWishlist.click();
        
       // WebElement wishFromAnyWebsite = driver.findElement(By.xpath("//span[text()='Wish from Any Website']"));
       // WebElement discoverStyle = driver.findElement(By.xpath("//span[text()='Discover Your Style']"));
      //  WebElement exploreShowroom = driver.findElement(By.xpath("//span[text()='Explore Showroom']"));

        // Print if displayed
        System.out.println("Create a Wishlist displayed: " + createWishlist.isDisplayed());
    //    System.out.println("Wish from Any Website displayed: " + wishFromAnyWebsite.isDisplayed());
    //    System.out.println("Discover Your Style displayed: " + discoverStyle.isDisplayed());
    //    System.out.println("Explore Showroom displayed: " + exploreShowroom.isDisplayed());
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
