package WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CustomWebTableFunction {

    static WebDriver driver;


    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get(" https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
        String company = "KEC International Lt"; //Find the current price for this company

        int rowNumber = getRowNumberCellData(company);
        System.out.println(company + "found in table at row number  :::::" + rowNumber);
    }

    //return row number for company name
    //If Company name is not found then -1 is returned
    public static int getRowNumberCellData(String companyName) {
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        for (int rowNum = 0; rowNum < rows.size(); rowNum++) {
            WebElement row = rows.get(rowNum);
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (int colNum = 0; colNum < cells.size(); colNum++) {
                System.out.println(cells.get(colNum).getText());
                if (companyName.equalsIgnoreCase(cells.get(colNum).getText())) {
                    return (rowNum + 1);
                }
            }
            System.out.println("----------");

        }
        //In case no matching data found then return -1
        return -1;
    }
}
