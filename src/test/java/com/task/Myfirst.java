package com.task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Myfirst 
{

	@Test
	public void selecthotel()
	{
		
//		Click on “Customized tours”
//		Select “Home Stay” as preferred stay
//		Click on England Checkbox.
		//label[text()='Countries to be visited:']
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://nichethyself.com/tourism/");
		
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(5));
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Customized tours']")));
		
		
		driver.findElement(By.xpath("//a[text()='Customized tours']")).click();
		
		String parentwindow=driver.getWindowHandle();
		 Set<String>handles=driver.getWindowHandles();
		
		 for(String handle:handles)
		 {
			 if(!handle.contains(parentwindow))
			 {
				 driver.switchTo().window(handle);
			 }
		 }
		 
		WebElement ele=driver.findElement(By.id("days"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Home Stay");
		
		
		
		
	}
}
