package fb_source;
import org.openqa.selenium.WebElement;import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;import org.openqa.selenium.support.PageFactory;
public class Login_Facebook {
	ChromeDriver driver;
	//Step 1-locating each elements using @FindBy annotations
	@FindBy(id="email")
	WebElement emailid_un;
	@FindBy(name="pass")
	WebElement password;
	@FindBy(xpath="//button[@name='login']")
	WebElement login_button;
	
	//Step 2-Each elements should have separate methods and its action inside that
	public void un()
	{
		emailid_un.sendKeys("nilimakawle@gmail.com");
	}
	public void pwd()
	{
		password.sendKeys("Panchu@2010");
	}
	public void login()
	{
		login_button.click();
	}
	
	//step 3-Initializing the elements under constructor using pageFactory class
	public Login_Facebook(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
