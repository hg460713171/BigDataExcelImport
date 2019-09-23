package com.czbank.bigData;

import java.io.InputStream;

public class ExcelReaderUtil {  
    
    //excel2003扩展名  
    public static final String EXCEL03_EXTENSION = ".xls";  
    //excel2007扩展名  
    public static final String EXCEL07_EXTENSION = ".xlsx";  
      
    /** 
     * 读取Excel文件，可能是03也可能是07版本 
     * @param excel03 
     * @param excel07 
     * @param fileName 
     * @throws Exception  
     */  
    public static void readExcel(IRowReader reader,InputStream fileName) throws Exception{  
        // 处理excel2003文件  
      
            ExcelReader excel07 = new ExcelReader();  
            excel07.setRowReader(reader);  
            excel07.process(fileName);  
      
    }  
}