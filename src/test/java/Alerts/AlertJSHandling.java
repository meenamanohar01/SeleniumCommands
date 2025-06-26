package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSHandling {
    public static void main(String[] args) {


        // alert : Java Script pop ups
        // 1. alert()
        // 2. prompt()
        // 3. confirm()

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        driver.findElement(By.xpath("//input[@id='alertexamples' and @value='Show alert box']")).click();

        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);

      // alert.dismiss();
        alert.accept();


    }
}
