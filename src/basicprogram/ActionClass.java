package basicprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/left-double-click/");
		WebElement w = driver.findElement(By.id("mypopup5"));
		Actions a = new Actions(driver);
		a.doubleClick(w).perform();
		Thread.sleep(3000);
		driver.get("https://grotechminds.com/rightclick/");
		WebElement w1 = driver.findElement(By.className("has_eae_slider"));
		Actions a1 = new Actions(driver);
		a1.contextClick(w1).perform();
		Thread.sleep(3000);
		a1.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();	
		
	}

}
