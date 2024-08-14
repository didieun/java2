package io.file;

import java.io.*;

public class Ex03 {

	public static void main(String[] args) throws Exception {
		
		// 윈도우의 폴더 구별자: \
		// 리눈스의 폴더 구별자: /
				
		// File.separator : 폴더 구별자( 윈도우랑 리눅스는 구별자가 다르기 때문에  File.separator 을 사용하여 구별한다)
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt"); // 파일 경로의 객체 , 파일명 
		
		FileOutputStream fos = new FileOutputStream(file, true);
		// 파일이 없으면 파일을 만들어준다.
		// 객체 생성시 true 이면 파일 자료에 이어쓰기, false 이면 다시쓰기
		
		fos.write(65); // 하나의 정수로 입력(아스키 코드값으로 넣어준다.)
		fos.write('B'); // 하나의 단일 문자로도 넣을수 있다. 
		
		
		// byte 배열로 문자열 넣기
		String msg = "Hello World";
		
		byte[] byteArray = msg.getBytes();
		
		fos.write(byteArray);
		fos.write(byteArray, 6, 5);
		
		fos.close(); // 연결된 Stream 을 닫아준다.(안닫아주면 계속 연결되어있어서 연결된 Stream 을 닫아줘야됨)
		
	}
}