package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new FileReader("files/in.txt"));
			bw=new BufferedWriter(new FileWriter("files/out.txt"));
			String str;
			while((str=br.readLine())!=null){
				bw.write(str);
				bw.newLine();
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
