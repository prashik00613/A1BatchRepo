package TESTNGEXECUTION;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login_Script extends Base_Script_ {
	@Test
	 public void FBLogin() {
		driver.findElement(By.id("email")).sendKeys("Admin@124gamil.com");
		driver.findElement(By.name("pass")).sendKeys("Admin123");
		driver.findElement(By.name("login")).submit();
		 
	 }

}
