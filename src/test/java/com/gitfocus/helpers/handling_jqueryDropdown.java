package com.gitfocus.helpers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class handling_jqueryDropdown 
{
	@Test
	public void helper_jqueryDDown() throws InterruptedException
	{
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		WebElement multiSelectionDD = driver.findElement(By.id("justAnInputBox"));
		multiSelectionDD.click();
		
		List<WebElement> selectOptions = driver.findElements(By.xpath("//li[contains(@class,'ComboTreeItem')]"));
		int ddSize = selectOptions.size();
		System.out.println(ddSize);
		
		for(WebElement selectOne:selectOptions)
		{
			String optText = selectOne.getText();
			System.out.println(optText);
			if(optText.equalsIgnoreCase("choice 6 2 1"))
			{
			System.out.println("Found!!!!1");
			selectOne.click();
			break;
			}
		}
//		
//		for(WebElement ddOption : selectOptions)
//		{
//			String ddOptionText = ddOption.getText();
//			System.out.println(ddOptionText);
//			ddOption.click();
//			Thread.sleep(3000);
//		}
//		
		
		
	}
}
