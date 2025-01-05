package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_86 {
public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
            emailField.sendKeys("hariniravi25.hr@gmail.com");
            WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
            passwordField.sendKeys("abcdefg12345@");
            WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
            loginButton.click();
 
           
            
 
        
    }

}
