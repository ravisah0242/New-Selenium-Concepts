package com.newConcepts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandalingWebtable 
{
	//Print the Heders of Web Table;
	/*@Test
	public void webtable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/WebTable.html");
		List<WebElement> headers= driver.findElements(By.xpath("//th"));
		System.out.println(headers.size());
		for (int i=0; i<headers.size(); i++)
		{
			System.out.println(headers.get(i).getText());
		}
	}*/
	
	//Print the Row Value of a Web Table;
	
	/*@Test
	public void webtable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/WebTable.html");
		
		List<WebElement> rows= driver.findElements(By.xpath("//tr"));
		System.out.println(rows.size());
		for (int i=1; i<rows.size(); i++)	//initialize i=1 then Header are not count;
		{
			System.out.println(rows.get(i).getText());
		}	
	}*/
	@Test
	public void webtable()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/WebTable.html");
		
		List<WebElement> rows= driver.findElements(By.xpath("//tr"));
		//td[.='Master In Selenium']/..//td[2]
		//td[.='Master In Selenium']/..//td[4] //batter go for its;
		//td[.='Master In Selenium']/..//td[contains(text(),'Rs')] or its;
		//System.out.println(rows.size());
		for (int i=1; i<=rows.size()-1; i++)	//initialize i=1 then Header are not count;
		{
			System.out.println(rows.get(i).getText());
		}	
	}
}
