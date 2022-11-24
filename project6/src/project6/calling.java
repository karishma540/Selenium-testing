package project6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class calling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		methods m1 = new methods();
		FileInputStream f1 = new FileInputStream("");
		XSSFWorkbook ws= new XSSFWorkbook(f1);
		XSSFSheet xs= wb.getSheet("");
		Rows r = null;
		Cell c = null;
		Iterator<Row> row = xs.iterator();
		while(row.hasNext()) {
			r= row.next();
			c=r.getCell(2);
			String s1 =c.getStringCellValue();
			if(s1.equals("Opening_browser")) {
				m1.Opening_browser();
			}
			else if(s1.equals("")); 
		}

	}

}
