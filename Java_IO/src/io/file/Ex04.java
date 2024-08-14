package io.file;

import java.io.*;

public class Ex04 {

	public static void main(String[] args) throws Exception {
		
		// 윈도우의 폴더 구별자: \
		// 리눈스의 폴더 구별자: /
				
		// File.separator : 폴더 구별자( 윈도우랑 리눅스는 구별자가 다르기 때문에  File.separator 을 사용하여 구별한다)
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt"); // 파일 경로의 객체 , 파일명 
		
		FileInputStream fis = new FileInputStream(file);
		
//		fis.read();
		// read 는  1byte 를 읽어온다. 예제로 aaa 파일에 18byte 이기때문에 read 를 18번 써야된다.
		// 그래서 반복문을 사용하여 반복적으로 읽어올거임.
		
		while(true) {
			int data = fis.read();
			// 한글자 한글자 아스키코드로 받는다.
			
			if(data == -1) { // 바이트 입력에 파일의 끝값은 -1이다.( 데이터가 없을때 -1)
				break;
			}
			
			System.out.print((char) data);
		}
		
		fis.close();
		
	}
}