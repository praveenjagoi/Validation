package com.obiwan.ObiwanKenobi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "D:\\Java Softwares\\MavenProject\\ObiwanKenobi\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
	    driver.manage().window().maximize();

	}

}
