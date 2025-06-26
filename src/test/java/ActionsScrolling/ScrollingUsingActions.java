package ActionsScrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingActions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.PAGE_UP).perform();

        actions.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();

        //scroll using scrollToElement()
        // Once scrolled to element then click
        // Mention the xpath of the target element
        actions.scrollToElement(driver.findElement(By.xpath("//a[contains(@href, 'voucher')and text()='Gift Certificates']")))
                .click(driver.findElement(By.xpath("//a[contains(@href, 'voucher')and text()='Gift Certificates']"))).build().perform();

        //control + F5 to refresh the page
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();


    }
}
