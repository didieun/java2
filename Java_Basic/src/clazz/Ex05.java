package clazz;

// 다형성 : 부모클래스 타입으로 자식객체를 얻는것.
// 1. 부모 클래스가 가지고 있는 모든 멤버들에 접근 할 수 있다.
// 단, 자식 클래스에서 부모클래스의 메서드를 오버라이딩을 했다면
// 오버라이딩이 된 자식 메소드가 호출된다.

// 2. 자식 클래스에만 있는 멤버는 오버라이딩이 된
// 자식 클래스의 메서드에 의해서만 접근 할 수 있다.

class Run {
	
	int speed = 100;
	
	public void run() {
		System.out.println(speed + "의 속도로 달립니다.");
	}
	
}

class HyundaiCar extends Run {
	String model = "소나타";
	
	public void parking() {
		System.out.println(model + "가 주차를 합니다.");
	}
	
	@Override
	public void run() {
		System.out.println(model + "가 " + speed + "의 속도로 달립니다.");
		parking(); 
	}
	
}

class KiaCar extends Run {
	String model = "k5";
	
	public void parking() {
		System.out.println(model + "가 주차를 합니다.");
	}
	
	@Override
	public void run() {
		System.out.println(model + "가 " + speed + "의 속도로 달립니다.");
		parking(); 
	}
}

public class Ex05 {

	public static void main(String[] args) {
		// 다형성 -> 같은 객체지만 다양한 실행결과를 주는것이 다형성
		Run run = new HyundaiCar(); // 자동 타입변환 업캐스팅(Up-casting)
		// 부모 위주이다.

//		System.out.println(run.model); // HyundaiCar 접근할수가 없다.
//		run.parking(); // HyundaiCar 접근할수가 없다.
		
		run.run();
		
		System.out.println();
		
		run = new KiaCar();
		
		run.run();
	}

}