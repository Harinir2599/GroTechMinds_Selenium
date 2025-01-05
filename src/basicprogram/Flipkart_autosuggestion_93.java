package basicprogram;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart_autosuggestion_93 {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']")).click();
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("9444863553");
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='_1wGnMD _1W0l9N _1DfMXZ']"))).click();		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shoe");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='AgOexi']//a[@class='OEFxE6']"))).click();
		

	
}
}
