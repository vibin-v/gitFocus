package com.gitfocus.helpers;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HandlingDownloads 
{
	@Test
	public void helper_Downloads() throws InterruptedException
	{



		String location = System.getProperty(".\\sshot");
		
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", location);
		
		
		ChromeOptions option = new ChromeOptions();
	
		option.addArguments("force-device-scale-factor=0.75");
		option.addArguments("high-dpi-support=0.75");
		option.setExperimentalOption("pref", preferences);
		WebDriver driver;
		driver = new ChromeDriver(option);
	
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElement(By.xpath("//a[text()='Download sample pdf file']")).click();
		Thread.sleep(3000);
	}
}
