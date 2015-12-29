package com.file;

import java.io.File;

public class FindAllFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("files");		
		if(file.isDirectory()){
			/*String[] fileNames=file.list();
			for(String name:fileNames){
				System.out.println(name);
			}*/
			File[] realNames=file.listFiles();
			for(File f:realNames){
				if(f.isFile())
					System.out.println(f.getName());
			}
		}
	}

}
