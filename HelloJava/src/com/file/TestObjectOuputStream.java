package com.file;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOuputStream {
	public static void main(String[] args) throws IOException {
		User u=new User();
		u.setName("张三");
		u.setPwd("1234");
		u.setBirth(new Date());
		FileOutputStream fos=null;		
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("files/object.txt");
			oos=new ObjectOutputStream(fos);	
			oos.writeObject(u);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fos!=null)fos.close();
			if(oos!=null)oos.close();
		}		
	}
}
