package io.file;

import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		File file1 = new File("C:\\aaa\\aaa.txt"); // c 드라이브에 aaa 파일 만든다.
		// 파일이 없어도 상관없다.
		
		File file2 = new File("C:\\aaa", "aaa.txt");
		// 파일경로와 파일명으로 객체를 생성할 수 있다.(첫번째는 파일 경로, 두번째는 파일명)
		
		File file3 = new File("C:\\aaa");
		// 파일경로로만 객체를 생성할수 있다.
		
		File file4 = new File(file3, "aaa.txt");
		// 파일경로의 객체와 파일명으로 생성할 수 있다.
		
		// 윈도우의 폴더 구별자: \
		// 리눈스의 폴더 구별자: /
		
		// File.separator : 폴더 구별자( 윈도우랑 리눅스는 구별자가 다르기 때문에  File.separator 을 사용하여 구별한다)
		File dir = new File("C:" + File.separator + "aaa");
		
		File file = new File(dir, "aaa.txt");
		
	}
}