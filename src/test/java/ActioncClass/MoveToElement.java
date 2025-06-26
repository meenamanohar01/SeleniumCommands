package ActioncClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        driver.manage().window().maximize();
        WebElement mainelement = driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(), 'Laptops & Notebooks')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainelement).build().perform();
        Thread.sleep(1000);
        WebElement childelelement = driver.findElement(By.xpath("//div//a[contains(text(), 'Show All Laptops & Notebooks')]"));
        childelelement.click();
    }
}
