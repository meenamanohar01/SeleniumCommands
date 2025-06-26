package ActioncClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.ConfigReader;

import java.time.Duration;

public class RegisterUtil {

    public static void main(String[] args) {
        // Load the config file
        ConfigReader.loadProperties("src/main/resources/config.properties");

        // Read values from properties
        String url = ConfigReader.getProperty("url");
        int timeout = Integer.parseInt(ConfigReader.getProperty("timeout"));
        String registerLink = ConfigReader.getProperty("registerLink");
        String loginLink = ConfigReader.getProperty("loginLink");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        Actions actions = new Actions(driver);

        //Caller method for My Account Dropdown
        openMyAccountDropdown(wait);
        verifyLinkIsDisplayed( wait, registerLink);
        verifyLinkIsDisplayed(wait,registerLink);
        clickDropDownLink(wait,actions,registerLink);
        openMyAccountDropdown(wait);
        verifyLinkIsDisplayed(wait, loginLink);
        clickDropDownLink(wait,actions,loginLink);

    }
    public static void openMyAccountDropdown(WebDriverWait wait){
        WebElement accountMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='dropdown']//a[contains(@href, 'account') and @title='My Account']")));
        accountMenu.click();
    }

    // Click Register
    public static void clickDropDownLink(WebDriverWait wait, Actions actions, String partialHref) {

        String xpath = String.format("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, '%s')]", partialHref);
        WebElement dropDownLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(xpath)));
        boolean islinkVisbile = dropDownLink.isDisplayed();
        System.out.println("Is Regsiter/Login Link Visible" + islinkVisbile);
        actions.moveToElement(dropDownLink).click().perform();
    }

    public static void verifyLinkIsDisplayed(WebDriverWait wait,String partialHref){
      String xpath = String.format("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, '%s')]", partialHref);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        if(element.isDisplayed()){
            System.out.println(partialHref + "is present");
        }
    }


}
