package basicprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apollo_phram_program {
	public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.apollopharmacy.in");
            WebElement e1 = driver.findElement(By.className("SearchPlaceholder_searchRoot__LWDXI"));
            e1.click();
            WebElement e2 = driver.findElement(By.xpath("//input[@placeholder='Search medicines, brands and more']"));
            e2.sendKeys("pcm");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            WebElement e3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@aria-label='Add'])[2]")));
            e3.click();
            System.out.println("Item added to the cart successfully!");

        } catch (Exception e) {
        	 System.out.println("Item not added to the cart");
        } 
    }


}
