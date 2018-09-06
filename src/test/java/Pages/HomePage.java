package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(css="\"//span[@class='user_name']\"")
	private WebElement labelUserName;


}
