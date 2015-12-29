package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileByByte {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=null;//如读取字符建议使用filereader
		try {
			fis=new FileInputStream("files/test.txt");
			int b=0;
			while(true){
				b=fis.read();
				if(b==-1) break;
				System.out.print((char)b);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fis!=null){
				fis.close();
			}				
		}		
	}
}
