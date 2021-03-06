 package org.flipkart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.sym.Name1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileValidation {

	static WebDriver driver;
	long startTime; 
	String name1;
	
	@BeforeClass
	public static void beforeClass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
	}
	
    @AfterClass
    public static void afterClass() {
    	driver.quit();
    	
    }
    
    @Before
    public void beforeScript() {
      startTime = System.currentTimeMillis();
    
    }
    
    @After
    public void afterScript() {
    	
    	long endTime = System.currentTimeMillis();
    	System.out.println("Time taken is :"+(endTime - startTime));
    
    }
    
    @Test
    public void method1() {
    	
    	try {
    		WebElement close = driver.findElement(By.xpath("//button[text()='x']"));
    	    close.click();
    	    
    	}catch (Exception e) {
    	
    	}
    }
	
    @Test
    public void method2() {
    	WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("realme",Keys.ENTER);
    }
    
    @Test
    public void method3() {
    	
    	WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'realme')])[1]"));
        name1 = mobileName.getText();
    	System.out.println(name1);
    	
    	mobileName.click();
    
    }
    
    @Test
    public void method4() {
    	String parents = driver.getWindowHandle();
    	Set<String> children = driver.getWindowHandles();
    
    	for (String x : children) {
    		
    		if(!parents.equals(x)) {
    		driver.switchTo().window(x);
    	}
    
    }}
@Test
public void method5() {
	
	WebElement mobileName2 = driver.findElement(By.xpath("//span[contains(text(),'SAMSUNG')]"));
	
	
	
	String name2 = mobileName2.getText();
	System.out.println(name2);
	Assert.assertEquals(name1, name2);
		
}}
