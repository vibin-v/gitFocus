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



public class HandlingSlider
{
	@Test
	public void helper_Slider() throws InterruptedException, IOException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement sliderFrom = driver.findElement(By.xpath("//div[@id='slider']/span"));
		System.out.println(sliderFrom.getLocation());
		System.out.println(sliderFrom.getSize());
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(sliderFrom, 50, 0).build().perform();
		
		//TakesScreenshot ts = (TakesScreenshot) driver;
		File src = sliderFrom.getScreenshotAs(OutputType.FILE);
		//File src = ts.getScreenshotAs(OutputType.FILE);
		File targ = new File(".//sshot//hdd.png");
		FileUtils.copyFile(src, targ);
		
		
		
		
	}
}
