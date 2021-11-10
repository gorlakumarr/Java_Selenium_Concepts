//package seleniumSessions;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelUtils {
//	private static XSSFSheet ExcelWSheet;
//
//	private static XSSFWorkbook ExcelWBook;
//
//	private static XSSFCell Cell;
//
//	private static XSSFRow Row;
//
//	public static void setExcelFile(String file, String SheetName) throws IOException {
//		try {
//
//			FileInputStream fo = new FileInputStream(file);
//			ExcelWBook = new XSSFWorkbook(fo);
//			ExcelWSheet = ExcelWBook.getSheet(SheetName);
//
//		} catch (FileNotFoundException e) {
//			throw (e);
//		}
//	}
//
//	public static String getCellData(int RowNum, int ColNum) throws Exception {
//		try {
//			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
//			String CellData = Cell.getStringCellValue();
//			return CellData;
//		} catch (Exception e) {
//			return "";
//		}
//	}
//
//	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {
//		try {
//			Row = ExcelWSheet.getRow(RowNum);
//			Cell = Row.getCell(ColNum);
//			if (Cell == null) {
//				Cell = Row.createCell(ColNum);
//				Cell.setCellValue(Result);
//			} else {
//				Cell.setCellValue(Result);
//			}
//			// Constant.Path_TestData + Constant.File_TestData
//			FileOutputStream fileOut = new FileOutputStream(Result);
//			ExcelWBook.write(fileOut);
//			fileOut.flush();
//			fileOut.close();
//		} catch (Exception e) {
//			throw (e);
//		}
//	}
//}
