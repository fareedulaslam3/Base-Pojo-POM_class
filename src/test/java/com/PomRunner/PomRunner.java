package com.PomRunner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PomClass.PomClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomRunner {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		PomClass p =new PomClass(driver);
		WebElement user = p.getUser();
		user.sendKeys("aslam");
	}

}
