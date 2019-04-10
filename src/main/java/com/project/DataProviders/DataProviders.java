package com.project.DataProviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.project.ReadExcel.ReadExcel;


public class DataProviders {
	
	
	
	
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("./Resources/Testing.xls", "Sheet1"); 
	}

}
