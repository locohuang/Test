package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestInputStreamReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader br=null;
		OutputStreamWriter bw=null;
		try {
			br=new InputStreamReader(new FileInputStream("files/in.txt"),"GBK");
			bw=new OutputStreamWriter(new FileOutputStream("files/out.txt"),"UTF-8");
			int len=0;
			while((len=br.read())!=-1){
				bw.write(len);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			if(br!=null){
				br.close();
			}
			if(bw!=null){
				bw.close();
			}
		}
	}

}
