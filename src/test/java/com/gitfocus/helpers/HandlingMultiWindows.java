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



public class HandlingMultiWindows
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
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindow = driver.getWindowHandle();
		WebElement currentWindow = driver.findElement(By.id("newWindowBtn"));
		System.out.println("ParentWindowID="+parentWindow);
		currentWindow.click();
		currentWindow.click();
		Set<String> windowIDS = driver.getWindowHandles();
		System.out.println(windowIDS);
		ArrayList<String> winIDs = new ArrayList<String>(windowIDS);
		for(String windowID : winIDs)
		{
			if(!parentWindow.equals(windowID))
			{
				System.out.println("heiiii i'm at child!!!!!!!1");
				driver.switchTo().window(windowID);
				driver.manage().window().maximize();
				System.out.println(driver.getCurrentUrl());
				driver.close();
			}
		}
		
	}
}
