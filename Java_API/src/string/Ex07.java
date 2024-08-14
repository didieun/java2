package string;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영문자를 입력해주세요~");
		System.out.print("입력: ");
		String str = scan.next();
		
		// 입력밥은 문자열: AABBBCCCC
		// 출력: A2B3C4
		
		int count = 1; // 숫자를 붙일 변수
		
		String answer = ""; // 출력할 변수
		
		String temp = str + " "; // 임시변수
		// temp -> AABBBCCCC
		
		for(int i = 0; i < str.length(); i++) {
			if(temp.charAt(i) == temp.charAt(i+1)) {
				count++;
			} else {
				answer += temp.charAt(i);
				answer += count;
				count = 1;	
			}
		}
		
		System.out.println(answer);
		
		scan.close();

	}

}
