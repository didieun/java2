package array;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print(i+1 + "번째 정수를 입력: ");
			num[i] = scan.nextInt();
		}
		
		int temp = 0;
		
		// *문제
		// 이중 for 문, if 문 temp 변수를 사용하여
		// num 배열의 요소들을 차례대로 작은수로 만들기
		
		for(int i = 0; i < 5; i++) {
			for(int j = i + 1; j < 5; j++) {
				if(num[i] > num[j] ) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("작은수로 정렬: " + num[0] + "," + num[1] + "," + num[2] + "," + num[3] + "," + num[4]);
		
		scan.close();
 	}

}
