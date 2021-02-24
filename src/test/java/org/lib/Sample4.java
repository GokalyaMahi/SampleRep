package org.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample4 {
	public static void main(String[] args) {
		LibGlobal l = new LibGlobal();

		WebDriver driver = l.getDriver();
		
		l.launchUrl(driver, "http://greenstech.in/selenium-course-content.html");
		
		WebElement btnCourse = driver.findElement(By.xpath("//div[text()='Courses ']"));
		l.actionsMoveToElement(driver, btnCourse);
		
		WebElement btnMaster = driver.findElement(By.xpath("//span[text()='Master Program (8)']"));
		l.actionsRightClick(driver, btnMaster);
		
		
	}

}
