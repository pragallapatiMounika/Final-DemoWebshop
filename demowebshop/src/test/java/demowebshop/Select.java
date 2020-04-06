package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select {
	@FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Electronics')]")
    WebElement electronics;
	@FindBy(linkText="Cell phones")
	WebElement cellphones;
	@FindBy(linkText="Smartphone")
	WebElement smartphones;
	@FindBy(id="add-to-cart-button-43")
	WebElement cartBtn;
	public Select(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}
	
	// Clicking the Electronics
	
	public void ClickElectronics() {
		electronics.click();
	}
	
	//Selecting the cellphones
	
	public void ClickCellphones() {
		cellphones.click();
	
	}
	
	//  Choosing smartphones
	
	public void ClickSmartphones() {
		smartphones.click();
	}
	
	// Adding to cart
	 
	public void addtocart()
	{
		cartBtn.click();
	}
	
}