package com.gitfocus.helpers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWaits 
{
	public void helper_alerts()
	{

		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Explicit wait
		WebDriverWait expTimeWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		expTimeWait.until(ExpectedConditions.elementToBeClickable(By.xpath("afdc")));
		
		//Fluentwait
		
	}
}
