package io;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) throws Exception {
	 
		InputStream input = System.in;
		
		System.out.print("2부터 9사이의 숫자를 입력: ");
		int code = input.read();
		
		// 숫자 0부터 9까지의 코드값은 순서대로 48부터 57까지이다.
		
		System.out.println(code);
		
		int dan = code - 48;
		
		System.out.println(dan + "단 구구단");
		// 입력받은 숫자의 구구단을 출력하기
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " +  dan * i);
		}
	}
}