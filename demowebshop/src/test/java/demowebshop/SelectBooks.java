package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectBooks {
	@FindBy(linkText="Books")
	WebElement books;
	@FindBy(linkText="Computing and Internet")
	WebElement computingandInternet;
	@FindBy(xpath ="//input[@class='button-2 add-to-compare-list-button']")
	WebElement comparelistBtnElement;
			
	
	
	public SelectBooks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}
	
	public void books()
	{
		books.click();
	}
	public void Computing() {
		computingandInternet.click();
		
	}
	public void compare() {
		comparelistBtnElement.click();
	}
}
