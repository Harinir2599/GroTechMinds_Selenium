package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class try_apollo_pharm {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		try {
			driver.manage().window().maximize();
			driver.get("https://www.apollopharmacy.in/");
			WebElement e1 = driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
			e1.click();
			WebElement e2 = driver.findElement(By.id("searchProduct"));
			e2.sendKeys("nasal spray");
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement e3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-label='Add'])[2]")));
			e3.click();
			System.out.println("Item added to the cart successfully!");
			WebElement e4 = driver.findElement(By.xpath("//a[@class='Header_icon____pQe Header_cart__Pwy9_ icon-cart_icon']"));
			e4.click(); 
			
		}
		catch(Exception e) {
			System.out.println("Item not added to the cart");
		}
		
		
	}

}
