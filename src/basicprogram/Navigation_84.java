package basicprogram;
import org.openqa.selenium.chrome.ChromeDriver;
public class Navigation_84 {
public static void main(String[] args) {
	ChromeDriver driver = new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	
}
}
