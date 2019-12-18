package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.xml.transform.Source;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Shili_input {

	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		FileInputStream shilishuju_source=new FileInputStream("shili.xlsx");
		XSSFWorkbook wb_source=new XSSFWorkbook(shilishuju_source);
		XSSFSheet sheet_source=wb_source.getSheet("Sheet1");
		int rows_soource=sheet_source.getLastRowNum();
		Map map=new HashMap<>();
	
		for (int i = 0; i <rows_soource; i++) {
			XSSFRow rowi_source=sheet_source.getRow(i);
			Iterator<Cell> celljihe_Source=rowi_source.cellIterator();
			List list=new ArrayList<>();
			while (celljihe_Source.hasNext()) {
				Cell cell_source = (Cell) celljihe_Source.next();
				if (cell_source.getCellType()==CellType.STRING) {
					list.add(cell_source.getStringCellValue());
				}else if(cell_source.getCellType()==CellType.NUMERIC) {
					list.add(cell_source.getNumericCellValue());
				}
			}
			map.put(list.get(3),list);
		}
			//System.out.println(map);
			//读取目标文件并将数据写入目标文件
			FileInputStream shilishuju_dest=new FileInputStream("18rj2.xlsx");
			XSSFWorkbook wb_dest=new XSSFWorkbook(shilishuju_dest);
			XSSFSheet sheet_dest=wb_dest.getSheet("Sheet1");
			//获取记录行的 数目
			int rows_dest=sheet_dest.getLastRowNum();
			System.out.println(rows_dest);
			for (int i = 1; i <= rows_dest; i++) {
				XSSFRow rowi_dest=sheet_dest.getRow(i);
				//读取
				String xuehao=rowi_dest.getCell(3).getStringCellValue();
				//System.out.println(xuehao);
				List list_dest=(ArrayList)map.get(xuehao);
				System.out.println(list_dest);
				//写入
				if (list_dest!=null) {
					
					rowi_dest.createCell(15,CellType.STRING).setCellValue(list_dest.get(11).toString());
					rowi_dest.createCell(16,CellType.STRING).setCellValue(list_dest.get(12).toString());
				}
				
			}
			FileOutputStream shilishujushuchu_dest=new FileOutputStream("18rj2.xlsx");
			wb_dest.write(shilishujushuchu_dest);
			shilishujushuchu_dest.close();
	}

}
