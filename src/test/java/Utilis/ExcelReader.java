package Utilis;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> read(String path) throws IOException {
        return read(path,"page1");
    }
    public static List<Map<String, String>>  read() throws IOException{
        return read("Files/java.xlsx","page1");
    }

    public static List<Map<String, String>>  read(String path,String sheetname) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(path);

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet(sheetname);
        int filledspace=sheet.getPhysicalNumberOfRows();
        List<Map<String,String>> excelData=new ArrayList();

        Row row0 = sheet.getRow(0);
        for (int i = 1; i <filledspace ; i++) {
            Row row = sheet.getRow(i);
            LinkedHashMap<String,String> hashMap=new LinkedHashMap<>();
            int noofcell=row.getPhysicalNumberOfCells();
            for (int j = 0; j <noofcell ; j++) {
                hashMap.put(row0.getCell(j).toString(),row.getCell(j).toString());
            }
            excelData.add(hashMap);
        }
        fileInputStream.close();
        return excelData;
    }
}
