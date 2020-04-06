package StepDefinition.shoppingCart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.Login;
import demowebshop.ShoppingCart;
import utility.ScreenShot;

public class shoppingCart_stepdef {
	  WebDriver driver;
	  Login login;
	   ShoppingCart shoppingCart; 
	   ScreenShot screenshot;
	   
	   final static Logger logger = LogManager.getLogger(shoppingCart_stepdef.class.getName());
	   
	   
	   
	   @Given("^User Is On My LoginPage$")
	    public void user_is_on_my_loginpage() throws Throwable {
		   
		   System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
					driver = new ChromeDriver();
					driver.get("http://demowebshop.tricentis.com/cart");
		    	
		    	login = new Login(driver);
		    	shoppingCart = new ShoppingCart(driver);
		    	screenshot = new ScreenShot(driver);
		    	login.account();
	        //throw new PendingException();
	    }

	    @When("^User Fillup uid(.+)$")
	    public void user_fillup_uid(String username) throws Throwable {
	    	login.SetEmail(username);
	        //throw new PendingException();
	    }

	    @Then("^click continue shopping$")
	    public void click_continue_shopping() throws Throwable {
	    	Thread.sleep(3000);
	    	logger.info("continue shopping");
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/shopping1.png");
	    	shoppingCart.continueshopping();
	    }

	    @And("^User Fillup pwd(.+)$")
	    public void user_fillup_pwd(String password) throws Throwable {
	    	login.Setpassword(password);
	       
	    }

	    @And("^User click LoginButton$")
	    public void user_click_loginbutton() throws Throwable {
	    	login.LoginBtnElement();
	    }

	    @And("^User Click The ShoppingCart$")
	    public void user_click_the_shoppingcart() throws Throwable {
	    	logger.debug("checks the list of items");
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/Shopping2.png");
	    	shoppingCart.cart(driver);
	    }

	    @And("^Clicks gotocart$")
	    public void clicks_gotocart() throws Throwable {

	   logger.error("go to cart");
	   shoppingCart.gotocart();
	   screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/Shopping3.png");
	    }

	}
	
	   
