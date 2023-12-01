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



public class HandlingJSAlerts
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
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		
//		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
//		driver.findElement(By.xpath("//div[@id='OKTab']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
//		driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().dismiss();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@id='CancelTab']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Textbox']")).click();
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("dasa aefdzv");
		Thread.sleep(2000);
		System.out.println(alt.getText()); 
		Thread.sleep(2000);
		alt.accept();
	
		driver.navigate().to("https://www.redbus.in/");
	
		
		
	}
}
