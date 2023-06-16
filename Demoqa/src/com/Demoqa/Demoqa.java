package com.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demoqa {

	public static void main(String[] args) throws InterruptedException { 
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.xpath("//h5[text()='Book Store Application']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.id("newUser")).click();
		Thread.sleep(2000);
//		driver.findElement(By.id("firstname")).sendKeys("Sweatha");
		js.executeScript("window.scrollBy(0,9000);");
//		driver.findElement(By.id("lastname")).sendKeys("M");
//		driver.findElement(By.id("userName")).sendKeys("Sweatha21");
//		driver.findElement(By.id("password")).sendKeys("Sweatha@123");
		driver.findElement(By.id("gotologin")).click();
		driver.findElement(By.id("userName")).sendKeys("Sweatha21");		
		driver.findElement(By.id("password")).sendKeys("Sweatha@123");
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.id("gotoStore")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.xpath("//a[text()='Eloquent JavaScript, Second Edition']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.linkText("Speaking JavaScript")).click();
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.linkText("Understanding ECMAScript 6")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,9000);");
		driver.findElement(By.id("addNewRecordButton")).click();
		
	}

}










