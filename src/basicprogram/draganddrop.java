package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/drag-and-drop/");
	WebElement w1 = driver.findElement(By.id("container"));
	WebElement w2 = driver.findElement(By.id("div2"));
	WebElement w3 = driver.findElement(By.id("container-5"));
	Actions a = new Actions(driver);
	//a.dragAndDrop(w1, w2).perform();
	a.dragAndDrop(w3, w2).perform();
	
	
}
}
