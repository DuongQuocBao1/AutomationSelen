package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class Testcase1_GoogleSearch {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//goto google.com
		driver.get("https://www.google.com/");
		
		//enter text in search textbox
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("this is text Page Object Model");
		
		GoogleSearchPage.textboxSearch(driver).sendKeys("this is text Page Object Model");
		
		//click on search button
//		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click(); //Click mouse
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN); //Press on enter
		
		
		//Waitting time
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");
	}
}
