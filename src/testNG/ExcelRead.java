package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRead {
	public static File file;
	public static FileInputStream fileInputStream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;

	@DataProvider(name = "excelReadData")
	@Test
	public static Object[][] f() throws IOException {
		file = new File("G:\\codebase\\gk_selenium_2024\\src\\test\\resources\\TestData.xlsx");
		fileInputStream = new FileInputStream(file);
		workbook = new XSSFWorkbook(fileInputStream);
		sheet = workbook.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		int columns = sheet.getRow(0).getLastCellNum();
		System.out.println("Rows -->" + (rows - 1));
		System.out.println("columns -->" + columns);
		DataFormatter dataFormatter = new DataFormatter();
		Object testData[][] = new Object[rows - 1][columns];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				XSSFCell cell = sheet.getRow(i).getCell(j);
				String value = dataFormatter.formatCellValue(cell);
				testData[i-1][j] = value;
				System.out.println(testData[i-1][j]);
			}
			System.out.println();
		}
		return testData;
	}
}
