package clazz;

class Suv {
	int speed = 100;
	
	public void run() {
		System.out.println("SUV 차량이 달립니다.");
	}
}

class Santafe extends Suv {
	
	int speed = 120;
	
	@Override //오버라이딩 -> 메소드 재정의 
	public void run() {
		System.out.println("싼타페 차량이 달립니다.");
	}
	
	public void disp() {
		// 부모필드명랑 자식필드명이 같은 경우 
		System.out.println("SUV 속도: " + super.speed); // 부모필드는 super. 를 사용
		System.out.println("싼타페 속도: " + this.speed); // 자식필드는 this. 를 사용
	}
	
}

public class Ex04 {
	public static void main(String[] args) {
		// 오버라이딩
		Santafe santafe = new Santafe();
		
		santafe.run();
		santafe.disp();

	}

}
