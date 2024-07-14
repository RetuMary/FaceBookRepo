package verifyTest;

import org.testng.annotations.Test;

import pages.FaceBookLoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyLoginPage {


	@Test
	public void verifyValidlogin() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		FaceBookLoginPage page=new FaceBookLoginPage(driver);
		page.loginpage("Retumary@yahoo.com","321654ritu");
		driver.quit();
				
	



	}

}
