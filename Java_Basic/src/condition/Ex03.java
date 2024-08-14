package condition;

import java.util.Scanner;
// ctrl + shift + o = import java.util.Scanner 불러올수 있다(단축키)

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1 ~ 100 사이의 점수를 입력 : ");
		int score = scan.nextInt();
		
		// switch 문
		// 90 ~ 100 : A 학점
		// 80 ~ 89 : B 학점
		// 70 ~ 79 : C 학점
		// 60 ~ 69 : D 학점
		// 그외 : F 학점
			
		switch(score / 10) {
			case 10 :
			case 9 : System.out.println("A 학점"); break;
			case 8 : System.out.println("B 학점"); break;
			case 7 : System.out.println("C 학점"); break;
			case 6 : System.out.println("D 학점"); break;
			default : System.out.println("F 학점"); break;
		}
		
		
		scan.close();

	}

}
