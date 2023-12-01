package com.gitfocus.helpers;

import java.util.List;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandlingAutosuggestion
{
	@Test
	public void helper_autoSuggFlipkart() throws InterruptedException 
	{
	
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.90");
		options.addArguments("high-dpi-support=0.90");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		searchbox.sendKeys("iphone");
		searchbox.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	
		Thread.sleep(3000);
		List<WebElement> mobOptions = driver.findElements(By.xpath("//div[@data-tkid]"));
		System.out.println(mobOptions.size());
		
		System.out.println(driver.findElement(By.xpath("//div[@data-tkid]/a/div[2]/div/div")).getText());
		Thread.sleep(3000);
		for(WebElement mob : mobOptions)
		{
			String mobText = mob.getText();
			System.out.println(mobText);
		}
		
	}
	
	
	@Test
	public static void helper_autoSuggAmazon() throws InterruptedException
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.90");
		options.addArguments("high-dpi-support=0.90");
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement amzSearch = driver.findElement(By.id("twotabsearchtextbox"));
		amzSearch.sendKeys("iphone");
		//amzSearch.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> amzAuto= driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		System.out.println(amzAuto.size()); 
		Thread.sleep(3000);
		for(WebElement opt :amzAuto)
		{
			String optText = opt.getText();
			System.out.println(optText);
		}
		
		
		
	}
}
