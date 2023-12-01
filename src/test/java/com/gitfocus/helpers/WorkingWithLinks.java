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



public class WorkingWithLinks
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
		
		driver.get("https://www.hyrtutorials.com/p/broken-link1.html");
		
		WebElement pLinktxt = driver.findElement(By.partialLinkText("Tech"));
		String psiteLink = pLinktxt.getAttribute("href");
		System.out.println(psiteLink);
		
		WebElement linktxt = driver.findElement(By.linkText("Contact"));
		String siteLink = linktxt.getAttribute("href");
		System.out.println(siteLink);
		Actions mouseAct = new Actions(driver);
		WebElement tut = driver.findElement(By.xpath("//div[@class='tm-menu']//div/div//li[2]"));
		mouseAct.moveToElement(tut).perform();
		List<WebElement> tutorialLinks = driver.findElements(By.xpath("//ul[@id='nav1']/li[2]/ul/li"));
		System.out.println(tutorialLinks.size());
		ArrayList<String> ddLinksText = new ArrayList<String>();
		for(WebElement slink : tutorialLinks)
		{
			System.out.println(slink.getText());
			ddLinksText.add(slink.getText());
			Thread.sleep(2000);
		}
		System.out.println(ddLinksText);
		
		
	}
}
