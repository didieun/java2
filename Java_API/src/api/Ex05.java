package api;

public class Ex05 {

	public static void main(String[] args) {
		
		double a = Math.random();

		System.out.println(a);
		
		int b = (int)(Math.random() * 10);
		// 0.0 ~ 9.99999 int로 cathing 해주면 소수점이 버려짐 -> 0 ~ 9
		System.out.println(b);
		
		System.out.println();
		
		int[] lotto = new int[6];
		
		// 1 ~ 45 까지 수 중에 6개의 뽑아
		// lotto 배열의 각 요소에 저장
		//중복된 수 제거
		
		for (int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			// 0 ~ 44 -> 1 ~ 45 가됨 
			
			for(int j = 0; j < i; j++) { // j는 i의 아랫수까지만 반복
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.print("로또번호: ");
		
		for(int i : lotto) {
			System.out.print(i + " ");
		}
	}

}