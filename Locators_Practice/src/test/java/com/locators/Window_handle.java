package com.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.w3schools.com/html/html_quiz.asp");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
	}

}
