package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	private Workbook workbook;
	private DataFormatter df;
	
	public void excelInit(String excelPath)
{
		FileInputStream fis =null;
try {
	fis =new FileInputStream(excelPath);
	}
catch(FileNotFoundException e) {
	e.printStackTrace();
	}
try {
	workbook=WorkbookFactory.create(fis);
	}
catch(EncryptedDocumentException | IOException e) {
	e.printStackTrace();
	}

}
	public String readDataFromExcel(String sheetName,int rowNum,int cellNum)
	{
		df=new DataFormatter();
		return df.formatCellValue(workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum));
	}
	
	public Map<String,String> readDataFromExcel(String sheetName)
	{
		Map<String,String> map=new HashMap<>();
		df= new DataFormatter();
		Sheet sheet=workbook.getSheet(sheetName);
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			String key=df.formatCellValue(sheet.getRow(i).getCell(0));
			String value=df.formatCellValue(sheet.getRow(i).getCell(1));
			map.put(key, value);
		}
		return map;
		}
	
	
	public void writeToExcel(String sheetName,int rowNum,int cellNum,String value,String excelpath)
{
		Cell cell=workbook.getSheet(sheetName).getRow(rowNum).getCell(cellNum);
		cell.setCellValue(value);
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(excelpath);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
			try {
				workbook.write(fos);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	public void closeExcel() {
		try {
			workbook.close();
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
