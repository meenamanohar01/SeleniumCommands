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

public class Example {
    static WebDriver driver;


        @BeforeTest
        public void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

    @Test
    void checkTheUrl() {

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/logins");
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("naveenautomationlabs"));

        //First Approach
        // WebElement emailid = driver.findElement(By.id("input-email")).sendKeys("meena.manohar01@gmail.com");
        //WebElement password = driver.findElement(By.id("input-password")).sendKeys("Chocalate@12");


      //Second Approach
        // WebElement emailid = driver.findElement(By.id("input-email"));
        //emailid.sendKeys("meena.manohar01@gmail.com");
        // WebElement password = driver.findElement(By.id("input-password"));
       //  password.sendKeys("Chocalate@12");


        //Third Approach
      // By email=   By.id("input#input-email.form-control");
        By email=   By.id("input-email");
        By pass = By.id("input-password");

       WebElement emailid = driver.findElement(email);
       emailid.sendKeys("meena.manohar01@gmail.com");


        WebElement password = driver.findElement(pass);
        password.sendKeys("Chocalate@12");



    }

    @AfterTest
    void tearDown() {
        driver.quit();
    }




}
