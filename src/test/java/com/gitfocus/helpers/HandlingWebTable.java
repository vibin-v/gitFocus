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



public class HandlingWebTable
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
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		//Printing rowCount and column count
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colCount = driver.findElements(By.xpath("//table[@id='customers']//tr/th")).size();
		System.out.println("Total Row Count:"+rowCount);
		System.out.println("Total Column Count:"+colCount);
		Thread.sleep(3000);
		//System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr[1]/td[1]/span")).getText());
		//Printing all values
		for(int i=2;i<=rowCount;i++)
		{
			
			for(int j=1;j<=colCount;j++)
			{
				WebElement data = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]/span"));
				System.out.println("   "+data.getText()); 
				if(data.getText().equals("Microsoft"))
				{
					System.out.println("Heiiii found Microsoft");
					break;
				}
				
			}
			System.out.println("-------------------------------------------------");
		}
		
	}
}
