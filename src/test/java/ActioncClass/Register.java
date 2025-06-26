package ActioncClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Register {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(600));
        Actions actions = new Actions(driver);


        // Open MyAccount dropdown
        WebElement accountMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='dropdown']//a[contains(@href, 'account') and @title='My Account']")));
        accountMenu.click();

        //Displayed utility for Register & Login
//        public boolean isDisplayed (WebElement link){
//            link.isDisplayed
//        }

        // Click Register
        WebElement registerLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, 'account/register')]")));
        boolean isRegisterlinkVisbile  = registerLink.isDisplayed();
        System.out.println("Is REgsiter Link Visible"  +isRegisterlinkVisbile);
        actions.moveToElement(registerLink).click().perform();

        // Optional: Go back to Open MyAccount dropdown
        driver.navigate().back(); // Navigate back to test login click again
        accountMenu = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[@class='dropdown']//a[contains(@href, 'account') and @title='My Account']")));
        accountMenu.click();

        // Click Login
        WebElement loginLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, 'account/login')]")));
        boolean isLoginlinkVisbile  = loginLink.isDisplayed();
        System.out.println("Is Login Link Visible   " + isLoginlinkVisbile);
        actions.moveToElement(loginLink).click().build().perform();

        // Cleanup
       // driver.quit();
    }
}
