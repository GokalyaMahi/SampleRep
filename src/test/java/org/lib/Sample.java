package org.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		LibGlobal l = new LibGlobal();

		WebDriver driver = l.getDriver();

		l.launchUrl(driver, "https://www.facebook.com/");

		l.maxWindow(driver);

		WebElement txtEmail = driver.findElement(By.id("email"));
		l.type(txtEmail, "greens@gmail.com");

		WebElement txtPass = driver.findElement(By.id("pass"));
		l.type(txtPass, "greens@123");
		
		String attribute = l.getAttribute(txtEmail);
		System.out.println(attribute);

		String title = l.getTitle(driver);
		System.out.println(title);

		l.sleep(2000);

		String currentUrl = l.getCurrentUrl(driver);
		System.out.println(currentUrl);

		WebElement btnCreate = driver
				.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		l.clickJavaScript(driver, btnCreate);
		
		l.sleep(2000);

		WebElement dropDay = driver.findElement(By.id("day"));
		l.selectByValue(dropDay, "2");

		WebElement dropMonth = driver.findElement(By.id("month"));
		l.selectByIndex(dropMonth, 3);

		WebElement dropYear = driver.findElement(By.name("birthday_year"));
		l.selectByVisibleText(dropYear, "2017");

		l.getOptions(dropMonth);

	}

}
