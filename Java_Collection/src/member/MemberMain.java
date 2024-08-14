package member;

import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberService service = new MemberServiceImpl();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println();
			System.out.println("########### 회원 관리 프로그램 ###########");
			System.out.println("##  1.회원목록   2.회원조회  3.회원 등록  ##");
			System.out.println("##  4.회원 수정  5.회원삭제  6.종료      ##");
			System.out.println("######################################");
			System.out.println();
			
			System.out.print("메뉴 입력: ");
			int choice = scan.nextInt();
			
			System.out.println();
			
			switch(choice) {
				case 1 :
					service.memberList();
					break;
				case 2 :
					service.memberInfo();
					break;
				case 3 :
					service.memberJoin();
					break;
				case 4 :
					service.memberEdit();
					break;
				case 5 :
					service.memberDelete();
					break;
				case 6 :
					System.out.println("회원 프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("잘못 입력 하였습니다.");
			}
		}

	}

}
