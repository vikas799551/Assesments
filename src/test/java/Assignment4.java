
                                          //Info : Assessment 4 - Rahul Shetty Table Data//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.List;

public class Assignment4 {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Update path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void readWebTable() {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement table = driver.findElement(By.id("product"));

        // Get all rows except the header row
        List<WebElement> rows = table.findElements(By.xpath(".//tr[position()>1]"));

        System.out.println("Reading Web Table Data:\n");

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));

            String instructor = cols.get(0).getText();
            String course = cols.get(1).getText();
            String price = cols.get(2).getText();

            System.out.println("Instructor: " + instructor + " | Course: " + course + " | Price: $" + price);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
