package com.newConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadProperties
{
	@Test
	public void readproperties() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("./config.properties");
		prop.load(fis);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id(prop.getProperty("usernamelocator"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("passwordlocator"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id(prop.getProperty("loginlocator"))).click();
		
	}

}
