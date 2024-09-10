/*Assignment 212 -WAP in maven project to login to Amazon*/
package amazon_test;
//login to amazon
import org.testng.annotations.Test;

import amazon_source.HomePage;
import amazon_source.Login_Amazon;

public class TestCase1 extends Launch_Quit{
	@Test
	public void login_to_amazon() throws InterruptedException
	{ 
		HomePage h1=new HomePage(driver);
		h1.accountlist(driver);
		h1.signin();
		
		Login_Amazon l1=new Login_Amazon(driver);
		l1.un();
		l1.cont();
		l1.pwd();
		l1.signin();
	}

}
