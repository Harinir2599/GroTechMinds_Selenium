package programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ExcelSheet_program {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\1816775.INDIA\\GroTechMinds_Selenium\\Selenium_Testing\\ExcelSheet\\Harini.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username = w1.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		String password = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
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
