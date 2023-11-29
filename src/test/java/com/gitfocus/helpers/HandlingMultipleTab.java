package com.gitfocus.helpers;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class HandlingMultipleTab
{
	@Test
	public void helper_windowHandling() 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abcddd");
		
		String windowID = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		 Iterator<String> it  = windowIDs.iterator();
		 String parentWindow = it.next();
		 String childWindow =it.next();
		 
		 System.out.println(parentWindow);
		 System.out.println(childWindow);
		
		
	}
}
