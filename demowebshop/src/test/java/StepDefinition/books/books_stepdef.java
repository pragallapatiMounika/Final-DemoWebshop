package StepDefinition.books;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demowebshop.Login;
import demowebshop.SelectBooks;
import utility.ScreenShot;

public class books_stepdef {
	WebDriver driver;
	Login login;
	SelectBooks selectbooks;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(books_stepdef.class.getName());
	
	 @Given("^User Is On My LoginPage$")
	    public void user_is_on_my_loginpage() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com/cart");
			
			login = new Login(driver);
			selectbooks = new SelectBooks(driver);
			screenshot = new ScreenShot(driver);
			logger.debug("Initializeing the driver and Browser");
			login.account();
	        //throw new PendingException();
	    }

	    @When("^User Fillup uid(.+)$")
	    public void user_fillup_uid(String username) throws Throwable {
	    	Thread.sleep(3000);
	    	login.SetEmail(username);
	    	logger.debug("Updating userName ");
	        //throw new PendingException();
	    }

	    @Then("^Click CompareList$")
	    public void click_comparelist() throws Throwable {
	    	selectbooks.compare();
	    	logger.debug("Selecting the books ");
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/Select1.png");
	        //throw new PendingException();
	    }

	    @And("^User Fillup pwd(.+)$")
	    public void user_fillup_pwd(String password) throws Throwable {
	    	logger.trace("filling up password");
	    	login.Setpassword(password);
	        //throw new PendingException();
	    }

	    @And("^User click LoginButton$")
	    public void user_click_loginbutton() throws Throwable {
	    	login.LoginBtnElement();
	    	logger.trace("press Login Button");
	        //throw new PendingException();
	    }

	    @And("^User clicks the books$")
	    public void user_clicks_the_books() throws Throwable {
	    	logger.trace("Select books ");
	    	selectbooks.books();
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/select2.png");
	        //throw new PendingException();
	    }

	    @And("^Click Computing$")
	    public void click_computing() throws Throwable {
	    	logger.info("take Screenshot");
	    	Thread.sleep(3000);
	    	selectbooks.Computing();
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/Select3.png");
	       
	    }
	
}