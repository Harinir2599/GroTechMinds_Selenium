package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath_Jsam_85 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/1816775.INDIA/Downloads/jsam.html");
		WebElement e1 = driver.findElement(By.xpath("/html/body/input"));
		e1.sendKeys("Harini");
		
		WebElement e2 = driver.findElement(By.xpath("/html/body/input[2]"));
		e2.sendKeys("H");

		WebElement e3 = driver.findElement(By.xpath("/html/body/input[3]"));
		e3.sendKeys("Tejas@2024");

		WebElement e4= driver.findElement(By.xpath("/html/body/form/input[1]"));
		e4.sendKeys("Harini");

		WebElement e5 = driver.findElement(By.xpath("/html/body/form/input[2]"));
		e5.click();

	}

}
