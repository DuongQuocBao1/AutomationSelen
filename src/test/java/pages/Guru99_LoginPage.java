package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Guru99_LoginPage {

	WebDriver driver;

	By email = By.xpath("//div[@class='row']//div[1]//label[1]//input[1]");

	By password = By.xpath("//div[@class='col-md-6 bg-white-shadow pt-25 ph-30 pb-40']//div[2]//label[1]//input[1]");

	By btnLogin = By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");

	By emailAdmin = By.cssSelector(
			"div:nth-child(6) form.form-signin.form-horizontal.wow.fadeIn.animated.animated div:nth-child(1) label.input-outlined:nth-child(2) > input:nth-child(1)");

	By PasswordAdmin = By.cssSelector(
			"div:nth-child(6) form.form-signin.form-horizontal.wow.fadeIn.animated.animated div:nth-child(1) label.input-outlined:nth-child(3) > input:nth-child(1)");

	By btnLoginAdmin = By.cssSelector(
			"body:nth-child(2) div:nth-child(6) form.form-signin.form-horizontal.wow.fadeIn.animated.animated > button.btn.btn-primary.btn-block.ladda-button.fadeIn.animated.btn-lg:nth-child(2)");

	public Guru99_LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	// Set user name in textbox

	public void setUserName(String strUserName) {

		driver.findElement(email).sendKeys(strUserName);

	}

	// Set password in password textbox

	public void setPassword(String strPassword) {

		driver.findElement(password).sendKeys(strPassword);

	}

	// Click on login button

	public void clickLogin() {

		driver.findElement(btnLogin).click();

	}

	public void setUserNameAdmin(String strAdminName) {

		driver.findElement(emailAdmin).sendKeys(strAdminName);

	}

	// Set password in password textbox

	public void setPasswordAdmin(String strPass) {

		driver.findElement(PasswordAdmin).sendKeys(strPass);

	}

	// Click on login button

	public void clickLoginAdmin() {

		driver.findElement(btnLoginAdmin).click();

	}

	/**
	 * 
	 * This POM method will be exposed in test case to login in the application
	 * 
	 * @param strUserName
	 * 
	 * @param strPasword
	 * 
	 * @return
	 * 
	 */

	public void loginToGuru99(String strUserName, String strPasword) {

		// Fill user name

		this.setUserName(strUserName);
		// Waitting time
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// Fill password

		this.setPassword(strPasword);
		// Waitting time
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// Click Login button

		this.clickLogin();
	}

	public void loginToAdmin(String strAdminName, String strPass) {

		// Fill user name

		this.setUserNameAdmin(strAdminName);

		// Fill password

		this.setPasswordAdmin(strPass);
		// Waitting time
//		try {
//			Thread.sleep(1000);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		// Click Login button

		this.clickLoginAdmin();
	}

}
