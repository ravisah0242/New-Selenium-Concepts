package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRect
{
	@Test
	public void getrect()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		
		//Selenium version 3;
		Dimension d=loginbutton.getSize();
		System.out.println(d.getHeight());
		System.out.println(d.getWidth());
		
		Point p=loginbutton.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		System.out.println("*************************************");
		
		//Selenium version 4;
		
		Rectangle r=loginbutton.getRect();
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		System.out.println(r.getX());
		System.out.println(r.getY());
	}

}
