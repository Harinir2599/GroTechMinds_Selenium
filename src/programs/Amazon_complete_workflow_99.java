package programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_complete_workflow_99  {
 public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("9025371260");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tejas@2025");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("purse");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='two-pane-results-container']/div/div[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='a-autoid-4-announce']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='proceedToRetailCheckout']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='pp-yk3REn-107']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("pp-aYpFl9-107"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-csa-c-id='4yb3zb-6lxm47-odjtsz-8wi6v5']"))).click();
		Set<String> s =driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String s1 = i.next();
		//String s2 = i.next();
		System.out.println(s1);
		//System.out.println(s2);
		
		
		
	}

	

}
