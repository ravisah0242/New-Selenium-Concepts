package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless 
{
	@Test
	public void hesdless() throws InterruptedException
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("headless");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("login page title is:-" + driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println("Home page title is:-" + driver.getTitle());
	}

}
