package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.id("login_field")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(3000);
	}

	private static void highlight(WebDriver driver, WebElement findElement) {
	//JavascrpitExecutor jsExecutor=new (JavascrpitExecutor) driver;
		
	}
}
