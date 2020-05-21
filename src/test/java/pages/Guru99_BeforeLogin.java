package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Guru99_BeforeLogin {

    WebDriver driver;
    
    By ComboboxLogin = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
    
    By DropdownLogin = By.xpath("//a[@class='dropdown-item active tr']");


    public Guru99_BeforeLogin(WebDriver driver){
  	  
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


    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void BeforeloginToGuru99(){

    	//Click on combobox login
    	
    	this.clickCombobox();
    	
		//Waitting time
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    	
    	//Click on dropdown login
    	
    	this.clickDropdown();
    
    }

}