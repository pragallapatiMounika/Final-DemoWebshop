package StepDefinition.login;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import demowebshop.Login;
import utility.ScreenShot;


public class login_stepdef {
	WebDriver driver;
	Login login;
	ScreenShot screenshot;
	final static Logger logger = LogManager.getLogger(login_stepdef.class.getName());
	

	@Given("^User Is On My LoginPage$")
	public void user_is_on_my_loginpage() throws Throwable {
		// throw new PendingException();
		System.setProperty("webdriver.chrome.driver", "C://chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/cart");
		logger.info("dfefw");
		login = new Login(driver);
		screenshot=new ScreenShot(driver); 
		login.account();
	}

	

	    @When("^User Fillup uid (.+)$")
	    public void user_fillup_uid(String username) throws Throwable {
	    	Thread.sleep(3000);
	    	logger.info(" password enters");
	    	login.SetEmail(username);
	       
	    }

	    @Then("^User click LoginButton$")
	    public void user_click_loginbutton() throws Throwable {
	    	login.LoginBtnElement();
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/Login.png");
	       // throw new PendingException();
	    }

	    @And("^User Fillup pwd (.+)$")
	    public void user_fillup_pwd(String password) throws Throwable {
	        //throw new PendingException();
	    	login.Setpassword(password);
	    	screenshot.takeSnapShot("C:/Users/krishnachandana/eclipse-workspace/demowebshop/src/test/resources/SSdemoweb/login1.png");
	    }
}
