package clazz;

class Student { // 설계도
	// 클래스 안에는 구성멤버는
	// 필드, 생성자, 메소드(기본적인 멤버)
	
	// 필드(속성) -> 현재상태 데이터!
	String school = "IT 학교";
	String name;
	int age;
	
	// 생성자(객체 초기화) -> 기본생성자 추가 단축키 -> ctrl + 스페이스바 첫번째 엔터
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메소드(기능)
	public void studentProfile() {
		System.out.println("학교: " + school);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 객체 생성
		Student student = new Student("홍길동", 20);
		
		// 객체 사용 > 객체이름.필드;
		System.out.println(student.school);
		System.out.println(student.name);
		System.out.println(student.age);
		
		// 객체 사용 > 객체이름.메소드 호출();
		student.studentProfile();

	}
}