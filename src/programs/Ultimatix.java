package programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ultimatix {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		try {
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.ultimatix.net/");
			Thread.sleep(1000);
			
			driver.findElement(By.id("form1")).sendKeys("1816775");
			driver.findElement(By.id("proceed-button")).click();
			driver.findElement(By.xpath("//button[@aria-label='Press Enter for EasyAuth, or press tab for more information regarding EasyAuth']")).click();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='Click to view menu']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText("2Office"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='col-1 hand']/img"))).click();	
			System.out.println("Working");
		}
		catch(Exception e) {
			System.out.println("Not working");
		}
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Global ESS"))).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='favourites-small-div col-md-7 tile-margin tile-color-1']"))).click();
		//driver.findElement(By.linkText("Leave")).click();
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Leave"))).click();
		
		
		
	}

}
