package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Waiting until the element is visible
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("input-email")));

        System.out.println(element.getText());
        driver.quit();
    }


}
