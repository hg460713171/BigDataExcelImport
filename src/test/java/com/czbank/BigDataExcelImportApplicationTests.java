package com.czbank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.czbank.bigData.ExcelReaderUtil;
import com.czbank.bigData.IRowReader;
import com.czbank.bigData.RowReader;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BigDataExcelImportApplicationTests {

	@Test
	public void contextLoads() {
	      Logger log= LoggerFactory.getLogger("SampleLogger");

	      InputStream is = null;
		  IRowReader reader = new RowReader();  
		  File file = new File("/Users/hou/Library/Mobile Documents/com~apple~Numbers/Documents/test3.xlsx");
		  try {
			is = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
          //ExcelReaderUtil.readExcel(reader, "F://te03.xls");  
          try {
			ExcelReaderUtil.readExcel(reader,is);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error(":{}", e);
			e.printStackTrace();
		}
	}

}
