package Elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.testng.Assert.assertTrue;


public class RegisterAccount {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("naveenautomationlabs"));
        driver.findElement(By.xpath("(//input[@class = 'form-control'])[2]")).sendKeys("Meena Manohar");
        driver.findElement(By.xpath(" (//input[@class = 'form-control'])[last()-2]")).sendKeys("Saurabh Singh");






    }
}
