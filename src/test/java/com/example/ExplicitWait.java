package com.example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000,1000));
		WebDriverWait wait=new WebDriverWait(driver,null);
		driver.get("https://testproject.io/");
		String parentwindow= driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		for(String windowHandle : windowHandles) {
			if(!windowHandle.equals(parentwindow)) {
				driver.switchTo().window(windowHandle);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys("test1@gmail.com");
			}

		}
	}}
