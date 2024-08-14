package io.file;

import java.io.*;

public class Ex06 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 버퍼에 담는다. (성능향상)
		
		DataOutputStream dos = new DataOutputStream(bos);
		// 원하는 데이터 형태로 출력한다. (기능향상)
		
		// 서로다 연결해서 추가된 기능을 사용할수 있다.
		
		int a = 100; //4바이트
		double b = 3.14; // 8바이트
		String c = "Hello World";
		
		dos.writeInt(a); // 정수값 출력 
		dos.writeDouble(b); // 실수값 출력
		dos.writeUTF(c); // 문자열 출력
		
		dos.close();
	
	}
}