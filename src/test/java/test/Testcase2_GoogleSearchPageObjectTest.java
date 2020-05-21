package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObject;

public class Testcase2_GoogleSearchPageObjectTest {
	
	private static WebDriver driver =null;
	
	public static void main(String[] args) {
		googleSearchTest();
	}
	public static void googleSearchTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		
		driver.get("https://www.google.com/");
		
		searchPageObj.setTextInSearchtBox("This is bla bla bla");
		
		searchPageObj.clickSearchtButton();
		
		//Waitting time
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
		//Close browser		
		driver.close();
		
	}

}
