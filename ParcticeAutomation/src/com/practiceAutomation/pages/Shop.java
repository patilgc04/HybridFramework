/**
 * 
 */
package com.practiceAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Gajanan
 * Page object model without Page Factory
 *
 */
public class Shop {
	
	WebDriver driver;
	
	By shop=By.linkText("Shop");
	
	By home=By.linkText("Home");
	
	By actualSlidersCount=By.xpath("//*[contains(@id,\'n2-ss-')]");
	
	By actualArrivalCount=By.xpath("//*[@class='woocommerce-LoopProduct-link']");
	
	
	public Shop(WebDriver driver) {
		
		this.driver=driver;
	}
	
		
	public int getSlidersCount() {
		
		
		driver.findElement(shop).click();
				
		driver.findElement(home).click();
		
		int count=driver.findElements(actualSlidersCount).size();
		
		System.out.println("Sliders Count:============>"+count);
		
		return count;
		
		
	}
	
	
public int getArrivalsCount() {
		
		
		driver.findElement(shop).click();
				
		driver.findElement(home).click();
		
		int count=driver.findElements(actualArrivalCount).size();
		
		System.out.println("Arrival Count:============>"+count);
		
		return count;
		
		
	}
	
}
