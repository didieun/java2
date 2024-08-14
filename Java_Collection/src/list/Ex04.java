package list;

import java.util.*;

// Student 클래스를 만든다.
// 필드 int studentId; String name; String department;
// 생성자를 통해 매개변수로 매개값을 받아 필드 초기화를 한다.
// profile 메소드를 만들어서 필드를 출력하기

class Student {
	int studentId;
	String name;
	String department;
	
	public Student(int studentId, String name, String department) {
		this.studentId = studentId;
		this.name = name;
		this.department = department;
	}
	
	public void profile() {
		System.out.println("학번: " + studentId);
		System.out.println("이름: " + name);
		System.out.println("학과: " + department);
	}
}

public class Ex04 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		
		// 3개의 Student 객체를 생성하여 List 에 저장하기
		list.add(new Student(202401,"홍길동", "컴퓨터"));
		list.add(new Student(202402,"성춘향", "음악"));
		list.add(new Student(202403,"이순신", "경영"));
		
		// Iterator 를 사용하여 Student 객체의 profile 메소드 호출하기
		Iterator<Student> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Student student = iterator.next();
			student.profile();
			System.out.println();
		}

	}

}