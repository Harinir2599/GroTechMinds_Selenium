package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) {
	//	System.out.println("Hello");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	

}
