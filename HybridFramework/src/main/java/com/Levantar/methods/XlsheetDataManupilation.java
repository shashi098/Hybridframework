package com.Levantar.methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Levantar.generic.Elements;

public class XlsheetDataManupilation extends Elements{
	
	public int getXlRowCount(String path,String sheet)throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		int rows = wb.getSheet(sheet).getPhysicalNumberOfRows();
		
		return rows;
		
	}
	
	
	
	
	public int getXlCellCount(String path,String sheet)throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		int cell = wb.getSheet(sheet).getRow(0).getPhysicalNumberOfCells();
		return cell;
		
	}
	
	
	
	
	public String readTheDataFromXl(String path,String sheet,int row,int cell)throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return value;
		
	}
	
	
	
	
	public String readTheDataFromXl(String path,String sheet,String rowData,String cellHeader)throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		Sheet sh = wb.getSheet(sheet);
		String txt="";
		
		for(int i=0;i<getXlRowCount(sheet, path);i++)
		{
			String tempr = sh.getRow(i).getCell(0).toString();
			if(tempr.equals(rowData))
			{
				for(int j=0;j<getXlCellCount(sheet, path);j++)
				{
					String tempc = sh.getRow(i).getCell(j).toString();
						if(tempr.equals(rowData)&&tempc.equals(cellHeader))
						{
								txt = sh.getRow(i).getCell(j).toString();
								break;
						}
				}
				
			}	
		}
		return txt;
	}
	
	
	
	
	public  ArrayList<String> readBasedOnRowData(String path,String sheet,String rowData)throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		Sheet sh = wb.getSheet(sheet);
		
		
		ArrayList<String> ls=new ArrayList<String>();
		for(int i=0;i<getXlRowCount(path, sheet);i++)
		{
			String temp = sh.getRow(i).getCell(0).toString();
			
				if(temp.equals(rowData));
				{
					for(int j=0;j<getXlCellCount(path, sheet);j++)
					{
						String txt = sh.getRow(i).getCell(j).toString();
						ls.add(txt);
					}
				}
				
		}
		return ls;
				
	}
	
	public void WriteDataBasedOnRowNumAndColumnNum(String path,String sheet,int row ,int cell,String data)throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		Sheet sh = wb.getSheet(sheet);
		
		sh.createRow(row).createCell(cell).setCellValue(data);
		
		
		wb.write(new FileOutputStream(path));
		
		
	}
	
	public  void writeBasedOnRowData(String path,String sheet,String rowData,String columnHeader,String data)throws Exception
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		Sheet sh = wb.getSheet(sheet);
		
		for(int i=0;i<getXlRowCount(path, sheet);i++)
		{
			String rtxt = sh.getRow(i).getCell(0).toString();
			if(rtxt.equals(rowData))
			{
				for(int j=0;j<getXlCellCount(path, sheet);j++)
					{
						String ctxt = sh.getRow(i).getCell(j).toString();
							if(ctxt.equals(columnHeader))
							{
								if(	sh.getRow(i).getCell(j).toString()!=null)
								{
									sh.getRow(i).getCell(j).setCellValue(data);
								}
								else
								{
								 sh.createRow(i).createCell(j).setCellValue(data);
								 wb.write(new FileOutputStream(path));
								}
							}
					}
				
			}
					
		}
		
				
	}

}
