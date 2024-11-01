package com.BaseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	}
	
	
	public static void urllaunch(String u) {
		driver.get(u);
	}
public  static void takesc(String s) throws IOException {
	TakesScreenshot t=(TakesScreenshot)driver;
         File screenshotAs = t.getScreenshotAs(OutputType.FILE);
         File fol=new File("D:\\TestNG\\target"+s);
         FileHandler.copy(screenshotAs,fol);
}
public static void  close() {
	driver.close();
}


}

