package wrapper;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		// .equals: 원본객체와 매개값으로 주어진 객체의
		// 데이터를 비교 후 데이터가 갖다면 true
		// 데이터가 다르면 false 반환
	}

}
