package com.locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("selenium");
		//// input[@type='text']
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		WebElement element = mywait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));
		element.click();

		System.out.println("test passed Explicit wait");

	}

}
