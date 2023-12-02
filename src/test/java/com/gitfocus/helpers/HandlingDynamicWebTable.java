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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class HandlingDynamicWebTable
{
	@Test
	public void helper_WorkingWithLinks() throws InterruptedException 
	{
		WebDriver driver;
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.75");
		options.addArguments("high-dpi-support=0.75");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		driver.get("https://accounts.uat.mykademy.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("saas@enfintechnologies.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456ab");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		
		
		//Printing rowCount and column count
		driver.navigate().to("https://accounts.uat.mykademy.com/accounts?status=active");
		Thread.sleep(3000);
		WebElement pageCount = driver.findElement(By.xpath("//a[@class='paginate_button '][5]"));
		System.out.println(pageCount.getText());
		Integer totalPageCount = Integer.valueOf(pageCount.getText());
		System.out.println(totalPageCount);
		int rowCount = driver.findElements(By.xpath("//tbody//tr")).size();
		int colCount = driver.findElements(By.xpath("//tbody//tr[2]/td")).size();
		System.out.println("Total Row Count:"+rowCount);
		System.out.println("Total Column Count:"+colCount);
		Thread.sleep(3000);
	
//for(int p=1;p<=totalPageCount;p++)
//		{
			for(int i=1;i<=rowCount;i++)
			{
				
				for(int j=2;j<=colCount-1;j++)
				{
					WebElement data = driver.findElement(By.xpath("//tbody//tr["+i+"]/td["+j+"]"));
					System.out.println("   "+data.getText()); 
					
				}
			System.out.println("--------------------------------");
			}
		//}
	}
}
