package demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.deps.com.thoughtworks.xstream.io.xml.DomDriver;

public class Login {
	@FindBy(linkText="Log in")
	WebElement login;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id ="Password")
	WebElement password;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
	WebElement loginBtnElement;


public Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	//this.driver = driver;
}
   // To click login Button
public void account() {
	login.click();
}

    // To enter Email
     public void SetEmail(String Email) {
	email.sendKeys("lioness@gmail.com");
}
     
     // To enter password   
  public void Setpassword(String Password) {
	password.sendKeys("lioncub");
}
   // To click login Button
   public void LoginBtnElement() {
	loginBtnElement.click();
	
}

}
