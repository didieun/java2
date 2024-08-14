package io;

import java.io.*;

public class Ex05 {

	public static void main(String[] args) throws Exception {
		
		// 인코딩 방식 "UTF-8" 입력
		OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-8");
		// 2byte 를 처리할 수 있기 때문에 한글도 처리 가능
		
		osw.write(44032); // 44032 은 한글 '가' 의 유니코드 값
		osw.flush();
		
		System.out.println();
		
		osw.write("안녕하세요~!!"); // 한글로도 입력 가능
		osw.flush();

	}
}