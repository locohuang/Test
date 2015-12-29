package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileWriter fw=null;
		try {
			fr=new FileReader("files/test.txt");
			fw=new FileWriter("files/out.txt");
			int ch=0;
			while((ch=fr.read())!=-1){
				fw.write(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fr!=null){
				fr.close();
			}
			if(fw!=null){
				fw.close();
			}
		}
	}
}
