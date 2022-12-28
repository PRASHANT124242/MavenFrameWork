package Parameterization;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		String path="C:\\Users\\DELL\\Desktop\\Read.xlsx";
	
		FileInputStream file=new FileInputStream(path);
		
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	      System.out.println(data);
	}

}
