package TestNgpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class program3 
{
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
	@Test(dataProvider="data3")
	public void testcase1(String input)
	{
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(input+Keys.ENTER);
	
	}
	
}
