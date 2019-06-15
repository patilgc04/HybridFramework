package com.practiceAutomation.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp {
	
	/**
	 * @author Gajanan
	 * This page is used to initialize driver
	 *
	 */
	
	WebDriver driver;
	
	public BrowserSetUp(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void launchURL(String url) {
		driver.get(url);
		
		System.out.println("URL Launch complete================>");
	}
	
	public WebDriver intializeBrowser(String browser) {
		
		if(browser.equals("chrome")) {
			
			driver=new ChromeDriver();
			
			System.out.println("Chrome driver is ready to use================>");
						
			return driver;
			
			
		}
		else if(browser.equals("firefox")) {
			
			driver=new FirefoxDriver();
			
			return driver;
		}
		
		return null;
				
	}
	
	public void quiteBrowser() {
		try {

			driver.quit();
			Runtime.getRuntime().exec("killall.killall chromedriver");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
