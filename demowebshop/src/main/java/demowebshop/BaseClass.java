package demowebshop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	protected WebDriver driver;
	
	// To launch browser
	public WebDriver launchApplication(String browser){
		{
			if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "\"C:\\chromedriver_win32\\chromedriver.exe\"");
			driver = new ChromeDriver();
			}
			if(browser.equals("firefox")) {
				System.setProperty("webdriver.chrome.driver", "\"C:\\geckodriver-v0.26.0-win64\\geckodriver.exe\"");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			return driver;
		}
		}
	// To launch  Website

	public void OpenWebsite() {
		driver.get("http://demowebshop.tricentis.com");

	}


	// To close the browser
	public void quit() {
		driver.close();
	}

}
