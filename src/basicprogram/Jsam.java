package basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Jsam {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/1816775.INDIA/Downloads/jsam.html");
		WebElement w = driver.findElement(By.name("fname"));
		boolean b1 = w.isEnabled();
		
		if(b1==true) {
			w.sendKeys("Harini");
			System.out.println("The first name tab is enabled");
		}
		else
		{
			System.out.println("It is not enabled");
		}
		WebElement w1 = driver.findElement(By.name("lname"));
		boolean b2 = w1.isEnabled();
		if(b2==true) {
			w1.sendKeys("Ravi");
			System.out.println("The Last name tab is enabled");
		}
		else
		{
			System.out.println("The Last name is not enabled");
		}
		boolean d1 = w.isDisplayed();
		if(d1==true) {
			System.out.println("First name is displayed");
		}
		else {
			System.out.println("first name is not displayed");
		}
		WebElement w3 = driver.findElement(By.name("name1"));
		w3.click();
		boolean s1 = w3.isSelected();
		if(s1==true) {
			System.out.println("Boy checkbox is selected");
		}
		else {
			System.out.println("Not Selected");
		}
		WebElement w4 = driver.findElement(By.name("name2"));
		boolean s2 = w4.isSelected();
		if(s2==true) {
			System.out.println("Girl checkbox is selected");
		}
		else {
			System.out.println("Girl checkbox is not selected");
		}
		
		
	}

}
