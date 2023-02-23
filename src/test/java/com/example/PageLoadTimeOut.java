package com.example;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOut {

	
	public static void main(String[] args) {
	WebDriverManager.chromedriver()	.setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
driver.manage().window().maximize();
Instant startTime=Instant.now();
System.out.println(startTime.toString());
driver.get("https://www.hyrtutorials.com/");
Instant EndTime=Instant.now();
System.out.println(EndTime.toString());
Duration duration=Duration.between(startTime, EndTime);
System.out.println("page load time:"+duration.toMillis());
System.out.println(driver.getTitle());
driver.quit();
	}

}
