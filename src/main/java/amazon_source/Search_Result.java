package amazon_source;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Result {
	ChromeDriver driver;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]")
	WebElement selected_product;

	public void click_selected_product()
	{
		selected_product.click();
	}

	public Search_Result(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
