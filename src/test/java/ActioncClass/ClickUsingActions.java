package ActioncClass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//input[@value='Login' and @class='btn btn-primary']"));
        boolean isVisible = element.isDisplayed();
        System.out.println("Elemnt is visible :::" +isVisible);
        // actions.scrollToElement(element);
       // actions.sendKeys(Keys.PAGE_UP).perform();
       // actions.moveToElement(element).build().perform(); //Move to that element
       actions.click(element);// Clicks the element




    }
}
