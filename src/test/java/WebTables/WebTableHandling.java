package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class WebTableHandling {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://selectorshub.com/xpath-practice-page/");

        Thread.sleep(4000);

     List<String> joeDetails =  getUserInfo("Joe.Root");
        System.out.println(joeDetails);
        List<String> GarryDetails = getUserInfo("Garry.White");
        System.out.println(GarryDetails);
    }

    //This method selects the checkbox for specific user
    public static void selectUser(String userName){
        driver.findElement(By.xpath("//a[text()='\" + username + \"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
    }

    public static List<String> getUserInfo(String userName){
    List<WebElement> rowElements = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
      List<String> rowValuesList = new ArrayList<String>();
      for(WebElement e : rowElements){
      String   text =   e.getText();
          rowValuesList.add(text);
      }
      return rowValuesList;

    }
}
