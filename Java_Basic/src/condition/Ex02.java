package condition;

public class Ex02 {

	public static void main(String[] args) {
		// switch
		
		int a = 7;
		
		//switch(data) -> data 는 정수, 문자, 문자열만 가능 실수는 올수가 없다.(또는 switch(a + 1) 넣을수있다)
		
		switch(a) {
			case 1: System.out.println("숫자 1 입니다."); break;
			case 2: System.out.println("숫자 2 입니다."); break;
			case 3: System.out.println("숫자 3 입니다."); break;
			case 4: System.out.println("숫자 4 입니다."); break;
			default : System.out.println("숫자 1 ~ 4가 아닙니다.");
		}

	}

}
