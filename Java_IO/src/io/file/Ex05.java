package io.file;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "Pororo.jpeg");
		
		// FileInputStream 과 FileOutputStream 클래스를 사용하여
		// Pororo.jpeg 파일을 복사하기 Copy.jpg
		
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dir + File.separator + "Copy.jpeg");

		while(true) {
			int data = fis.read();
			
			if(data == -1) {
				break;
			}
			
			fos.write(data);
		}
		
		fos.close();
		fis.close();
	}
}