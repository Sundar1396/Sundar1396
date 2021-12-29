package org.Amazon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sundar\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
            Navigation navigate = driver.navigate();
            navigate.to("https://www.facebook.com/");
            
            driver.navigate().back();
            
            driver.navigate().forward();
            
            driver.navigate().refresh();
            
	}

}
