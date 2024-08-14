package lambda.practice;

import java.util.Scanner;
import java.util.function.*;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 계산할 정수: ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 계산할 정수: ");
		int num2 = scan.nextInt();
		
		System.out.println("[+, -, *, /] 중 계산할 연산자를 입력해주세요.");
		System.out.print("입력: ");
		String operator = scan.next();
		
		// 문제: 람다식으로 계산기 만들기
		// 두 개의 정수와 연산자('+', '-', '*', '/')를 입력으로 받아서
		// 해당 연산을 수행하는 람다식 작성하기
		
		// 입력: 5, 3, +
		// 출력: 8
		
		// BinaryOperator 함수형 인터페이스를 사용하면
		// 두 개의 입력 값을 받아 연산을 수행할 수 있다.
		BinaryOperator<Integer> add = (x, y) -> x + y;
		BinaryOperator<Integer> subtract = (x, y) -> x - y;
		BinaryOperator<Integer> multiply = (x, y) -> x * y;
		BinaryOperator<Integer> divide = (x, y) -> x / y;
		
		BinaryOperator<Integer> selectedOperator = null;
		
		
		switch(operator) {
			case "+" :
				selectedOperator = add;
				break;
			case "-" : 
				selectedOperator = subtract;
				break;
			case "*" :
				selectedOperator = multiply;
				break;
			case "/" : 
				selectedOperator = divide;
				break;
			default:
				System.out.println("연산자가 잘못입력 되었습니다.");
		}
		
		if(selectedOperator != null) {
			int result = selectedOperator.apply(num1, num2);
			System.out.println("연산 결과: " + result);
		}
		
		scan.close();

	}
}