package io.file;

import java.io.*;

// 직열, 역직열은 JVM이 함. 그래서 개발자는 타입을 넣어줘야됨
// implements Serializable 추가로 타입 정보 넣어줌( 상속받는다)
class Person implements Serializable {
	
	String name = "홍길동";
	int age = 20;

}

public class Ex11 {

	public static void main(String[] args) throws Exception {
		
		File dir = new File("C:" + File.separator + "aaa");
		File file = new File(dir, "aaa.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		// 객체 입출력 스트림 사용이유
		// 복잡한 데이터 구조를 저장할 수 있고 객체를 직렬화하여 상태를 저장하면,
		// 프로그램이 종료되거나 중단된 상황에서도 이전 상태를 보존할 수 있다.
		// 또한 직렬화된 객체는 일반 텍스트보다 더욱 어렵게 이해할 수 있으므로,
		// 데이터 보안 측면에서도 유리하다.
		
		Person person = new Person();
		
		oos.writeObject(person); // 직렬화 되어서 aaa.txt 출력함( 객체여서 내용이 무슨내용인지 모름)
		
		oos.close();
	
	}
}