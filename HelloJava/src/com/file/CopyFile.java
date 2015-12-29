package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("files/test.txt");
			fos=new FileOutputStream("files/out.txt");
			int len;
			byte[]buff=new byte[1024]; 
			long beginTime=System.currentTimeMillis();
			while((len=fis.read(buff))!=-1){
				fos.write(buff,0,len);
			}
			/*while((len=fis.read())!=-1){
				fos.write(len);
			}*/
			long endTime=System.currentTimeMillis();
			System.out.println("time:"+(endTime-beginTime));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
