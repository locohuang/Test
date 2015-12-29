package com.file;

import java.io.File;

public class DeleteAllFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("files");
		deleteAll(file);
	}
	public static void deleteAll(File file){
		if(file.exists()){
			File[] files=file.listFiles();
			for(File f:files){
				if(f.isDirectory()){
					deleteAll(f);
				}else{
					f.delete();
				}
			}
			file.delete();
		}
	}
}

