package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class JSAM_popups {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/1816775.INDIA/Downloads/jsam.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).sendKeys("Harini"); 
		
		
	}

}
