package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class NumericData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		   String p1="C:\\Users\\DELL\\Desktop\\numeric.xlsx";
		  
		   FileInputStream file=new FileInputStream(p1); 
	
	       double Data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
           
	       
	       System.out.println(Data);
	}
	  
}
