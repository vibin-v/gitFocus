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
		
		String pwindowID = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		
		Set<String> windowIDs = driver.getWindowHandles();
		//Method 1 : Iterator
//		Iterator<String> it =windowIDs.iterator();
//		String parentWin = it.next();
//		String childWin = it.next();
		
		
		//Method 2: Array List
		ArrayList<String> windIDs = new ArrayList<String>(windowIDs);
//		
//		String pID = windIDs.get(0);
//		String cID = windIDs.get(1);
//		System.out.println(pID);
//		System.out.println(cID);
//		
//		//Switching between tabs
//		
//		driver.switchTo().window(pID);
//		System.out.println(driver.getTitle());
//		driver.switchTo().window(cID);
//		System.out.println(driver.getTitle());
//		
		
		//Method 3 using for loop
		
		for(String wid:windIDs)
		{
			//System.out.println(driver.switchTo().window(wid).getTitle());
			if(!wid.equals(pwindowID))
			{
				System.out.println("heii");
				driver.switchTo().window(wid);
				System.out.println(driver.switchTo().window(wid).getTitle());
			}
		}
		
	}
}
