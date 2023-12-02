package com.gitfocus.helpers;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class HandlingActionClass
{
	@Test
	public void helper_ActionClass() throws InterruptedException 
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
		
		Actions act = new Actions(driver);
		WebElement abc = driver.findElement(By.xpath("xyz"));
		act.moveToElement(abc).build().perform();
		act.contextClick(abc).build().perform();
		act.doubleClick().build().perform();
		act.dragAndDrop(abc, abc).build().perform();
		
		//act.moveToElement((WebElement) By.xpath("fsdzcx")).build().perform();
		
		
	}
}
