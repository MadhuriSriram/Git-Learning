package com.example;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSS {

	

			public static void main(String[] args)throws Exception {
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		//File
		File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./Screenshot/img1.jpg");
		FileUtils.copyFile(sourceFile, DestFile);
		System.out.println("Screenshot saved successfully");
			
		


	}

}
