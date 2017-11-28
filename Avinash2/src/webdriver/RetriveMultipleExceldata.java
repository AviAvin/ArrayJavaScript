package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RetriveMultipleExceldata {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		 File f=new File("C:/Users/lenovo/Desktop/txt2.xlsx");
		 Workbook wb=WorkbookFactory.create(f);
		 Sheet s=wb.getSheet("Sheet1");
		 int rowcount=s.getLastRowNum();
		 for(int i=0;i<=rowcount;i++)
		 {
			 Row r=s.getRow(i);
			 int colcount=r.getLastCellNum();
			 String celldata=" ";
			for(int j=0;j<colcount;j++) 
			{
				if(s.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					int data=(int)(s.getRow(i).getCell(j).getNumericCellValue());
					celldata=String.valueOf(data);
					
				}
				else
				{
					celldata=s.getRow(i).getCell(j).getStringCellValue();
					System.out.println(celldata);
				}
			}
		 }

	}

}
