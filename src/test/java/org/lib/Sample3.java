package org.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample3 {
	public static void main(String[] args) {
		LibGlobal l = new LibGlobal();

		WebDriver driver = l.getDriver();

		l.launchUrl(driver, "http://demo.guru99.com/test/drag_drop.html");

		l.maxWindow(driver);

		WebElement src1 = driver.findElement(By.id("credit2"));

		WebElement des1 = driver.findElement(By.id("bank"));

		l.actionsDragAndDrop(driver, src1, des1);

		WebElement src2 = driver.findElement(By.id("fourth"));

		WebElement des2 = driver.findElement(By.id("amt7"));

		l.actionsDragAndDrop(driver, src2, des2);

		WebElement src3 = driver.findElement(By.id("credit1"));

		WebElement des3 = driver.findElement(By.id("loan"));

		l.actionsDragAndDrop(driver, src3, des3);

		WebElement src4 = driver.findElement(By.id("fourth"));

		WebElement des4 = driver.findElement(By.id("amt8"));

		l.actionsDragAndDrop(driver, src4, des4);

	}

}
