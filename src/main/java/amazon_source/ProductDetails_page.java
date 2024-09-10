package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetails_page {
	ChromeDriver driver;
	  @FindBy(id="add-to-cart-button")
	  WebElement add_to_cart_btn;
	  
	  
	  public void click_add_to_cart()
	  {
		  add_to_cart_btn.click();
	  }
	  
	  public ProductDetails_page(ChromeDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

}
