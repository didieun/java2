package lambda.practice;

// 매개변수 없고, 반환값 없는경우
interface Profile1 {
	public void profile();
}

// 매개변수가 1개 있고, 반환값 없는경우
interface Profile2 {
	public void profile(String name);
}

// 매개변수가 없고, 반환값만 있는경우
interface Profile3 {
	public String profile();
}

// 매개변수 1개가 있고, 반환값이 있는경우
interface Profile4 {
	public String profile(String name);
}


//매개변수 2개, 반환값 있는경우
interface Profile5 {
	public String profile(String name, int age);
}

public class Ex01 {

	public static void main(String[] args) {
		Profile1 profile1;
		Profile2 profile2;
		Profile3 profile3;
		Profile4 profile4;
		
		Profile5 profile5;
		
		// 람다식으로 profile 메소드 표현하기
		profile1 = () -> {
			System.out.println("이름: 홍길동");
		};
		
		profile2 = (name) -> { 
			System.out.println("이름: " + name);
		};
		
		profile3 = () -> {
			return "이름: 성춘향";
		};
		
		profile4 = (name) -> {
			return "이름: " + name;
		};
		
		profile5 = (name, age) -> {
			return "이름: " + name + ", 나이: " + age;
		};
		
		profile1.profile();
		profile2.profile("이몽룡");
		System.out.println(profile3.profile());
		System.out.println(profile4.profile("이순신"));
		System.out.println(profile5.profile("팽수", 20));
		
	}
}