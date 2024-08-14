package api;

import java.text.SimpleDateFormat;
import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		
		// 현재 시스템의 시간으로 객체를 생성
		// 그 외는 잘 사용하지 않는다. ( 윤년떄문에 오차가 있음..)
		Date now = new Date();
		
		System.out.println(now);
		// 출력 예 -> Tue Jul 16 12:56:07 KST 2024
		//		  화요일, 7월, 16일, 시:분:초, 한국시간, 년도
		
		// 위는 가독성이 안좋으니깐 포맷하는 방법
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat format2 = new SimpleDateFormat("a hh시 mm분 ss초");
		
		String date = format1.format(now);
		String time = format2.format(now);
		
		System.out.println("Date: " + date);
		System.out.println("Time: " +time);
		
		System.out.println();
		
		// Calendar 더 많이 사용됨.
		// Calendar: 추상 클래스로 객체를 직접 생성할 수 없다.
		// getInstance(); 을 사용하여 정적메소드로 객체를 얻어와야 한다.
		Calendar cal = Calendar.getInstance();
		
		// 사용방법
		// get 메소드로 calendar 필드를 넣어준다. get 메소드는 정수로 반환함.
		int year = cal.get(Calendar.YEAR); 
		int month = cal.get(Calendar.MONTH + 1);
		// 주의 사항! 컴퓨터의 월은 0부터 시작하기때문에 +1을 해주어야 한다.
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("오늘의 날짜: %d년 %d월 %d일\n", year, month, day );
		
		int hour = cal.get(Calendar.HOUR); // 12시간제
		int hour2 = cal.get(Calendar.HOUR_OF_DAY); // 24시간제
		
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("현재 시간: %d시 %d분 %d초 \n", hour, minute, second);
		System.out.printf("현재 시간: %d시 %d분 %d초 \n", hour2, minute, second);
		
	}

}