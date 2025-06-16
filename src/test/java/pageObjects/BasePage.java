package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;
	
	// Constructor to initialize PageFactory
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
