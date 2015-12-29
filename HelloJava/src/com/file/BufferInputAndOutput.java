package com.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputAndOutput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis=null;
		BufferedOutputStream bos=null;
		int len;
		try {
			bis=new BufferedInputStream(new FileInputStream("files/test.txt"));
			bos=new BufferedOutputStream(new FileOutputStream("files/out.txt",true));
			while((len=bis.read())!=-1){
				bos.write(len);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			if(bis!=null)
				bis.close();
			if(bos!=null)
				bos.close();
		}
	}

}
