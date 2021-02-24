package org.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample1 {
	public static void main(String[] args) {
		LibGlobal l = new LibGlobal();

		WebDriver driver = l.getDriver();

		l.launchUrl(driver, "http://output.jsbin.com/osebed/2");

		l.maxWindow(driver);

		WebElement dropFruits = driver.findElement(By.id("fruits"));

		boolean multiple = l.isMultiple(dropFruits);

		System.out.println(multiple);

		l.selectAllOptionsByValue(dropFruits);

		l.getAllSelectedOptions(dropFruits);
		
		l.getFirstSelectedOptions(dropFruits);

		// l.deSelectAll(dropFruits);

		// l.deSelectAllOptionsByVisibleText(dropFruits);

		// l.deSelectAllOptionsByValue(dropFruits);

		// l.deSelectAllOptionsByIndex(dropFruits);

		// l.selectAllOptionsByIndex(dropFruits);

		// l.selectAllOptionsByVisibleText(dropFruits);
	}

}
