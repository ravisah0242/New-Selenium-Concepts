package com.newConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDroupdown 
{
	@Test
	public void bootstrapdroupdown()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/BootstrapDropDown.html");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		List<WebElement> dd_manu= driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(int i=0; i<dd_manu.size(); i++)
		{
			if(dd_manu.get(i).getText().equalsIgnoreCase("html"));
			{
				dd_manu.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
		}
	}

}
