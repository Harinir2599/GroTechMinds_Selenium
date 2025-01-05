package basicprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Links_flipkart_90 {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.flipkart.com");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		int no =list.size();
		System.out.println("The total no of links in flipkart are"+no);
	}
	

}
