package WorkingWithExcel;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
						
	void ReadExcelFile() {
		try {
			File f = new File("G:\\myFolder\\Student.xls");
			FileInputStream fin = new FileInputStream(f);
			HSSFWorkbook book = new HSSFWorkbook(fin);
			HSSFSheet sheet = book.getSheet("Sheet2");
			int r = sheet.getLastRowNum();
//			System.out.println(r);

			for (int i = 1; i <= r; i++) {
				int rno = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
				String name = sheet.getRow(i).getCell(1).getStringCellValue();
				int eng = (int) sheet.getRow(i).getCell(2).getNumericCellValue();
				int maths = (int) sheet.getRow(i).getCell(3).getNumericCellValue();
				int sci = (int) sheet.getRow(i).getCell(4).getNumericCellValue();

				System.out.println(rno + " " + name + " " + eng + " " + maths + " " + sci);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	void WriteFile() {
		try {
			File f = new File("G:\\myFolder\\Student.xls");
			FileInputStream fin = new FileInputStream(f);
			HSSFWorkbook book = new HSSFWorkbook(fin);
			HSSFSheet sheet = book.getSheet("Sheet2");

			int r = sheet.getLastRowNum();
			HSSFCell htotal = sheet.getRow(0).createCell(5);
			htotal.setCellValue("Total");
			HSSFCell hper = sheet.getRow(0).createCell(6);
			hper.setCellValue("Percentage");
			HSSFCell hresult = sheet.getRow(0).createCell(6);
			hresult.setCellValue("Result");

			FileOutputStream fout = new FileOutputStream(f);

			for (int i = 1; i <= r; i++) {
				int rno = (int) sheet.getRow(i).getCell(0).getNumericCellValue();
				String name = sheet.getRow(i).getCell(1).getStringCellValue();
				int eng = (int) sheet.getRow(i).getCell(2).getNumericCellValue();
				int maths = (int) sheet.getRow(i).getCell(3).getNumericCellValue();
				int sci = (int) sheet.getRow(i).getCell(4).getNumericCellValue();
				float total = eng + maths + sci;
				float per = total / 3;
				String result = "fail";
				if (per >= 45) {
					result = "pass";
				}

				HSSFCell ctotal = sheet.getRow(i).createCell(5);
				ctotal.setCellValue(total);
				HSSFCell cper = sheet.getRow(i).createCell(6);
				cper.setCellValue(per);
				HSSFCell cresult = sheet.getRow(i).createCell(7);
				cresult.setCellValue(result);

				System.out.println(
						rno + " " + name + " " + eng + " " + maths + " " + sci + total + " " + per + " " + result);
			}
			book.write(fout);
			fout.close();
			book.close();
			System.out.println("Finished");
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		ReadExcel re = new ReadExcel();
		re.ReadExcelFile();
		re.WriteFile();
	}

}
