package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpecialLocators 
{
	@Test
	public void spllocator()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		//WebElement username=driver.findElement(new ByAll(By.id("e....mail"),By.name("email"),By.xpath("//input[@data-testid='royal_email']")));
		WebElement username=driver.findElement(new ByIdOrName("email"));
		username.sendKeys("Qspider");
		
	}
}
