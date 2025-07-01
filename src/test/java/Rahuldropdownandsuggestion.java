import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Rahuldropdownandsuggestion {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    }

    @Test(priority = 1)
    public void handleAutoSuggestionBox() throws InterruptedException {
        WebElement suggestionBox = driver.findElement(By.id("autocomplete"));
        suggestionBox.sendKeys("ind");

        Thread.sleep(2000); // Use WebDriverWait in real test frameworks

        List<WebElement> suggestions = driver.findElements(By.cssSelector(".ui-menu-item div"));
        for (WebElement option : suggestions) {
            System.out.println("Suggestion: " + option.getText());
            if (option.getText().equalsIgnoreCase("In")) {
                option.click();
                break;
            }
        }

        // Optional Assertion
      //  String selected = driver.findElement(By.id("autocomplete")).getAttribute("value");
      //  assert selected.equals("India") : "Auto-suggestion selection failed!";
    }

//    @Test(priority = 2)
//    public void handleStaticDropdown() throws InterruptedException {
//        Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
//
//        dropdown.selectByVisibleText("Option2");
//        Thread.sleep(1000);
//        String selectedOption = dropdown.getFirstSelectedOption().getText();
//        System.out.println("Dropdown selected: " + selectedOption);
//
//        assert selectedOption.equals("Option2") : "Dropdown selection failed!";
//    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
