package io;

// 입출력 관련된 패키지들은 아래에 저장
import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws Exception {
		
		// 데이터들은 2진수로 이루어진 바이트로 전달이 되어진다.
		// 이러한 입출력을 실행하기 위해 자바에서는 Stream 이 사용된다.
		
		// InputStream 은 1byte 단위 처리 스트림이다.
		// 영문자 - 대소문자, 숫자, 특수문자만 처리할 수 있다.
		InputStream input = System.in;
		
		System.out.print("키 코드 입력하고 엔터: ");
	
		int keyCode = input.read();
		
		System.out.println(keyCode);
		System.out.println((char)keyCode);
		
		keyCode = input.read(); //엔터값
		System.out.println(keyCode);
		
		keyCode = input.read(); //엔터값
		System.out.println(keyCode);
		
		// 키를 입력하면 buffer 에 임시저장이 되고 read() 를 읽어옴
		// 읽어낸 데이터를 배열로 저장이 된다. -> 읽어온 데이터는 길이로 반환(정수로 반환)
		byte[] byteArray = new byte[100];
		
		System.out.print("이름 입력: ");
		int length = input.read(byteArray);
		
		// 키코드값으로 출력
		for(int i = 0; i < length; i++) {
			System.out.print(byteArray[i]);
		}
		
		System.out.println();
		
		// 문자로 출력
		for(int i = 0; i < length; i++) {
			System.out.print((char)byteArray[i]);
		}
		
		System.out.println();
		
	}
}