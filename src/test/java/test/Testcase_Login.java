package test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.BeforeLoginPage;
import pages.HomePage;

import pages.LoginPage;

public class Testcase_Login {

	WebDriver driver = null;

	LoginPage objLogin;

	HomePage objHomePage;

	BeforeLoginPage objBeforeLogin;

	@BeforeTest

	public void setup() {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/home");

	}

	@Test(priority = 0)

	public void test_Home_Page_Appear_Correct() {

		// Create Login Page object
		objBeforeLogin = new BeforeLoginPage(driver);

		// Verify before go to login page title

		// Waitting time
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		assertTrue(driver.getTitle().contains("PHPTRAVELS | Travel Technology Partner"));

		// Go to login page

		objBeforeLogin.BeforeloginToPage();

		// Create Login Page object

		objLogin = new LoginPage(driver);

		// Verify login page title

		assertTrue(driver.getTitle().contains("Login"));

		// login to application

		objLogin.loginToPage("user@phptravels.com", "demouser");

		// go the next page

		objHomePage = new HomePage(driver);

		// Verify home page

		Assert.assertTrue(objHomePage.getHomePageDashboardUserName().contains("Hi, Demo User"));

	}

	@AfterTest
	public void tearDownTest() {

		// Waitting time
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// Close browser
		driver.close();
		System.out.println("Test Completed Successfully !");

	}
}
