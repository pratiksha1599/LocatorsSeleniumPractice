package com.radiobuttons;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		// 1.selected specific checkbox
		// WebElement checkbox1 =
		// driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]"));
		// checkbox1.click();

		// 2.select all the checkboxes

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@type=\"checkbox\" and contains(@name , 'webform')]"));
		System.out.println("No. of checkboxes:" + checkboxes.size());

		/*
		 * for(int i=0;i<checkboxes.size();i++) { checkboxes.get(i).click();
		 */

		// using for each loop

		/*
		 * for (WebElement chbox : checkboxes) { chbox.click();
		 */

		// select multiple checkbox by choice
		// checkbox1 and checkbox3

		for (WebElement chbox : checkboxes) {
			String checkboxname = chbox.getAttribute("value");
			if (checkboxname.equals("checkbox1") || checkboxname.equals("checkbox2")) {
				chbox.click();
			}
		}
	}

}
