package WorkingWithExcel;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWorking {

	void ReadExcelFile() {
		try {
			File f = new File("E:\\Excel Work\\ExcelFile.xls");
			FileInputStream fin = new FileInputStream(f);
			HSSFWorkbook book = new HSSFWorkbook(fin);
			HSSFSheet sheet = book.getSheet("Sheet1");
			int r = sheet.getLastRowNum();

//			int rno = (int)sheet.getRow(1).getCell(0).getNumericCellValue();
//			System.out.println(rno);
//			String name = sheet.getRow(1).getCell(1).getStringCellValue();
//			System.out.println( rno + " " +name);

			for (int i = 1; i <= r; i++) {
				int rno = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
				String name = sheet.getRow(i).getCell(1).getStringCellValue();
				int eng = (int) sheet.getRow(i).getCell(2).getNumericCellValue();
				int math = (int) sheet.getRow(i).getCell(3).getNumericCellValue();
				int sci = (int) sheet.getRow(i).getCell(4).getNumericCellValue();
				System.out.println(rno + " " + name + " " + eng + " " + math + " " + sci);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void WriteExcelFile() {
		try {
			File f = new File("E:\\Excel Work\\ExcelFile.xls");
			FileInputStream fin = new FileInputStream(f);
			HSSFWorkbook book = new HSSFWorkbook(fin);
			HSSFSheet sheet = book.getSheet("Sheet1");
			int r = sheet.getLastRowNum();

			HSSFCell htotal = sheet.getRow(0).createCell(5);
			htotal.setCellValue("Total");
			HSSFCell hper = sheet.getRow(0).createCell(6);
			hper.setCellValue("Per");
			HSSFCell hreusult = sheet.getRow(0).createCell(7);
			hreusult.setCellValue("Result");

			// write in file
			FileOutputStream fout = new FileOutputStream(f);

			for (int i = 1; i <= r; i++) {
				int rno = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
				String name = sheet.getRow(i).getCell(1).getStringCellValue();
				int eng = (int) sheet.getRow(i).getCell(2).getNumericCellValue();
				int math = (int) sheet.getRow(i).getCell(3).getNumericCellValue();
				int sci = (int) sheet.getRow(i).getCell(4).getNumericCellValue();

				float total = eng + math + sci;
				float per = total / 3;
				String result = "fail";

				if (per >= 50) {
					result = "pass";
				}
				// create cell in excel
				HSSFCell ctotal = sheet.getRow(i).createCell(5);
				ctotal.setCellValue(total);
				HSSFCell cper = sheet.getRow(i).createCell(6);
				cper.setCellValue(per);
				HSSFCell creu = sheet.getRow(i).createCell(7);
				creu.setCellValue(result);

				// print output
				System.out.println(
						rno + " " + name + " " + eng + " " + math + " " + sci + " " + total + " " + per + " " + result);

			}
			book.write(fout);
			fout.close();
			book.close();
			
			System.out.println("Finish");
			
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		ExcelWorking ex = new ExcelWorking();
		ex.ReadExcelFile();
		ex.WriteExcelFile();
	}

}
