package interface1;

// 매개변수의 다형성

interface Vehicle {
	
	public void run();
}

class Bus implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}

class Taxi implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}

}

class Driver {
	
	public void drive(Vehicle vehicle) {
		
		// instanceof :  객체타입 확인 연산자 (객체 instanceof 타입)
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle; //강제 타입변환(다운 캐스팅)
			bus.checkFare();
		}
		
		System.out.println("드라이브를 시작합니다.");
		vehicle.run();
	}
}

public class Ex03 {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(taxi); // 매개변수의 다형성
		
		System.out.println();
		
		driver.drive(bus);
	
	}
}