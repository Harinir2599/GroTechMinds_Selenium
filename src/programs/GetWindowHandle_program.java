package programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWindowHandle_program {
public static void main(String[] args) {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();;
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	String pid = driver.getWindowHandle();
	System.out.println(pid);

}
}
