package browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SeleniumBasics {

   static  WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    void checkTheUrl() {

        driver.get("https://ecommerce-playground.lambdatest.io/");
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("lambdatest"));
    }
    @AfterTest
    void tearDown() {
        driver.quit();
    }
}

