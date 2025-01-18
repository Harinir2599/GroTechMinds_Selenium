package TestNgpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Amazon_newcustomer {
	
	@Test
	public void testcase() {
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D1316117075677939%26hvadid%3D82257581530470%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D158537%26hvnetw%3Do%26hvqmt%3De%26hvtargid%3Dkwd-82258246554589%253Aloc-90%26hydadcr%3D5623_2377284%26mcid%3D%26ref%3Dpd_sl_7e9bstin27_e%26tag%3Dmsndeskstdin-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_customer_name")).sendKeys("Harini Ravi");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9444863553");
		driver.findElement(By.id("ap_password")).sendKeys("Shivani@2025");
		
		
		
	}

}
