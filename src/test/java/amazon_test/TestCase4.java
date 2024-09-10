/*Assignment 215 -WAP in maven project to login to Amazon then search any product and add to wishlist*/
package amazon_test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import amazon_source.HomePage;
import amazon_source.ProductDetails_page;
import amazon_source.Search_Result;

public class TestCase4 extends Launch_Quit{
	@Test
	public void adding_to_cart()
	{
	HomePage h1= new HomePage(driver);
	    h1.search(); 
	   
	   Search_Result s1= new Search_Result(driver);
	   s1.click_selected_product();
	   
	   Set<String> ids=driver.getWindowHandles();// both parent and child id
	   Iterator<String> id= ids.iterator();
	   String parentid= id.next();// parent id
	   String childid= id.next();//1st child id
	   //Thread.sleep(3000);
	   driver.switchTo().window(childid);
   
       ProductDetails_page p= new ProductDetails_page(driver);
	   p.click_add_to_cart();
	}
}
