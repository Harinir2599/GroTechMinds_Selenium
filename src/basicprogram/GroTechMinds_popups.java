package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class GroTechMinds_popups {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.findElement(By.xpath("//button[@class='btnjs']")).click();
		driver.switchTo().alert().accept();
	}

}
