package TestNgpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void crossbrowsertesting(String nameofbrowser) {
		if(nameofbrowser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}

}
