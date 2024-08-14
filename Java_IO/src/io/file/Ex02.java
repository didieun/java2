package io.file;

import java.io.*;

public class Ex02 {

	public static void main(String[] args) throws Exception {
		
		// 윈도우의 폴더 구별자: \
		// 리눈스의 폴더 구별자: /
		
		// File.separator : 폴더 구별자( 윈도우랑 리눅스는 구별자가 다르기 때문에  File.separator 을 사용하여 구별한다)
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt"); // 파일 경로의 객체 , 파일명 
		
		if(file.createNewFile()) {
			// 파일이 없으면 파일을 생성후 true 반환
			// 파일이 있으면 false 반환
			System.out.println("aaa.txt 파일을 생성했습니다.");
		} else {
			System.out.println("aaa.txt 파일은 이미 존재합니다.");
		}
		
		File imsi = File.createTempFile("java", ".dat", dir);
		// .createTempFile -> 임시파일 생성 (파일명, 확장자, 경로)
		// 임시파일은 앞에 이름을 정하고 중간에 임의의 숫자가 들어간다.
		// 뒤에 이름을 정한다.(확장자)
		
		// 임시파일은 잠시 생성하고 프로그램이 끝날때 삭제를 해야된다.
		imsi.deleteOnExit(); // .deleteOnExit(); -> 프로그램 끝날때 삭제
		
		Thread.sleep(5000);
		// 5초간 프로그램을 잠재운다.
		
		file.delete(); // 바로 삭제
		
		Thread.sleep(5000);
		// 5초간 프로그램을 잠재운다.
			
	}
}