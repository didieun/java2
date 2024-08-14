package api;

public class Ex04 {

	public static void main(String[] args) {
		
		// Math: 여러가지 수학적인 기능들이 필요할때 사용하는 클래스
		// 모든 메소드는 정적으로 구성되어 클래스로 편하게 접근이 가능하다.
		
		// abs -> 매개값으로 주어진 데이터의 절대값을 반환
		int a = Math.abs(-10);
		System.out.println(a); // 결과 -> -10 의 절대값은 10 출력
		
		// max -> 전달된 두 데이터 중 더 큰수를 반환
		int b = Math.max(1, 9);
		System.out.println(b); // 결과 -> 1과 9중에 9가 더크기때문에 9 출력
		
		// min -> 전달된 두 데이터 중 더 작은수를 반환
		int c = Math.min(1, 9);
		System.out.println(c); // 결과 -> 1과 9중에 1이 더 작기때문에 1 출력
		
		// random -> 0.0 이상 1.0미만 사이에 속하는 double 타입의 난수를 반환
		double d = Math.random();
		System.out.println(d); // 결과 -> 0.0이상 1.0미만의 수중 랜덤으로 난수 반환
		
		// ceil -> 전달된 데이터를 올림하여 반환
		double e = Math.ceil(1.1);
		System.out.println(e); // 결과 -> 1.1 올림값이기 때문에 2.0 반환
		
		// floor -> 전달된 데이터를 버림하여 반환
		double f = Math.floor(9.9);
		System.out.println(f); // 결과-> 9.9 버림하여 9.0 반환
		
		// round -> 전달된 데이터를 반올림하여 반환(long 타입으로 반환)
		long g = Math.round(5.3);
		long h = Math.round(5.7);
		
		System.out.println(g); // 결과 -> 5.3의 반올림은 5
		System.out.println(h); // 결과 -> 5.7의 반올림은 6

	}

}