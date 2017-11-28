package com.Avinash.Test_Execute_Main;

import java.io.FileOutputStream;


import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkSheet {
	
	
	

	public static void main(String[] args) throws IOException {
	 
      //create blank workbook
		XSSFWorkbook wb=new XSSFWorkbook();
		//create blank sheet
		XSSFSheet spreadsheet=wb.createSheet("Employee Info");
		//create row object
		XSSFRow row;
		//this data written to object
		Map<String,Object[]> empinfo=new TreeMap <String,Object[]>();
		empinfo.put("1",new Object[]{"empid","empname","designtn"});
		empinfo.put("2",new Object[]{"TP_01","Gopal","Engineer"});
		empinfo.put("3",new Object[]{"TP_02","Hatim","Engineer"});
		empinfo.put("4",new Object[]{"TP_03","Rahul","Accountant"});
		empinfo.put("5",new Object[]{"TP_04","Asihs","Professor"});
		//Iterate over data and put to sheet
		Set<String>keyid=empinfo.keySet();
		int rowid=0;
		for(String key:keyid){
			row=spreadsheet.createRow(rowid++);
			Object[] objectArr=empinfo.get(key);
			int cellid=0;
		
			for(Object obj:objectArr){
				
				Cell cell=row.createCell(cellid++);
				cell.setCellValue((String)obj);
			}
				
		}
		
		//write the workbook to a location 
		FileOutputStream out=new FileOutputStream("D:\\workspace\\Avinash\\src\\com\\Avinash\\Test_Data\\datasheet3.xlsx");
		wb.write(out);
		out.close();
		System.out.println("datasheet written successfully");
	}}