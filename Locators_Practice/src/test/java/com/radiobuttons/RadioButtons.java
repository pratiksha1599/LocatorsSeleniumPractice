package com.radiobuttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");

		// radio button
		WebElement drpdown1 = driver.findElement(By.xpath("//input[@value='Option 2']"));
		drpdown1.click();

		Thread.sleep(2000);
		WebElement drpdown3 = driver.findElement(By.xpath("//input[@value='Option 3']"));
		drpdown3.click();
	  
		
		
		//checkbox
		
	
	
	}

}
