package com.gitfocus.helpers;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class HandlingautosDDAPI
{
	@Test
	public void helper_ddAPI() throws InterruptedException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		WebElement searLoc = driver.findElement(By.id("autocomplete"));
		searLoc.click();
		searLoc.sendKeys("India");
		Thread.sleep(3000);
		searLoc.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		Thread.sleep(3000);
		System.out.println("hiii");
		System.out.println(driver.findElement(By.xpath("//div[@class='pac-item']//span[3]")).getText());	
		List<WebElement> locations =driver.findElements(By.xpath("//div[@class='pac-item']//span[3]"));
		//System.out.println(locations.getText());
	
		System.out.println(locations.size());
		Thread.sleep(3000);
		for(WebElement locationn :locations)
		{
			Thread.sleep(3000);
			System.out.println(locationn.getText()); 
			;
		}
	}
}
