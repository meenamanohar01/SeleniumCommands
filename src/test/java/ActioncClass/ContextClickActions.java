package ActioncClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.intimetec.com/");
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//input[@value='Login' and @class='btn btn-primary']"));
        actions.contextClick(element).perform(); // Right-clicks the element
    }
}
