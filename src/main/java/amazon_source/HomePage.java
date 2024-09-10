package amazon_source;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	ChromeDriver driver;
	//step1
	@FindBy(id="nav-link-accountList")
	WebElement accountandlist;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signinbutton;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_field;
	
	@FindBy(xpath="(//a[.='Start here.'])[1]")
	WebElement start_here_link;
	
	//step2
	public void accountlist(ChromeDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountandlist).perform();;
	}

	public void signin() throws InterruptedException
	{
		signinbutton.click();
	}
	
	public void search()
	{
		search_field.sendKeys("shoe"+Keys.ENTER);
	}
	
	public void register_link()
	{
		start_here_link.click();
	}
	
	//step3
	public HomePage(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
