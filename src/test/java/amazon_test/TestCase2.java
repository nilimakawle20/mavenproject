/*Assignment 213 -WAP in maven project to search a product in Amazon*/
package amazon_test;
import org.openqa.selenium.Keys;
//searching the product
import org.testng.annotations.Test;

import amazon_source.HomePage;

public class TestCase2 extends Launch_Quit{
	@Test
	public void searching_the_product()
	{
		HomePage h1=new HomePage(driver);
		h1.search();
	}

}
