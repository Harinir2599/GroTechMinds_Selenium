package programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ultimatix_leave {
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
		WebElement w1 = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Global ESS")));
		w1.click();
		Set<String> s =driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String s1 = i.next();
		String s2 = i.next();
		System.out.println(s1);
		System.out.println(s2);
		driver.switchTo().window(s2);
		String w =driver.getWindowHandle();
		System.out.println(w);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='favourites-small-div col-md-7 tile-margin tile-color-1']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("startDate_0"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("3"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("endDate_0"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("7"))).click();
		WebElement w2= driver.findElement(By.id("leaveTypeName_0"));
		Select lt = new Select(w2);
		lt.selectByVisibleText("Sick Leave");
		wait.until(ExpectedConditions.elementToBeClickable(By.id("reason_0"))).sendKeys("Not feeling well");
		WebElement w3 = driver.findElement(By.id("Attribute1_Value_0"));
		Select r = new Select(w3);
		r.selectByVisibleText("Anemia");
		System.out.println("Working");
	}
	catch(Exception e) {
	System.out.println("Not Working");
		
	}
}
}
