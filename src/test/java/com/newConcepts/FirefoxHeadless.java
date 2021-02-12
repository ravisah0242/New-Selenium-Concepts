package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxHeadless 
{
	@Test
	public void firefoxheadless() throws InterruptedException
	{
		/*FirefoxOptions option=new FirefoxOptions(); NOT Working its open the Browser;
		option.addArguments("headless");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(option);*/
		
		FirefoxBinary firefoxbinary=new FirefoxBinary();
		firefoxbinary.addCommandLineOptions("--headless");
		FirefoxOptions option=new FirefoxOptions();
		option.setBinary(firefoxbinary);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver(option);
		
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("login page title is:-" + driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println("Home page title is:-" + driver.getTitle());
	}

}
