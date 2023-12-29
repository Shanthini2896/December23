package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestA {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SHANTHINIPARAMASIVAN\\eclipse-workspace\\PracticeDemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}

}
