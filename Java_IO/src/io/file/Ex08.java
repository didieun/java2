package io.file;

import java.io.*;

public class Ex08 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		// .print -> 기본타입을 매개타입으로 넣을수 있다. (반환은 문자열로 반환됨)
		pw.print(100); 
		pw.println('A');
		pw.println(3.14); 
		pw.println("Hello World");
		pw.println("안녕하세요");
		
		pw.close();
		
	}
}