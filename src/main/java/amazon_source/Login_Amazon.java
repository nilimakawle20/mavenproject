package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Amazon {
	ChromeDriver driver;
	//step1
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	//step2
	public void un()
	{
		username.sendKeys("nilimakawle@gmail.com");
	}
	public void cont()
	{
		continue_button.click();
	}
	public void pwd()
	{
		password.sendKeys("Nilima@20");
	}

	public void signin()
	{
		signin_button.click();
	}
	
	//step3
	public Login_Amazon(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
