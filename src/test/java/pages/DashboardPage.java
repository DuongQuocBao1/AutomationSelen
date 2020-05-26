package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DashboardPage {
	WebDriver driver = null;
    By ComboboxLogin = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
    By DropdownLogin = By.xpath("//a[@class='dropdown-item active tr']");
    public DashboardPage(WebDriver driver){ 
        this.driver = driver;
    }
    //Click on combobox login
    public void clickCombobox(){
            driver.findElement(ComboboxLogin).click();
    }
    //Click on dropdown login
    public void clickDropdown(){
            driver.findElement(DropdownLogin).click();
    }
    //Get the title of Login Page
    public void dashboardToLoginPage(){
    	//Click on combobox login
    	this.clickCombobox();
    	//Click on dropdown login
    	this.clickDropdown();
    }
}