package io;

import java.io.*;

public class Ex06 {
	
	// throws Exception -> 예외처리
	public static void main(String[] args) throws Exception {
		
		// PrintStream 과 PrintWriter 는 출력 스트림 클래스이다.
		// 이 두 클래스는 각각 바이트 기반, 문자기반 출력 스트림을
		// 처리하기 위해 사용된다.
		
		PrintStream ps = new PrintStream(System.out);
		
		// 기본자료형과 문자열 출력
		
		ps.print(100);
		ps.println('A');
		ps.printf("%d, %f, %c, %s\n", 10, 3.14, 'A', "Hello World");
		// %d -> 정수, %f -> 실수, %c -> 단일 문자, %s ->문자
		ps.flush();
		ps.close();
		
	}
}