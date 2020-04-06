package StepDefinition.logout;

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
import demowebshop.WishList;
import utility.ScreenShot;

public class logout_stepdef {
	WebDriver driver;
	Login login;
	WishList wishlist;
	LogOut logout;
	ScreenShot screenshot;
	
	final static Logger logger = LogManager.getLogger(logout_stepdef.class.getName());
	
	@Given("^User Is On My LoginPage$")
    public void user_is_on_my_loginpage() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/cart");
			
			login = new Login(driver);
			wishlist = new WishList(driver);
			logout = new LogOut(driver);
			screenshot = new ScreenShot(driver);
		
			login.account();
	    	
		
        //throw new PendingException();
    }

    @When("^User Fillup uid(.+)$")
    public void user_fillup_uid(String username) throws Throwable {
    	login.SetEmail(username);
    	logger.info("enter userid");
    	
        //throw new PendingException();
    }

    @Then("^click Logout$")
    public void click_logout() throws Throwable {
    	logout.logout();
    	logger.debug("click logout");
    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/logout.png");
       // throw new PendingException();
    }

    @And("^User Fillup pwd(.+)$")
    public void user_fillup_pwd(String password) throws Throwable {
    	login.Setpassword(password);
    	
       // throw new PendingException();
    }

    @And("^User click LoginButton$")
    public void user_click_loginbutton() throws Throwable {
    	login.LoginBtnElement();
    	
       // throw new PendingException();
    }

    @And("^click wishlist$")
    public void click_wishlist() throws Throwable {
    	wishlist.wishlist();
    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/WishList.png");
    	
        //throw new PendingException();
    }

}
	
