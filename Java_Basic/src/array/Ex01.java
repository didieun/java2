package array;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(참조타입) - 선언과 동시에는 배열 생성 가능
				int[] intArray1 = {1, 2, 3};
				
				// 배열 사용
				System.out.println(intArray1[0]);
				System.out.println(intArray1[1]);
				System.out.println(intArray1[2]);
				
				System.out.println();
				
				// 배열은 선언한뒤에는 new(배열생성을 무조건 해줘야된다)
				int[] intArray2 = null;
				
				intArray2 = new int[] {10, 20, 30};
				
				System.out.println(intArray2[0]);
				System.out.println(intArray2[1]);
				System.out.println(intArray2[2]);
				
				System.out.println();
				
				int[] intArray3 = new int[3];
				// 기본초기값 - 정수는 0, 실수는 0.0, char 은 '0', boolean 은 false, 문자는 null
				
				intArray3[0] = 100;
				intArray3[1] = 200;
				intArray3[2] = 300;
				
				System.out.println(intArray3[0]);
				System.out.println(intArray3[1]);
				System.out.println(intArray3[2]);
	}

}
