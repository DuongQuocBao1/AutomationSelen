package test;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.GuestUser;
import pages.HomePage;

import pages.LoginPage;

public class Testcase_AddAccountByAdmin {
	WebDriver driver = null;
	LoginPage objLogin;
	HomePage objHomePage;
	boolean present;
	String uuid;
	String mail_uuid;
	String guestUser;
	@BeforeTest
	public void setup() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/admin");
		driver.manage().window().maximize();
	}
	@Test(priority = 0)
	public void testcase_AddAccount() {
		// Create Login Page object
		objLogin = new LoginPage(driver);
		// login to application
		objLogin.loginToAdmin("admin@phptravels.com", "demoadmin");
		// go the next page
		objHomePage = new HomePage(driver);
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
		objHomePage.fillInData("Duong","Bao","baodq@gmail.com", "123456", "0123458679", "123 abc", "321 cba");//uuid,uuid,"baodq69@gmail.com", "123456", "0123458679", "123 abc", "321 cba"
		// Waitting time
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}		  
		  try {
		     driver.findElement(By.xpath("//table[@class='xcrud-list table table-striped table-hover']/tbody//td[text()='Duong']/following-sibling::td[text()='Bao']/following-sibling::td/a[text()='baodq@gmail.com']"));
		     present = true;
		  } catch (NoSuchElementException e) {
		     present = false;
		  }
	}
	@AfterTest
	public void tearDownTest() {
//		String a = "//table[@class='xcrud-list table table-striped table-hover']/tbody//td[text()='"+uuid+"']/following-sibling::td[text()='"+uuid+"']/following-sibling::td/a[text()='"+mail_uuid+"']";
//		System.out.println(a);
		// Close browser
		driver.close();
		System.out.println("Successfully !");
	}
}
