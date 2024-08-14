package io.file;

import java.io.*;

public class Ex07 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		// 데이터를 읽을땐 데이터를 넣은 순서대로 읽어야 한다.
		int a = dis.readInt(); // Ex06 에서 정수를 넣었기 때문에 readInt(4바이트를 읽어서 정수타입으로 반환)
		double b = dis.readDouble(); // Ex06 에서 실수를 넣었기 때문에 readDouble(8바이트를 읽어서 실수타입으로 반환)
		String c = dis.readUTF(); // Ex06 에서 문자열을 넣었기 때문에 readUTF
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		
		dis.close();
		
	}
}