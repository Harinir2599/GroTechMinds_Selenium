package basicprogram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginamazon_83 {

	@Test
	public void testcase() throws InterruptedException
	{
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.findElement(By.id("ap_email")).sendKeys("9444863553");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Manish@2024");
	driver.findElement(By.id("signInSubmit")).click();
	//using linktext to click on customer service
//	driver.findElement(By.linkText("Customer Service")).click();
//	driver.findElement(By.partialLinkText("Car")).click();
	WebElement w1 = driver.findElement(By.id("twotabsearchtextbox"));
	Assert.assertEquals(w1.isDisplayed(), true);	
	
	
	
}
}
