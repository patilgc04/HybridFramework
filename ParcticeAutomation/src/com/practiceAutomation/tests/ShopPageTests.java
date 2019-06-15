package com.practiceAutomation.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.practiceAutomation.pages.Shop;

import utility.Configuration;

public class ShopPageTests {
	
	WebDriver driver;
	
	Shop shop;
		
	@BeforeTest
	public void browserSetup() {
		
		Configuration conf=new Configuration();
		
		driver=new ChromeDriver();
		
		driver.get(conf.getURL());
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		
	}
	@Test(priority=1)
	public void verifySlidersCount() {
		
		shop=new Shop(driver);
		
		int actualSlidersCount=shop.getSlidersCount();
		 
		Assert.assertEquals(actualSlidersCount, 3, "actualSlidersCount mismatch");
		
		/*
		 * SoftAssert softassert=new SoftAssert();
		 * softassert.assertEquals(actualSlidersCount, 3,
		 * "actualSlidersCount mismatch"); softassert.assertAll();
		 */
		
					
	}
	@Test(priority=2)
	public void verifyArriavalsCount() {
		
		shop=new Shop(driver);
		
		int actualCount=shop.getArrivalsCount();
		
		Assert.assertEquals(actualCount, 3);
		
		
		/*
		 * SoftAssert softassert=new SoftAssert(); softassert.assertEquals(actualCount,
		 * 3); softassert.assertAll();
		 */
	}
	
	@AfterTest
	public void quiteBrowser() {
		try {

			driver.quit();
			Runtime.getRuntime().exec("killall chromedriver");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
