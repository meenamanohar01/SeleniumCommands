package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static java.lang.Thread.sleep;

public class SelectDropDownHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com/en/contact-sales");
      WebElement country=  driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
        Select dropDown = new Select(country);
        dropDown.selectByVisibleText("Brazil");
       Thread.sleep(1000);
        dropDown.selectByIndex(5);
        dropDown.selectByValue("Afghanistan");

    }
}
