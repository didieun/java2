package array;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] intArray = {10, 20, 30, 40, 50, 60, 70};
		
		for(int i = 0; i < 7; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println();
		
		// 배열의 길이
		System.out.println(intArray.length);
		
		System.out.println();
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		System.out.println();
		
		// 향상된 for 문
		// for(배열의 요소를 저장할 변수선언 : 배열)
		
		for(int num : intArray) {
			System.out.println(num);
		}

	}

}
