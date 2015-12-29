package com.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileByByte {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=null;
		try{
			fos=new FileOutputStream("files/out.txt");
			String str="hell中国";
			byte[] b= str.getBytes();
			
			for(int i=0;i< b.length;i++){
				fos.write(b[i]);
			}
		}catch(Exception e){
			
		}finally{
			if(fos!=null)
				fos.close();
		}
	}

}
