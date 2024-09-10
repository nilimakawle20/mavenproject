/*Assignment 214 -WAP in maven project to register in Amazon*/
package amazon_test;
//registration in amazon

import org.testng.annotations.Test;

import amazon_source.HomePage;
import amazon_source.Registration_Amazon;

public class TestCase3 extends Launch_Quit{
	@Test
	public void register_to_amazon()
	{
	HomePage h1=new HomePage(driver);
	h1.accountlist(driver);
	h1.register_link();
	
	Registration_Amazon r1=new Registration_Amazon(driver);
	r1.enter_custname();
	r1.enter_mobile_number();
	r1.enter_password();
	r1.verify_mobile_number();
}
}
