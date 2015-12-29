package com.file;

import java.io.File;
import java.text.DateFormat;

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("files/out.txt");
		//File file=new File("files/subfiles");
		System.out.println("文件名:"+file.getName()+"\n"+
				"相对路径:"+file.getPath()+"\n"+
				"绝对路径:"+file.getAbsolutePath()+"\n"+
				"父路径:"+file.getParent()+"\n"+
				"是否文件:"+file.isFile()+"\n"+
				"是否目录:"+file.isDirectory()+"\n"+
				"是否可读:"+file.canRead()+"\n"+
				"是否可写:"+file.canWrite()+"\n"+
				"文件大小:"+file.length()+"\n"+
				"最后修改时间:"+DateFormat.getDateInstance(DateFormat.LONG)
				.format(file.lastModified())+"\n");
		
	}

}
