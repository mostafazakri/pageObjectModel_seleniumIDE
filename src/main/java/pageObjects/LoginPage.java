package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By loginButton = By.id("btnLogin");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement enterUsername() {
		return driver.findElement(username);
	}
	
	public WebElement enterPSW() {
		return driver.findElement(password);
	}
	
	public WebElement LogIn() {
		return driver.findElement(loginButton);
	}
}
