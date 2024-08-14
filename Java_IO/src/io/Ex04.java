package io;

import java.io.*;

public class Ex04 {

	// 예외처리 throws Exception
	public static void main(String[] args) throws Exception {
		
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		
		// InputStreamReader 는 InputStream 보다 향상된 처리 스트림
		// 2바이트를 처리할 수 있기 때문에 한글도 처리 가능하다.
		
		System.out.print("한글의 문자를 입력: ");
		int code = isr.read();
		System.out.println("code: " + code);
		System.out.println("char: " + (char)code);
		
		isr.read(); // 엔터값 처리
		isr.read();

		System.out.println();
		
		char[] charArray = new char[100];
		
		System.out.print("한글 이름 입력: ");
		
		int length = isr.read(charArray);
		// 읽어온 데이터는 char 배열로 들어가고
		// 몇개의 데이터를 읽었는지 정수를 반환
		
		for(int i = 0; i < length; i++) {
			System.out.print(charArray[i]);
		}	
	}
}