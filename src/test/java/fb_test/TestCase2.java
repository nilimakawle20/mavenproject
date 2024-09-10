/*A211-WAP to login to facebook & Search for any friend using POM Concept*/
package fb_test;
//seraching friend on facebook
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;import fb_source.Homepage_Facebook;import fb_source.Login_Facebook;
public class TestCase2 {
	@Test
	public void login_searching()
	{
		ChromeOptions options=new ChromeOptions();
  //options.setExperimentalOption("excludeSwitches", List.of("disable-popup-blocking"));//JRE1.8 above req for List.of
		options.addArguments("--disable-notifications"); //This code works not above line
		ChromeDriver driver=new ChromeDriver(options);
		
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Login_Facebook l1=new Login_Facebook(driver);
		l1.un();
		l1.pwd();
		l1.login();
		
		Homepage_Facebook h1=new Homepage_Facebook(driver);
		h1.search_textbox();
	}
}
