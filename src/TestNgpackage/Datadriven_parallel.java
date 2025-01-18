package TestNgpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Datadriven_parallel {
	WebDriver driver;
	@DataProvider(name="data1")
	public Object[][] method()
	{
		
		return new Object[][] {{"shoe"},{"mobile"},{"earphone"},{"t shirt"},{"mouse"}};
	}
	@DataProvider(name="data2")
	public Object[][] method1()
	{
		
		return new Object[][] {{"paints"},{"mobile charger"},{"bluetooth headphones"},{"Socks"},{"Books"}};
	}
	@DataProvider(name="data3")
	public Object[][] method2()
	{
		
		Object data[][]=new Object[5][1];
		data[0][0]="shoe";
		data[1][0]="mobile";
		data[2][0]="mobile back cover";
		data[3][0]="mouse";
		data[4][0]="socks";
		return data;

	}
	@BeforeMethod
	@Parameters("browser")
	public void testcase(String nameofbrowser) {
		if(nameofbrowser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}
	@Test(dataProvider="data3")
	public void testcase1(String input)
	{
	
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input+Keys.ENTER);
	
	}
	@AfterMethod
	public void testcase3() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

}
