package Elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class SeleniumExample2 {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("naveenautomationlabs"));


        By email=   By.id("input-email");
        By pass = By.id("input-password");
        By loginBtn = By.xpath("//*[@id='content']/div/div[2]/div/form/input");


        doSendKeys(email , "meena.manohar01@gmail.com");
        doSendKeys(pass,"Chocalate@12");
        doClick(loginBtn);
    }

    public static WebElement getElement(By Locator) {
        return driver.findElement(Locator);
    }

    public static void doSendKeys(By locator , String value){
        getElement(locator).sendKeys(value);
    }
       public static void doClick(By locator){
           getElement(locator).click();
        }

}
