package Elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SeleniumExample1 {

      static WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testNaveenAutomationLab() {

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("naveenautomationlabs"));
        driver.findElement(By.id("input-email")).sendKeys("meena.manohar01@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Chocalate@12");
        driver.findElement(By.xpath("//input[@class = 'form-control'])[]"));
    }

    @AfterTest
    public void cleanup() {
        driver.quit();
        System.out.println("Closed browser after each test.");
    }

    }



