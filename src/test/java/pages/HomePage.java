package pages;

import java.awt.List;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	String uuid = UUID.randomUUID().toString();
	String mail_uuid = uuid+"@gmail.com";
	By homePageUserName = By.cssSelector(
			"body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row.align-items-center div.col-md-6:nth-child(1) div.row.align-items-center.pl-30 div.col-md-8 > h3.text-align-left");
	By menuAccount = By.xpath("//ul[@id=\"social-sidebar-menu\"]/li[5]/a");
	By dropdownGuestcustomer = By.xpath("//ul[@id=\"ACCOUNTS\"]/li[4]/a");
	By titleOfGuestcustomer = By.xpath("//div[@id=\"content\"]/div[2]/div[1]");
	By btnAdd = By.xpath("//div[@id=\"content\"]/div[2]/form/button");
	By txtFisrtName = By.cssSelector(
			"body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.col-md-8 div.panel.panel-default div.panel-body div.panel-body div.col-md-6:nth-child(1) div.form-group > input.form-control");
	By txtLastName = By.cssSelector(
			"body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.col-md-8 div.panel.panel-default div.panel-body div.panel-body div.col-md-6:nth-child(2) div.form-group > input.form-control");
	By txtEmail = By.cssSelector(
			"body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.col-md-8 div.panel.panel-default div.panel-body div.panel-body div.col-md-6:nth-child(3) div.form-group > input.form-control");
	By txtPassword = By.cssSelector(
			"body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.col-md-8 div.panel.panel-default div.panel-body div.panel-body div.col-md-6:nth-child(4) div.form-group > input.form-control");
	By txtMobileNumber = By.cssSelector(
			"body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.col-md-8 div.panel.panel-default div.panel-body div.panel-body div.col-md-6:nth-child(5) div.form-group > input.form-control");
	By comboboxCountry = By.xpath("//div[@id=\"s2id_autogen1\"]/a");
	By dropdownCountry = By.cssSelector(
			"body.pace-done:nth-child(2) div.select2-drop.select2-display-none.select2-with-searchbox.select2-drop-active.select2-drop-above:nth-child(36) ul.select2-results li.select2-results-dept-0.select2-result.select2-result-selectable:nth-child(7) > div.select2-result-label");
	By txtAddress1 = By.cssSelector(
			"body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.col-md-8 div.panel.panel-default div.panel-body div.panel-body div.col-md-6:nth-child(8) div.form-group > input.form-control");
	By txtAddress2 = By.cssSelector(
			"body.pace-done:nth-child(2) div.wrapper:nth-child(8) div.col-md-8 div.panel.panel-default div.panel-body div.panel-body div.col-md-6:nth-child(9) div.form-group > input.form-control");
	By btnSubmitAdmin = By.xpath(
			"//button[@class='btn btn-primary btn-block btn-lg']");
    public HomePage(WebDriver driver) {
		this.driver = driver;
	}   
	// Get the User name from Home Page
	public String getHomePageDashboardUserName() {
		return driver.findElement(homePageUserName).getText();
	}
	public void clickMenuAccount() {
		driver.findElement(menuAccount).click();
	}
	public void clickdropdownGuestcustomer() {
		driver.findElement(dropdownGuestcustomer).click();
	}
	public void clickOnMenuAccountandDropdownGuestCustomer() {
		// Click menu Account
		this.clickMenuAccount();
		// Click dropdown GuestCustomer
		this.clickdropdownGuestcustomer();
	}
	public String getTextToVerifyPageGuestManagement() {
		return driver.findElement(titleOfGuestcustomer).getText();
	}
	public void Add() {
		driver.findElement(btnAdd).click();
	}
	public void setFisrtName(String strFN) {
		driver.findElement(txtFisrtName).sendKeys(strFN);
	}
	public void setLastName(String strLN) {
		driver.findElement(txtLastName).sendKeys(strLN);
	}
	public void setEmail(String strMail) {
		driver.findElement(txtEmail).sendKeys(strMail);
	}
	public void setPassword(String strPassw) {
		driver.findElement(txtPassword).sendKeys(strPassw);
	}
	public void setMobileNumber(String strMobileNb) {
		driver.findElement(txtMobileNumber).sendKeys(strMobileNb);
	}
	public void clickCountry() {
		driver.findElement(comboboxCountry).click();
	}
	public void clickDropdownCountry() {
		driver.findElement(dropdownCountry).click();
	}
	public void setAddress1(String strAddr1) {
		driver.findElement(txtAddress1).sendKeys(strAddr1);
	}
	public void setAddress2(String strAddr2) {
		driver.findElement(txtAddress2).sendKeys(strAddr2);
	}
	public void clickbtnSubmitAdmin() {
		driver.findElement(btnSubmitAdmin).click();
	}
	
	
//	public void setFN(String fn) {
//		driver.findElement(txtFisrtName).sendKeys(fn);
//	}
//	public void setLN(String ln) {
//		driver.findElement(txtLastName).sendKeys(ln);
//	}
//	public void setEmail(String email) {
//		driver.findElement(txtEmail).sendKeys(email);
//	}
//	public void setPassword(String passwrd) {
//		driver.findElement(txtPassword).sendKeys(passwrd);
//	}
//	public void setMn(String mn) {
//		driver.findElement(txtMobileNumber).sendKeys(mn);
//	}
//	public void setAdd1(String add1) {
//		driver.findElement(txtAddress1).sendKeys(add1);
//	}
//	public void setAdd2(String add2) {
//		driver.findElement(txtAddress2).sendKeys(add2);
//	}

	public void fillInData(String strFN, String strLN, String strMail, String strPassw, String strMobileNb,
			String strAddr1, String strAddr2)
	//String fn, String ln, String email, String passwrd, String mn, String add1, String add2
	{
//		GuestUser guestUser = new GuestUser();
//		guestUser.setFn("firstname");
//		guestUser.setLn("lastname");
//		guestUser.setEmail("email@gmail.com");
//		guestUser.setPasswrd("123456");
//		guestUser.setMn("0123456789");
//		guestUser.setAdd1("123 abc");
//		guestUser.setAdd2("abc 123");
		this.setFisrtName(strFN);
		this.setLastName(strLN);
		this.setEmail(strMail);
		this.setPassword(strPassw);
		this.setMobileNumber(strMobileNb);
		this.clickCountry();
		this.clickDropdownCountry();
		this.setAddress1(strAddr1);
		this.setAddress2(strAddr2);
		this.clickbtnSubmitAdmin();
	}

}
