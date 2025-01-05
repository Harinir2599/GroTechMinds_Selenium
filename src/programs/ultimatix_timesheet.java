package programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ultimatix_timesheet {
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
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='appLinksBlack ng-binding ng-scope']"))).click();
			Set<String> s =driver.getWindowHandles();
			Iterator<String> i = s.iterator();
			String s1 = i.next();
			String s2 = i.next();
			System.out.println(s1);
			System.out.println(s2);
			driver.switchTo().window(s2);
			String w =driver.getWindowHandle();
			System.out.println(w);
			//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Current Allocation"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("effortAssign01"))).clear();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("effortAssign01"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.id("effortAssign01"))).sendKeys("4");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Submit']"))).click();
			System.out.println("Working");
			 
			
}
		catch(Exception e) {
			System.out.println("Not Working");
			

		}
	}
}

