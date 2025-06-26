package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))  // Maximum wait time
                .pollingEvery(Duration.ofSeconds(5)) // Polling frequency
                .ignoring(NoSuchElementException.class); // Ignore exceptions during polling

        // Waiting dynamically for an element
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("input-email"));
            }
        });

        System.out.println(element.getText());
        driver.quit();
    }
}
