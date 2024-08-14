package io;

import java.io.*;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		OutputStream outPut = System.out;
		
		outPut.write(65);
		outPut.write(66);
		outPut.write(67);
		
		// 버퍼에 저장된 값을 방출해준다.
		outPut.flush();
		
		System.out.println();
		
		String str = "Hello World";
		
		byte[] byteArray = str.getBytes();
		
		outPut.write(byteArray); // 전체 출력
		System.out.println();
		outPut.write(byteArray, 6, 5); // World 만 출력
		
		outPut.flush();
		
	}
}