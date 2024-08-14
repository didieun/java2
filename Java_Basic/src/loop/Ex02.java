package loop;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// while 문
		
		int i = 0;
		
		while(i < 5) {
			System.out.println("while문 안입니다. i : " + i);
			i ++;
		}
		
		System.out.println("while문을 나왔습니다. i : " + i);
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("10 + 20 의 답을 입력해주세요.");
		System.out.print("입력 : ");
		int num = scan.nextInt();
		
		while(num != 30) {
			System.out.println("정답이 틀렸습니다. 다시 입력해주세요.");
			System.out.print("입력 : ");
			num = scan.nextInt();
		}
		
		System.out.println("정답입니다.");
		System.out.println("입력하신 정답 : " + num);
		scan.close();

	}

}
