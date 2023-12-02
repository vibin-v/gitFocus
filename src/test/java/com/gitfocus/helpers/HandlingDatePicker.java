package com.gitfocus.helpers;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;



public class HandlingDatePicker
{
	@Test
	public void helper_DatePicker() throws InterruptedException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='dateText']")).click();
		Thread.sleep(2000);
		WebElement selectDate = driver.findElement(By.xpath("//div[@class='DayTilesWrapper__RowWrap-sc-19pz9i8-1 fGGTDM'][3]/span/div/span"));
		selectDate.click();
		
		
	}
}
