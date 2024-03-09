package TESTNGEXECUTION;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAcccount_Script extends Base_Script_ {
	@Test
	 public void Create() {
		 driver.findElement(By.linkText("Create new account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Admin");
		 driver.findElement(By.name("lastname")).sendKeys("Admin1234");
		 driver.findElement(By.name("reg_email__")).sendKeys("Admin@gmail.com");
	 }

}
