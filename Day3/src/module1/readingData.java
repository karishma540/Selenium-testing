  package module1;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class readingData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("c://l1.xlsx");
		XSSFSheet ws = wb.getSheet("Read"); 
		Row r=null;
		Cell c=null;
		Iterator<Row>row=ws.iterator();
		while(row.hasNext())
		{
			r=row.next();
			
			Iterator<Cell>cell=r.iterator();
			while(cell.hasNext())
			{
				c=cell.next();
				
				if(c.getCellType()==c.CELL_TYPE_NUMERIC)
				{
					System.out.println(c.getNumericCellValue());
				}
				else if(c.getCellType()==c.CELL_TYPE_STRING) {
					System.out.println(c.getStringCellValue());
				}
			}
		}

	}

}
