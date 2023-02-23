package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {
//singleselectiondrop down
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		Thread.sleep(3000);
//		WebElement course=driver.findElement(By.id("course"));
//		Select courseNamedropdown=new Select(course);
//		courseNamedropdown.selectByIndex(1);//Java
//		Thread.sleep(3000);
//		courseNamedropdown.selectByValue("net");
//		Thread.sleep(3000);
//		courseNamedropdown.selectByVisibleText("Javascript");
//		Thread.sleep(3000);
//	} 
//}
	//multiselectiondropdown
	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	Thread.sleep(3000);
	WebElement ideElement=driver.findElement(By.id("ide"));
	Select ideNamedropdown=new Select(ideElement);
	ideNamedropdown.selectByIndex(0);//Eclipse
	Thread.sleep(3000);
	ideNamedropdown.selectByValue("ij");//intellijidea
	Thread.sleep(3000);
	ideNamedropdown.selectByVisibleText("NetBeans");//netBeans
	Thread.sleep(3000);
	ideNamedropdown.deselectByIndex(0);
} 
}