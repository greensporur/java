package com.Demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ {

	public static void main(String[] args) throws IOException {

		// Configuring The Property
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\eclipse-workspace\\Selenium_Class\\Drivers\\chromedriver110.exe");

		// Browser Launch
		WebDriver driver = new ChromeDriver();

		// URL Launch
		driver.get("https://www.facebook.com/");

		// Window Maximize
		driver.manage().window().maximize();

		WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));

		pwd.sendKeys("sachin");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Demo\\Screenshot\\facebookss.png");
		
		FileUtils.copyFile(src, dest);
		
		
	}

}
