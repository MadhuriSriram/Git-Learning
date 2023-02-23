package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframesPractice {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
driver.findElement(By.id("name")).sendKeys("TEXT1");//main
driver.switchTo().frame("frm1");//frame1
Select CourseNamedd=new Select(driver.findElement(By.id("course")));
CourseNamedd.selectByVisibleText("Java");
driver.switchTo().defaultContent();//main
driver.findElement(By.id("name")).clear();
driver.findElement(By.id("name")).sendKeys("TEXT");
driver.switchTo().frame("frm2");//frame2
driver.findElement(By.id("firstName")).sendKeys("Madhuri");
driver.switchTo().defaultContent();//main
driver.switchTo().frame("frm1");//frame1
CourseNamedd.selectByVisibleText("Dot Net");
driver.switchTo().defaultContent();//main
driver.findElement(By.id("name")).clear();
driver.findElement(By.id("name")).sendKeys("hello");
Thread.sleep(3000);
	}

}
