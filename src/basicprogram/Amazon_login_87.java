package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_login_87 {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9444863553");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
	}

}
