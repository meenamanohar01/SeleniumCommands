package Alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupsHandle {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

     //   driver.get("https://the-internet.herokuapp.com/basic_auth");
       // //Now add username password in the url for authnetication
       // driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String username = "admin";
        String password = "admin";

        driver.get("https://"+username+":"+password+"//the-internet.herokuapp.com/basic_auth");

    }
}
