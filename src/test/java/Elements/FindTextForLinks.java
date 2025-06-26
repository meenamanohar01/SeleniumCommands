package Elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.testng.Assert.assertTrue;

public class FindTextForLinks {

    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        String url = driver.getCurrentUrl();
        assertTrue(url.contains("naveenautomationlabs"));

        List<WebElement> links = driver.findElements(By.xpath("//a[@class='list-group-item']"));
        System.out.println(links.size());
        for (WebElement e : links){
          String text = e.getText();
            System.out.println(text);
        }
    }
}
