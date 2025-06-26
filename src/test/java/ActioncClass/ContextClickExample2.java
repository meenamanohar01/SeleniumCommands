package ActioncClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickExample2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        WebElement mainelement = driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(), 'Laptops & Notebooks')]"));
        Actions actions = new Actions(driver);
       actions.contextClick(mainelement).perform();

    }

}
