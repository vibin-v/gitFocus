package com.gitfocus.helpers;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class HandlingIframes
{
	@Test
	public void helper_JSAlerts() throws InterruptedException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://nxtgenaiacademy.com/iframe/");
		
		WebElement f1 = driver.switchTo().frame(0).findElement(By.xpath("//h2[@class='elementor-heading-title elementor-size-default']"));
		String f1Text = f1.getText();
		System.out.println(f1Text);
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h2/center")).getText()); 
		
	}
}
