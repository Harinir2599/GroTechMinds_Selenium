package programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class ExcelSheet_numericValue {
	public static void main(String[] args) throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\1816775.INDIA\\GroTechMinds_Selenium\\Selenium_Testing\\ExcelSheet\\Numeric_harini.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		double username = w1.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		String mob = NumberToTextConverter.toText(username);
		System.out.println("My mobile number is"+ mob);
	}

}   
