package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FaceBookLoginPage {


	//lunch webdriver.
		 WebDriver driver;
		
		//Make constructor
		
		public FaceBookLoginPage (WebDriver driver ) {	
		this.driver=driver;
	}
		//locators
			By username=By.name("email");
			By password=By.id("pass");
			By loginbtn= By.xpath("//button[@type='submit']");
			
		//make method for call
			public void loginpage(String eml,String pas) {
			
			driver.findElement(username).sendKeys("eml");
			driver.findElement(password).sendKeys("pas");
			driver.findElement(loginbtn).click();
	}
		
	public void ProvideEmail(String eml) {
			driver.findElement(username).sendKeys("Retumary@yahoo.com"); }

	public void ProvidePassWord(String pas) {
		
			driver.findElement(password).sendKeys("321654ritu");
		}

	public void ClickLoginButtont() {
		
			driver.findElement(loginbtn).click();	}










}
