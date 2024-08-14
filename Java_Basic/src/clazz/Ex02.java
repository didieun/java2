package clazz;

class Car {
	private String color;
	private int speed;
	
	// Getter, Setter 메서드 쉽게 만드는법
	// class 안에서 마우스 오른쪽 버튼 클릭 -> source 클릭 -> Generate Getter and Setter 클릭 
	// -> 필요한 Getter, Setter 선택후 Generate 하면됨!
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		
		if(speed < 30) {
			speed = 30;
		}
		
		return speed;
	}
	public void setSpeed(int speed) {
		
		// 필드값을 검증한뒤.. 
		if(speed < 0 || speed > 200) {
			return;
		}
		
		this.speed = speed;
	}	
}

public class Ex02 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
//		myCar.color = "빨강"; //private 를 접근제한자를 사용하면 필드값을 변경 못함!
//		myCar.speed = 100; //private 를 접근제한자를 사용하면 필드값을 변경 못함!
//		
//		System.out.println("내 자동차 색상: " + myCar.color);
//		System.out.println("내 자동차 속도: " + myCar.speed);
//		System.out.println();
		
		myCar.setColor("검정");
		myCar.setSpeed(20);
		
		System.out.println("내 자동차 색상: " + myCar.getColor());
		System.out.println("내 자동차 속도: " + myCar.getSpeed());
	}
}