package com.newConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class PhantamJSHeadless
{
	@Test
	public void phantomjsheadless() throws InterruptedException
	{
		System.setProperty("phantomjs.binary.path", "./drivers/phantomjs.exe");
		//Thread.sleep(5000);
		WebDriver driver =new PhantomJSDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("login page title is:-" + driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		System.out.println("Home page title is:-" + driver.getTitle());
	}
}
