import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TEST_SCRIPT_SELENIUM01 {
	@Test
	public void TestLogin() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//Enter username
		driver.findElement(By.id("email")).sendKeys("Admin@124gamil.com");
		//Enter password
		driver.findElement(By.id("pass")).sendKeys("Admin123");
	}

}
