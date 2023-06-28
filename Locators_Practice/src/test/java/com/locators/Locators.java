package com.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println("Hello ");
		driver.findElement(By.id("inputUsername")).sendKeys("pratikshapa");
		driver.findElement(By.name("inputPassword")).sendKeys("Pr@tiksha1");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("done test");
		/*
		 * cssSelector
		 */
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

		// implicit wait
		// link text
		driver.findElement(By.linkText("Forgot your password?")).click();

		// Xpath

		// Tagname[@attribute='value']
		// input[@placeholder='Name']

		// input[@placeholder='Name']

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Prisha");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("prishap078@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9860600756");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	
	
	}

};
