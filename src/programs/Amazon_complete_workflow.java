package programs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_complete_workflow {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hariniravi25.hr@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tejas@2024");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("purse");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='two-pane-results-container']/div/div[3]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='a-autoid-4-announce']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='nav-a nav-a-2 nav-progressive-attribute']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='proceedToRetailCheckout']"))).click();
		Set<String> s =driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		String s1 = i.next();
		//String s2 = i.next();
		System.out.println(s1);
		//System.out.println(s2);
		
		
		
	}

}
