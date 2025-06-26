package ActioncClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DoubleClick {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
      //  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(600));
        Actions actions = new Actions(driver);

        // Open MyAccount dropdown
     //   WebElement accountMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='dropdown']//a[contains(@href, 'account') and @title='My Account']")));

        WebElement accountMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Double-Click Me To See Alert']")));

        // Perform double-click
        actions.doubleClick(accountMenu).perform();

    }
}
