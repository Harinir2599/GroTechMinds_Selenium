package TestNgpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Amazon_login_logout_assert {
	@Test
	public void testcase() {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		WebElement e = driver.findElement(By.xpath("//input[@type='email']"));
		e.sendKeys("9025371260");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		WebElement w=driver.findElement(By.xpath("//input[@id='ap_password']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(w)).sendKeys("Tejas@2025");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
		boolean b1 = w1.isDisplayed();
	    Assert.assertEquals(b1, true,"Harini,Login Successfull");
	    Actions a1 = new Actions(driver);
	    WebElement w2 = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	    a1.moveToElement(w2).perform();
	    WebElement w3 = driver.findElement(By.xpath("//span[normalize-space()='Sign Out']"));
	    w3.click();
	    WebElement e2 = driver.findElement(By.xpath("//input[@type='email']"));
        boolean b2 = e2.isDisplayed();
        Assert.assertEquals(b2, true,"Harini,Logout successfull");
	
	}
}
