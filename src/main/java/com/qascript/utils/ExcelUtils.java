package com.qascript.utils;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtils {

    FileInputStream fis = null;
    XSSFWorkbook workbook = null;
    XSSFSheet sheet = null;
    XSSFRow headerRow = null;
    XSSFCell cell = null;
    int rowCount = 0;
    int colNum = 0;
    List<String> columnData = new ArrayList<>();

    public ExcelUtils(String filepath){
        try{
            fis = new FileInputStream(filepath);
            workbook = new XSSFWorkbook(fis);
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<String> readExcelData(String sheetName, String columnName){
        sheet = workbook.getSheet(sheetName);
        headerRow = sheet.getRow(0);
        rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        for(int j=1;j<=rowCount;j++){
            XSSFRow row = sheet.getRow(j);
            for(int i=0;i< row.getLastCellNum();i++){
                if(headerRow.getCell(i).getStringCellValue().trim().equals(columnName.trim())){
                    colNum=i;
                }
            }
            cell = row.getCell(colNum);
            String value = cell.toString();
            columnData.add(value);
        }
        return columnData;
    }
}
