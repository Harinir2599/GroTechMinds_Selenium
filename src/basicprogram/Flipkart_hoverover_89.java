package basicprogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverover_89 {
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	WebElement e1 = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[4]"));
	Actions a1 = new Actions(driver);
	a1.moveToElement(e1).perform();
	Thread.sleep(3000);
	WebElement e2 = driver.findElement(By.linkText("Bluetooth Speakers"));
	e2.click();
}
}
