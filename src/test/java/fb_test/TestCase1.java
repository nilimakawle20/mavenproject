/*A210-WAP to login to facebook using POM Concept*/
package fb_test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import fb_source.Login_Facebook;

//login to facebook
public class TestCase1 {
	@Test
	public void login()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Login_Facebook l1=new Login_Facebook(driver);
		l1.un();
		l1.pwd();
		l1.login();
	}

}
