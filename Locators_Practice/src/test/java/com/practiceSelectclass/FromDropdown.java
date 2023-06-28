package com.practiceSelectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FromDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
		System.out.println("done");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@value='MAA'])[2]")).click();
	}

}
