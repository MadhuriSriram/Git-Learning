package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EnterTextStrategies {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernametxt=driver.findElement(By.id("login_field"));
		if (usernametxt.isDisplayed()) {
			if (usernametxt.isEnabled()) {	
				usernametxt.sendKeys("HYR");
				String enteredtext=usernametxt.getAttribute("Value");
				System.out.println(enteredtext);
				Thread.sleep(3000);
				usernametxt.clear();
			}
			else
				System.out.println("text box is not enabled");
		}
		else
			System.out.println("text box is not displayed");
	}

}
