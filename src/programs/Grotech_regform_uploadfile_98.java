package programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Grotech_regform_uploadfile_98 {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Harini");
		driver.findElement(By.id("lname")).sendKeys("Ravi");
		driver.findElement(By.id("email")).sendKeys("hariniravi25.hr@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Haridec@250799");
		driver.findElement(By.id("Present-Address")).sendKeys("No 2 ,9th street,New Colony,Adambakkam,Chennai 88.");
		driver.findElement(By.id("Permanent-Address")).sendKeys("No 2 ,9th street,New Colony,Adambakkam,Chennai 88.");
		driver.findElement(By.id("Pincode")).sendKeys("600088");
		WebElement w = driver.findElement(By.id("Skills"));
		Select s = new Select(w);
		s.selectByVisibleText("Technical Skills");
		WebElement w1 = driver.findElement(By.id("technicalskills"));
		Select s1 = new Select(w1);
		s1.selectByVisibleText("Core Java");
		WebElement w2 = driver.findElement(By.id("Country"));
		Select s2 = new Select(w2);
		s2.selectByIndex(8);
		WebElement w3 = driver.findElement(By.id("Relegion"));
		Select s3 = new Select(w3);
		s3.selectByValue("Hindu");
		WebElement w4 = driver.findElement(By.id("file"));
		w4.sendKeys("C:\\Users\\1816775.INDIA\\Downloads\\Score Report CSeT-F Harini B R.pdf");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
