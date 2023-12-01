package com.gitfocus.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingBootstrapDropdown 

{
	@Test
	public void helper_bootstrapDropdown()
	{
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.get("https://www.hdfcbank.com/");
		
		WebElement selectProductType = driver.findElement(By.xpath("//div[@class='dropdown']"));
		selectProductType.click();
		
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		int ptypeSize = products.size();
		System.out.println(ptypeSize);
//		
//		int proListcount = products.size();
//		System.out.println(proListcount);
//		for(int opt=1;opt<=proListcount;opt++)
//		{
//		WebElement selectProduct1 = driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li["+opt+"]"));
//		System.out.println(selectProduct1.getText());
//		}
		
		for( WebElement prodType : products)
		{
			String prodOptions = prodType.getText();
			System.out.println(prodOptions);
			if(prodOptions.equalsIgnoreCase("Deposits"))
			{
				prodType.click();
				break;
			}
			
		}
		
		WebElement selectProduct = driver.findElement(By.xpath("//div[@class='drp2']"));
		selectProduct.click();
		
		List<WebElement> productss = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		
		int prSize = productss.size();
		System.out.println(prSize);
		for(WebElement selPro : productss)
		{
			String selProText = selPro.getText();
			if(selProText.equalsIgnoreCase("Recurring Deposit"))
			{
				System.out.println("heiiiiiiiiii");
				selPro.click();
				break;
			}
		}
	}
}
