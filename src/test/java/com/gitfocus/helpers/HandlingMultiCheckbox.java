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



public class HandlingMultiCheckbox
{
	@Test
	public void helper_multiCheckbox() throws InterruptedException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://total-qa.com/checkbox-example/");
		
		
		driver.get("https://total-qa.com/checkbox-example/");
		List<WebElement> chkBoxes =driver.findElements(By.xpath("//div[@id='content']//p/input"));
		System.out.println(chkBoxes.size());
		for(WebElement chkBox: chkBoxes)
		{
			chkBox.click();
			Thread.sleep(2000);
			String chkOption = chkBox.getText();
		
			System.out.println("text:"+chkOption);
	
			
			Thread.sleep(2000);
		}
		
		
	}
}
