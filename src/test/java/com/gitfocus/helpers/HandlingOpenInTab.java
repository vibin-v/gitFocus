package com.gitfocus.helpers;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class HandlingOpenInTab
{
	@Test
	public void helper_OpenInTab() throws InterruptedException, IOException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		WebElement devl = driver.findElement(By.linkText("Development"));
		String trig = Keys.chord(Keys.CONTROL,Keys.ENTER);
		devl.sendKeys(trig);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_scroll");
		
		
		
		
		
	}
}
