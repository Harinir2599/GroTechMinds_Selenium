package TestNgpackage;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parallel_testing {
	WebDriver driver ;
	@Parameters("browser")
	@BeforeMethod
	public void amazon_link(String nameofbrowser) {
		if(nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void amazon_login() {
	    driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hariniravi25.hr@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tejas@2024");
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
			
		}
	@AfterMethod
	public void logout_amazon() throws InterruptedException, IOException {
		TakesScreenshot t = (TakesScreenshot) driver;
		File f1 =t.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\1816775.INDIA\\GroTechMinds_Selenium\\Selenium_Testing\\Screenshot\\Amazon_login_with_paralleltesting.png");
		FileHandler.copy(f1, f2);
		/*
		 * Thread.sleep(1000); driver.quit();
		 */
		
	}
		
	}


