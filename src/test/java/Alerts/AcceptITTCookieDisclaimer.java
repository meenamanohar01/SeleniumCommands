package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptITTCookieDisclaimer {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.intimetec.com/");

        WebElement acceptButton = driver.findElement(By.xpath("//a[normalize-space(text())='Accept']"));
        acceptButton.click();
    }
}
