package SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ImplicitWaitExample {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set implicit wait
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

        // Any findElement call will wait up to 10 seconds if the element is not immediately available
        List<WebElement> companyNames = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
        List<WebElement> companyPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));


        for (WebElement name : companyNames) {
            System.out.println("Company Name: " + name.getText());
        }

        for (WebElement price : companyPrices) {
            System.out.println("Company Price: " + price.getText());
        }

        System.out.println("Total Company Names :::" + companyNames.size());
        System.out.println("Total Company Prices ::::" + companyPrices.size() );
        driver.quit();
    }
}
