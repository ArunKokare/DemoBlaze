package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.HomePage;
import pageLayer.LoginPage;

public class LoginPageTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\Driver\\ChromeDriver-106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//-------------------------------------------------
		HomePage home = new HomePage(driver);
		LoginPage login=new LoginPage(driver);
		
		//-------------------------------------------------
		home.clickOnLoginLink();
		login.enterUsername();
		login.enterPassword();
		login.clickOnLoginButton();
		
		
		

	}

}
