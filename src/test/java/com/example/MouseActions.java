package com.example;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {
		//Performing mouse actions like mouseHover or moving elements,click,double click,right or context click
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://www.orangehrm.com/");
Actions action=new Actions(driver);
//action
//.moveToElement(driver.findElement(By.xpath("//a[text()='Platform']")))
//.click()
//.perform();
driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
action.contextClick(driver.findElement(By.xpath("//span[text()='right click me']")));
driver.findElement(By.xpath("//span[.='Edit']")).click();
Alert alert=driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();
	}

}
