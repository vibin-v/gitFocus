package com.gitfocus.helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingJQueryDDbyGenericmethod {

	public static void main(String[] args) 
	{
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		helper_selectValue(driver, "choice 2");
	
		

	}
	
	public static void helper_selectValue(WebDriver driver,String... value) 
	{
		WebElement multiSelectionDD = driver.findElement(By.id("justAnInputBox"));
		multiSelectionDD.click();
		
		List<WebElement> selectOptions = driver.findElements(By.xpath("//li[contains(@class,'ComboTreeItem')]"));
		int ddSize = selectOptions.size();
		System.out.println(ddSize);
		for(WebElement opt : selectOptions)
		{
			
			for(String val :value)
			{
				String optTxt = opt.getText();
				System.out.println(optTxt);
				if(optTxt.equals(val))
				{
					System.out.println("Found!!!!!!!!!");
					opt.click();
					break;
				}
			}
			
		}
		
	}
}
