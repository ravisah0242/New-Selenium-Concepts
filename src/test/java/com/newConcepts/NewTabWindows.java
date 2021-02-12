package com.newConcepts;

import java.awt.GraphicsDevice.WindowTranslucency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabWindows
{
	@Test
	public void tabwindow()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		//driver.switchTo().newWindow(WindowType.TAB);	//open a blank tab;
		driver.switchTo().newWindow(WindowType.WINDOW);
	}

}
