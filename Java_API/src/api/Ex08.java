package api;

import java.util.Calendar;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("조회할 년도를 입력: ");
		int year = scan.nextInt();
		
		System.out.print("조회할 월을 입력: ");
		int month = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month -1, 1);
		// 선택한 년도와 월 그리고 해당월의 1일로 초기화
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 1 ~ 7까지 중 하나를 얻는다.(일 ~ 토)요일을 의미
		// 월의 시작을 의미
		// 1	2	3	4	5	6	7
		// 일	월	화	수	목	금	토
		
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 해당월의 최대 날짜값을 얻는다.
		
		System.out.println("week: " + week + ", lastDay: " + lastDay);
		
		System.out.println("\t\t " + year + "년" + month + "월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 1; i < week; i++) {
			System.out.print("\t");
		}
		
		for(int i = 1; i <= lastDay; i++) {
			System.out.print(i + "\t");
			
			week++;
			
			if(week > 7) {
				week = 1;
				System.out.println();
			}
		}
		
		scan.close();
	}

}