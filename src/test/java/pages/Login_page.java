package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTest;

public class Login_page extends BaseTest {

	public Login_page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement usernameTestBox;

	@FindBy(id = "password")
	WebElement passwordTestBox;

	@FindBy(id = "login")
	WebElement loginButton;

	public void username(String text) {
		usernameTestBox.sendKeys(text);
	}

	public void passwordBox(String text) {
		passwordTestBox.sendKeys(text);
	}

	public void loginButton() {
		loginButton.click();
	}

}
