package com.newConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMassage 
{
	@Test
	public void errormassage()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		WebElement errormassage= driver.findElement(By.xpath("//div[@class='dEOOab RxsGPe']"));
		
		/*String actualerrormassage=errormassage.getText();
		String expectederrormassage="Enter an email or phone number";
		Assert.assertEquals(actualerrormassage, expectederrormassage);*/
		//OR
		String actualerrormassage=errormassage.getAttribute("innerHTML");
		String expectederrormassage="Enter an email or phone number";
		//Assert.assertEquals(actualerrormassage, expectederrormassage);  --->//Assertion error;
		Assert.assertTrue(actualerrormassage.contains("Enter an email"));
		System.out.println("Test is successfull");
	}

}
