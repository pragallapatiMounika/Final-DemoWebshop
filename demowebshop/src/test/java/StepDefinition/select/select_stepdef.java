package StepDefinition.select;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.LogOut;
import demowebshop.Login;
import demowebshop.Select;
import demowebshop.SelectBooks;
import demowebshop.ShoppingCart;
import demowebshop.WishList;
import utility.ScreenShot;

public class select_stepdef {
	    
	
	WebDriver driver;
	Login login;
	Select select;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(select_stepdef.class.getName());
	
	
	 @Given("^User Is On My LoginPage$")
	    public void user_is_on_my_loginpage() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/cart");
			
			login = new Login(driver);
			select = new Select(driver);
			screenshot = new ScreenShot(driver);
			login.account();
			
	        //throw new PendingException();
	    }

	    @When("^User Fillup uid(.+)$")
	    public void user_fillup_uid(String username) throws Throwable {
	    	Thread.sleep(3000);
	    	login.SetEmail(username);
	       
	        //throw new PendingException();
	    }

	    @When("^click cellphones$")
	    public void click_cellphones() throws Throwable {
	    	select.ClickCellphones();
	    	logger.info("click the cellphones");
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/electronics1.png");
	        //throw new PendingException();
	    }

	    @Then("^click addtoCart$")
	    public void click_addtocart() throws Throwable {
	    	select.addtocart();
	    	logger.info("add to cart ");
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/addcart.png");
	        //throw new PendingException();
	    }

	    @And("^User Fillup pwd(.+)$")
	    public void user_fillup_pwd(String password) throws Throwable {
	    	login.Setpassword(password);
	        //throw new PendingException();
	    }

	    @And("^User click LoginButton$")
	    public void user_click_loginbutton() throws Throwable {
	    	login.LoginBtnElement();
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/login.png");
	        //throw new PendingException();
	    }

	    @And("^User Clicks Electronics$")
	    public void user_clicks_electronics() throws Throwable {
	    	select.ClickElectronics();
	    	logger.debug("choose the electronics");
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/Smartphones.png");
	        //throw new PendingException();
	    }

	    @And("^click smartPhones$")
	    public void click_smartphones() throws Throwable {
	    	select.ClickSmartphones();
	        //throw new PendingException();
	    }

	}

	 