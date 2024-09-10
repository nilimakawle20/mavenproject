package fb_source;
//searching a friend on facebook
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_Facebook {
	ChromeDriver driver;
	@FindBy(xpath="//input[@placeholder='Search Facebook']")
    WebElement search_tf;
	
	public void search_textbox()
	{
		search_tf.sendKeys("Dipti"+Keys.ENTER);
	}
	
	public Homepage_Facebook(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
