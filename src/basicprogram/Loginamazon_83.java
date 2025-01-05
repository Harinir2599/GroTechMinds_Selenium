package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Loginamazon_83 {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("nav-link-accountList")).click();
	driver.findElement(By.id("ap_email")).sendKeys("9444863553");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Tejas@2024");
	driver.findElement(By.id("signInSubmit")).click();
	//using linktext to click on customer service
	driver.findElement(By.linkText("Customer Service")).click();
	driver.findElement(By.partialLinkText("Car")).click();
	
}
}
