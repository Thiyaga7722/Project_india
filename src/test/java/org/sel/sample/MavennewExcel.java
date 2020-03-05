package org.sel.sample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavennewExcel {
	public static void main(String[]args) throws IOException {
		File f=new File("D:\\workspace\\Day1Maven\\testdata\\new.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet s = w.createSheet("Date");
		Row r = s.createRow(0);
		Cell c = r.createCell(1);
		c.setCellValue("thiyaga");
		FileOutputStream o= new FileOutputStream(f);
		w.write(o);
		
		System.out.println("done");
	}

}
