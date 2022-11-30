package testLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageLayer.HomePage;
import pageLayer.HomePage2;

public class BuyProductTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\Driver\\ChromeDriver-106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoblaze.com/index.html#");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//--------------------------------------------
		HomePage2 home = new HomePage2(driver);
		
		home.clickOnPhonesLink();
		home.clickOnSamsungGalaxyS6();
		home.clickOnAddToCartButton();

	}

}
