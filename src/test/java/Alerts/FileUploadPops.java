package Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v134.filesystem.model.File;
import java.io.File;

public class FileUploadPops {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/upload");
       File uploadFile = new File("D:/Java Tutorials/Interface/Interface.txt");

       WebElement fileInput = driver.findElement(By.xpath("//input[@type= 'file' and @id='file-upload']"));
       fileInput.sendKeys(uploadFile.getAbsolutePath());
       driver.findElement(By.xpath("//input[@class='button' and @id='file-submit']")).click();

       // WebElement fileName = driver.findElement(By.id("uploaded-files"));
       // Assertions.assertEquals("selenium-snapshot.png", fileName.getText());
    }
}
