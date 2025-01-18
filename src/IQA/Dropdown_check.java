//A drop-down has more than 1000 options. How would you verify that all options are loaded correctly?

package IQA;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_check {
	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().minimize();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement w1 = driver.findElement(By.id("Choice3"));
		Select s = new Select(w1);
		s.selectByContainsVisibleText("Power1");
		List<WebElement> l = driver.findElements(By.id("Choice3"));
		int no = l.size();
		System.out.println(no);
		for(WebElement option : l) {
			String s1 = option.getText();
			if(s1.isEmpty()) {
				System.out.println("There is no text");
			}
			else {
				System.out.println(s1);
			}
			
		}
		
		


}
}
