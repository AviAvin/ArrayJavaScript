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

public class CreateWorkbook {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		 File f=new File("C:/Users/lenovo/Desktop/txt1.xlsx");
		 Workbook wb=WorkbookFactory.create(f);
		 Sheet s=wb.getSheet("Sheet1");
		 Row r=s.getRow(0);
		 Cell c=r.getCell(0);
		 String data=c.getStringCellValue();
		 System.out.println(data);

	}

}
