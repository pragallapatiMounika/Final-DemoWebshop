package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	WebElement cart;	
	@FindBy(xpath ="//input[@value='Go to cart']")
	WebElement gotocart;
	@FindBy(xpath="//input[@name='continueshopping']")
	//@FindBy(className ="button-2 continue-shopping-button")
	WebElement continueshopping;

	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	// move to shopping cart 

	public void cart( WebDriver driver) throws InterruptedException  {
		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(cart).build().perform();
		Thread.sleep(5000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	// Clicking go to cart

	public void gotocart() {
		
	     gotocart.click();
	}
	
	// clicking continue shopping

	public void continueshopping() throws InterruptedException {
		
		Thread.sleep(3000);
		
		continueshopping.click();
	}

}