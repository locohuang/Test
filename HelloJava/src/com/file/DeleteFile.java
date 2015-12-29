package com.file;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("files");
		File[] files=file.listFiles();
		for(File f:files){
			if(f.isFile()&&f.getName().equals("test.txt")&&f.exists()){
				f.delete();
				System.out.println("文件删除成功！");
			}
		}
	}
}
