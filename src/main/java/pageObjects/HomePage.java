package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By hpl = By.id("welcome");
	By logOutLink = By.linkText("Logout");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement clickWelcome() {
		return driver.findElement(hpl);
	}
	
	public WebElement logout() {
		return driver.findElement(logOutLink);
	}
}
