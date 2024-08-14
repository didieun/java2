package api;

import java.util.*;
// * 은 모든것을 뜻함 -> java.util 안에있는 모든것을 불러옴

public class Ex06 {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		// Arrays 클래스 : 배열을 사용함에 있어 편리한 기능을 제공해주는 클래스
		// 모든 메소드는 정적으로 구성되어 있어 클래스로 편하게 접근 가능
		// 위치는 java.util 패키지 안에 있다.
		
		// 전달받은 배열의 요소들을 문자열로 반환
		String str = Arrays.toString(array);
		System.out.println(str);
	
		// copyOf(복사할 배열, 길이)
		// 길이만큼 새로운 배열이 만들어지고
		// 복사할 배열의 index 0부터 복사가 된다.
		int[] array2 = Arrays.copyOf(array, array.length);
		System.out.println(Arrays.toString(array2)); // 출력
		
		int[] array2_1 = Arrays.copyOf(array, 3);
		System.out.println(Arrays.toString(array2_1)); // 출력
		
		int[] array2_2 = Arrays.copyOf(array, 7);
		System.out.println(Arrays.toString(array2_2)); // 출력
		
		// copyOfRange(복사할 배열, 시작위치, 끝위치) -> 끝위치는 포함안되고 그전 위치까지(ex) 4이면 3까지
		// 배열의 요소가 복사가 된다.
		int[] array3 = Arrays.copyOfRange(array, 2, 4);
		// -> 복사할 배열의 index 2부터 3까지(4는 불포함)
		System.out.println(Arrays.toString(array3));
		
		System.out.println();
		
		int[] intArray = {3, 5, 1, 6, 2, 7, 4};
		System.out.println("원본: " + Arrays.toString(intArray));
		
		// sort 메소드: 전달받은 배열의 모든 요소를 오름차순으로 정렬한다.
		Arrays.sort(intArray);
		
		System.out.println("정렬: " + Arrays.toString(intArray));
	}

}