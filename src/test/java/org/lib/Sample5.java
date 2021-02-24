package org.lib;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample5 {
	public static void main(String[] args) throws AWTException, IOException {
		LibGlobal l = new LibGlobal();
		
		WebDriver driver = l.getDriver();
		
		l.launchUrl(driver, "https://www.facebook.com/");
		
		l.maxWindow(driver);
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		l.type(txtEmail, "Greens");
		
		l.actionsDoubleClick(driver, txtEmail);
		
		l.copyContent();
		
//		l.cutContent();
		
		l.pressTab(0);
		
		l.pasteContent();
		
		l.takeScreenShot(driver, "D:\\Study\\image.png");
	}

}
