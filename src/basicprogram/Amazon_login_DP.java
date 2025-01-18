package basicprogram;

//login to amazon with different set of data 
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_login_DP {

	@DataProvider(name="login")
	public Object[][] logindetails()
	{
	Object data[][]=new Object[5][2];	
		//set 1->login with valid email id and password
		data[0][0]="stbymkt@gmail.com";//un 1
		data[0][1]="jhgfds4567"; //pwd0
		//set 2-0>login with valid mobile no and password
		data[1][0]="8009900785";//un 2
		data[1][1]="manish654"; //pwd
		//set 3-valid email id and wrong password
		data[2][0]="stbymkt@gmail.com";//un 3
		data[2][1]="4rty3456"; //pwd
		//set 4-valid mobile no and wrong password
		data[3][0]="8009900785";//un
		data[3][1]="jhgf65"; //pwd
		//set 5->wrong username and wrong password
		data[4][0]="manissh@gmail.com";//un
		data[4][1]="6543tre"; //pwd
		return data;
		
		
	}

	@Test(dataProvider="login")
	public void testcase(String username, String password) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		

	}

}
