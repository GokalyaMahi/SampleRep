package org.lib;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExcelWrite {
	
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		LibGlobal l = new LibGlobal();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		l.type(txtPass, "greens");
		
		String attribute = l.getAttribute(txtPass);
		l.excelWrite("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\SampleJunit\\Excel\\FBExcelWrite.xlsx", "Sheet1", 0, 0, "Data");
		l.excelWrite("Sheet1", "C:\\Users\\admin\\eclipse-workspace_UptoMaven\\LibGlobal\\Excel\\ExcelWrite.xlsx", 0, 0, "Java");
		
	}

	
	
	
}
