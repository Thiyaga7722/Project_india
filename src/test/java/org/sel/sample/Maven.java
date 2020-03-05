package org.sel.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class Maven {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\workspace\\Day1Maven\\testdata\\test.xlsx");
		FileInputStream test=new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(test);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(1);
		org.apache.poi.ss.usermodel.Cell c = r.getCell(2);
		System.out.println(c);
			
		
	}

}
