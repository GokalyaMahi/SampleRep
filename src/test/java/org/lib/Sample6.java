package org.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample6 {
	public static void main(String[] args) {
		LibGlobal l = new LibGlobal();
		
		WebDriver driver = l.getDriver();
		
		l.launchUrl(driver, "http://greenstech.in/selenium-course-content.html");
		
		l.maxWindow(driver);
		
		WebElement btnFrame = driver.findElement(By.id("heading304"));
		l.btnClick(btnFrame);
		
		WebElement scroll = driver.findElement(By.xpath("//a[text()=' DataDriven']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView('true')", scroll);

		WebElement btnTest = driver.findElement(By.xpath("//a[text()=' TESTNG']"));
		btnTest.click();

		l.windowHandle(driver);
		
		WebElement txt = driver.findElement(By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']"));
		
		String text = l.getText(txt);
		
		System.out.println(text);
	}

}
