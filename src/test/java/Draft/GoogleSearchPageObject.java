package Draft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObject {
	
	WebDriver driver = null;
	
	By txtSearch = By.xpath("//input[@name='q']");
	By btnSearch = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");

	public GoogleSearchPageObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInSearchtBox(String text) {
		driver.findElement(txtSearch).sendKeys(text);
	}
	public void clickSearchtButton() {
		driver.findElement(btnSearch).click();
	}
}
