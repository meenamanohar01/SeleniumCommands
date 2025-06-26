package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTables {

    static WebDriver driver;

    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get(" https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        String company = "KEC International Lt"; //Find the current price for this company

        //Extract all company names
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

       for(int i=0 ; i<companyNames.size();i++){
           if(company.equals(companyNames.get(i).getText())) {
               System.out.println("CompanyNames:::" + companyNames.get(i).getText() + "Company Prices::" + companyPrices.get(i).getText());
               break;
           }
       }
    }



}
