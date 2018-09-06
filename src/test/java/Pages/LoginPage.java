package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(name="Login")
	private WebElement inputLogin;

	@FindBy(name="pass")
	private WebElement inputPassword;

	@FindBy(xpath="//form[@name=\"lform\"]//input[@type=\"submit\"]")
	private WebElement webElement;
}
