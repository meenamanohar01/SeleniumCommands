package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DismissAlertOnConfirmAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        driver.findElement(By.xpath("//input[@id='confirmexample' and @value='Show confirm box']")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.dismiss();

    }
}
