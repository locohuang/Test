package com.file;

import java.io.File;

public class FindSubFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("files");
		showFile(file);
	}

	public static void showFile(File dir) {
		File[] files=dir.listFiles();
		for(File file:files){
			if(file.isDirectory()){
				showFile(file);
			}
			System.out.println(file.getAbsolutePath());
		}
		
	}
	
}
