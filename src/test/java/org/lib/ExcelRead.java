package org.lib;

import java.io.IOException;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		LibGlobal l = new LibGlobal();
		
		l.excelRead1("C:\\Users\\admin\\eclipse-workspace_UptoMaven\\LibGlobal\\Excel\\ExcelRead.xlsx", "Sheet1", 0, 0);
		
	}
	
	
	

}
