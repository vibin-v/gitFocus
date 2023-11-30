package com.gitfocus.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingDropdownSelect 
{
	@Test
	public void helper_dropdown() throws InterruptedException 
	{
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		driver = new ChromeDriver(option);
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement countries = driver.findElement(By.xpath("//div[@rel-title=\"Select Country\"]/p/select"));
		
		
		Select selCountry = new Select(countries);
		 selCountry.selectByIndex(2);
		 Thread.sleep(3000);
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 WebElement countries1 = driver.findElement(By.xpath("//div[@rel-title=\"Select Country\"]/p/select"));
		 Select selCountry1 = new Select(countries1);
		 selCountry1.selectByVisibleText("Bahamas");
		 driver.navigate().refresh();
		 Thread.sleep(3000);
		 WebElement countries2 = driver.findElement(By.xpath("//div[@rel-title=\"Select Country\"]/p/select"));
		 Select selCountry2 = new Select(countries2);
		selCountry2.selectByValue("AFG");
		
	}
}
