package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlinkedin {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/feed/");
		driver.findElement(By.id("username")).sendKeys("9444863553");
		driver.findElement(By.id("password")).sendKeys("abcdefg@2024");
		driver.findElement(By.className("btn__primary--large")).click();
		
	}

}
