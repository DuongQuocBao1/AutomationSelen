package test;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


import pages.Guru99_HomePage;

import pages.Guru99_LoginPage;

public class Testcase_AddAccountByAdmin {

	WebDriver driver = null;

	Guru99_LoginPage objLogin;

	Guru99_HomePage objHomePage;


	@BeforeTest

	public void setup() {

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.phptravels.net/admin");

	}

	@Test(priority = 0)

	public void testcase_AddAccount() {

		// Create Login Page object

		objLogin = new Guru99_LoginPage(driver);

		// login to application

		objLogin.loginToAdmin("admin@phptravels.com", "demoadmin");

		// go the next page

		objHomePage = new Guru99_HomePage(driver);

		// goto GuestCustomer in menu Account
		
		objHomePage.clickOnMenuAccountandDropdownGuestCustomer();
		
		// Waitting time
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		// Verify home page
		
		assertTrue(driver.getTitle().contains("Guest Management"));

		objHomePage.Add();
		
		objHomePage.fillInData("Duongg", "Quoc Baoo69", "baodq9@gmail.com", "12561a1", "0123458679", "123 1abc", "3211 cba");

		objHomePage.clickbtnSubmitAdmin();
		
		// Waitting time
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
		
		assertTrue(objHomePage.getTextToCompareEmailAdded().contains("Quoc Baoo69"));
	}

	@AfterTest
	public void tearDownTest() {

		// Waitting time
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// Close browser
		driver.close();
		System.out.println("Successfully !");

	}
}
