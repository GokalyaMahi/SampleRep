package org.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample2 {
	public static void main(String[] args) {
		LibGlobal l = new LibGlobal();

		WebDriver driver = l.getDriver();

		l.launchUrl(driver, "http://demo.automationtesting.in/Alerts.html");

		l.maxWindow(driver);

//		WebElement btnAlert = driver.findElement(By.xpath("//a[text()='Alert with OK']"));
//		l.btnClick(btnAlert);
//
//		WebElement btnTxtAlert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
//		l.btnClick(btnTxtAlert);
//
//		String simpleAlert = l.simpleAlert(driver);
//		System.out.println(simpleAlert);

//		WebElement btnAlert = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
//		l.btnClick(btnAlert);
//
//		WebElement btnTxtAlert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		l.btnClick(btnTxtAlert);
//
//		String confirmAlertAccept = l.confirmAlertAccept(driver);
//		System.out.println(confirmAlertAccept);
//		
//		String confirmAlertDismiss = l.confirmAlertDismiss(driver);
//		System.out.println(confirmAlertDismiss);
		
		WebElement btnAlert = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		l.btnClick(btnAlert);
		
		WebElement btnTxtAlert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		l.btnClick(btnTxtAlert);
		
//		String promptAlertAccept = l.promptAlertAccept(driver, "Greens");
//		System.out.println(promptAlertAccept);
		
		String promptAlertDismiss = l.promptAlertDismiss(driver, "Greens");
		System.out.println(promptAlertDismiss);

	}

}
