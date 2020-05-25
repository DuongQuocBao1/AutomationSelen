package Draft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	private static WebDriver driver =null;
	
	@BeforeTest
	public void setupTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();		
		
	}
	
	public static void main(String[] args) {
		googleSearchTest();
	}
	@Test
	public static void googleSearchTest() {
		
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
//		driver = new ChromeDriver();
		
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
//		driver.close();
//		System.out.println("Test Completed Successfully !");
	}
	
	@AfterTest
	public void tearDownTest() {
		
		//Close browser		
		driver.close();
		System.out.println("Test Completed Successfully !");
		
	}
	

}
