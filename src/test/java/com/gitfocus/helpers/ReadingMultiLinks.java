package com.gitfocus.helpers;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class ReadingMultiLinks
{
	@Test
	public void helper_multiLinks() throws InterruptedException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://total-qa.com/checkbox-example/");
		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//nav[@id='site-navigation']//a"));
		System.out.println(allLinks.size());
		
		List<String> linkText = new ArrayList<String>();
		for(WebElement aLink :allLinks)
		{
			String siteLink = aLink.getAttribute("href");
//			System.out.println(siteLink);
			
			linkText.add(siteLink);
			//Thread.sleep(2000);
		}
		System.out.println(linkText);
	}
}
