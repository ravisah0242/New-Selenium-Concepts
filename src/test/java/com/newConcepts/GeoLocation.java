package com.newConcepts;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocation 
{
	@Test
	public void geolocation()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		HashMap<String, Object> coordinatemap=new HashMap<String, Object>();
		coordinatemap.put("latitude", 34.052235);
		coordinatemap.put("Longitude", -118.243683);
		coordinatemap.put("accuracy", 100);
		((ChromeDriver)driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinatemap);
		
		//driver.get("https://oldnavy.gap.com/stores");
		driver.get("https://oldnavy.gap.com/stores");
		
	}

}
