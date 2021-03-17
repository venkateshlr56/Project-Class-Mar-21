package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Nishanthi\\eclipse-workspace\\DemoMaven\\Excel\\Sample_Excel.xlsx");

		// To get into the excel to read the values
		FileInputStream fin = new FileInputStream(f);

		// To get into the workbook
		Workbook w = new XSSFWorkbook(fin);

		// To get into the sheet
		Sheet sheet = w.getSheet("Sheet2");
		
		//To write values to sheet
		Row createRow = sheet.createRow(0);
		Cell createCell = createRow.createCell(2);
		createCell.setCellValue("Name");
		
		//To read values from sheet
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);


		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);

		System.out.println("Done..");

		// // File location/Path of file
		// File f = new
		// File("C:\\Users\\Nishanthi\\eclipse-workspace\\DemoMaven\\Excel\\Sample_Excel.xlsx");
		//
		// // To get into the excel to read the values
		// FileInputStream fin = new FileInputStream(f);
		//
		// // To get into the workbook
		// Workbook w = new XSSFWorkbook(fin);
		//
		// // To get into the sheet
		// Sheet sheet = w.getSheet("Sheet1");
		//
		// for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		//
		// Row row = sheet.getRow(i);
		//
		// for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		// Cell cell = row.getCell(j);
		// int cellType = cell.getCellType();
		//// System.out.println(cellType);
		//
		// if (cellType==1) {
		// String stringCellValue = cell.getStringCellValue();
		// System.out.println(stringCellValue);
		// } else if(cellType==0) {
		// if (DateUtil.isCellDateFormatted(cell)) {
		// Date dateCellValue = cell.getDateCellValue();
		// SimpleDateFormat simple=new SimpleDateFormat("MM-dd-YYYY");
		// String format = simple.format(dateCellValue);
		// System.out.println(format);
		// }
		// else {
		// double numericCellValue = cell.getNumericCellValue();
		//
		// //typecast
		// long l=(long) numericCellValue;
		// String valueOf = String.valueOf(l);
		// System.out.println(valueOf);
		// }
		// }
		//
		// }
		// }

		// To find the number of rows present

		// int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		// System.out.println("Number of rows:" + physicalNumberOfRows);

		// Row row = sheet.getRow(0);
		//
		//
		// for (int i = 0; i <row.getPhysicalNumberOfCells() ; i++) {
		// Cell cell = row.getCell(i);
		// System.out.println(cell);
		// }

		// To find the number of cells present

		// int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		// System.out.println("Number of cells:" + physicalNumberOfCells);

		// //To get into the row
		// Row row = sheet.getRow(1);
		//
		// //To get into the cell
		// Cell cell = row.getCell(1);
		//
		// System.out.println(cell);

	}

}
