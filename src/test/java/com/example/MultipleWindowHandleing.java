package com.example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandleing {


	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);
		//single window
		//			String parentWindowHandle=driver.getWindowHandle();
		//			System.out.println("parent window-"+parentWindowHandle);
		//			driver.findElement(By.id("newWindowBtn")).click();
		//Set<String> windowHandles=driver.getWindowHandles();
		//for(String WindowHandle:windowHandles) {
		//	if(!WindowHandle.equals(parentWindowHandle)) {
		//	driver.switchTo().window(WindowHandle);
		//	driver.manage().window().maximize();
		//	driver.findElement(By.id("firstName")).sendKeys("Madhuri");
		//	Thread.sleep(3000);
		//	driver.close();
		//	}}
		////System.out.println(WindowHandle+driver.getTitle());
		//driver.switchTo().window(parentWindowHandle);
		//driver.findElement(By.id("name")).sendKeys("TEXT");
		//Single Tab
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("parent window-"+parentWindowHandle);
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		for(String WindowHandle:windowHandles) {
			if(!WindowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(WindowHandle);
				System.out.println(driver.findElement(By.id("output")).getText());
			driver.findElement(By.id("alertBox")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")).getText());
				Thread.sleep(3000);
				driver.close();
			}}
			//System.out.println(WindowHandle+driver.getTitle());
			driver.switchTo().window(parentWindowHandle);
			driver.findElement(By.id("name")).sendKeys("TEXT");
			Thread.sleep(3000);
		driver.quit();
	}
}