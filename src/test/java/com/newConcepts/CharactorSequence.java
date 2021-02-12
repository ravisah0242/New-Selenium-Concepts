package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CharactorSequence 
{
	@Test
	public void chractorseq()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		
		/*//  1. By using String class;---> emutable;
		username.sendKeys("admin");*/
		
		/*//  2. By using String Builder class;	---> mutable;
		StringBuilder sb=new StringBuilder()
				.append("a")
				.append("d")
				.append(" ")
				.append("mi")
				.append("n");
		username.sendKeys(sb);*/
		
		//   3. By using String buffar;  	---> mutable;
		StringBuffer sf=new StringBuffer()
				.append("ad")
				.append("mi")
				.append("n");
		username.sendKeys(sf);
	}
}
