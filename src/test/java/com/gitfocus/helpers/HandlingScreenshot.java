package com.gitfocus.helpers;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class HandlingScreenshot
{
	@Test
	public void helper_ActionClass() throws InterruptedException, IOException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		driver.get("https://jqueryui.com/slider/");
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File targ = new File(".\\sshot\\home.png");
				
				FileUtils.copyFile(src, targ);
		
		
		
		
	}
}
