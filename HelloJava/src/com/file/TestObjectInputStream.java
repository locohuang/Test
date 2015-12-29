package com.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;

public class TestObjectInputStream {
	public static void main(String[] args) throws IOException {
		User u=null;
		FileInputStream fis=null;		
		ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("files/object.txt");
			ois=new ObjectInputStream(fis);	
			u=(User)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fis!=null)fis.close();
			if(ois!=null)ois.close();
		}	
		System.out.println(u.getName()+"  "
		+u.getPwd()+"  "
				+DateFormat.getDateInstance(DateFormat.LONG).format(u.getBirth()));
	}

}
