package member;

import java.util.*;

public class MemberServiceImpl implements MemberService {

	private List<Member> list = new ArrayList<>();
	
	private Scanner scan = new Scanner(System.in);
	
	@Override
	public void memberJoin() {
		// 회원등록: 아이디, 비밀번호, 이름, 나이를 입력받아 회원 등록
		// 아이디는 중복이 될 경우에 메소드 종료
		
		System.out.print("가입할 아이디 입력: ");
		String id = scan.next();
		
		for(Member member : list) {
			if(member.getId().equals(id)) {
				System.out.println("같은 아이디가 이미 존재합니다.");
				return;
			}
		}
		
		System.out.print("가입할 비밀번호 입력: ");
		String pw = scan.next();
		System.out.print("이름 입력: ");
		String name = scan.next();
		System.out.print("나이 입력: ");
		int age = scan.nextInt();

		list.add(new Member(id, pw, name, age));
		
		System.out.println("회원 등록이 되었습니다.");
	}
	
	@Override
	public void memberList() {
		// 전체 회원의 목록 출력
		
		System.out.println("---------------------------------------------------------");
		
		for(Member member : list) {
			String id = member.getId();
			String pw = member.getPw();
			String name = member.getName();
			int age = member.getAge();
			
			System.out.println("아이디: " + id + ", 비밀번호: " + pw + ", 이름: " + name + ", 나이: " + age);
		}
		
		System.out.println("---------------------------------------------------------");
	}

	@Override
	public void memberInfo() {
		// 조회할 아이디를 입력받아 해당 회원의
		// 아이디, 비밀번호, 이름, 나이 출력
		
		System.out.print("조회할 회원의 아이디: ");
		String id = scan.next();
		
		for(Member member : list) {
			if(member.getId().equals(id)) {
				System.out.println("---------------------------------------------------------");
				System.out.println("회원 아이디: " + id);
				System.out.println("회원 비밀번호: " + member.getPw());
				System.out.println("회원 이름: " + member.getName());
				System.out.println("회원 나이: " + member.getAge());
				System.out.println("---------------------------------------------------------");
				return;
			}
		}
		
		System.out.println("해당 아이디의 회원이 존재하지 않습니다.");
		
	}

	@Override
	public void memberEdit() {
		// 수정할 회원의 아이디를 입력받아 해당 회원의
		// (수정할 비밀번호, 나이 입력받아)비밀번호, 나이를 수정하기
		
		System.out.print("수정할 회원의 아이디: ");
		String id = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			
			Member member = list.get(i);
			
			if(member.getId().equals(id)) {
				System.out.print("수정할 비밀번호 입력: ");
				String pw = scan.next();
				System.out.print("수정할 나이 입력: ");
				int age = scan.nextInt();
				
				member.setPw(pw);
				member.setAge(age);
				System.out.println(member.getName() + "님의 비밀번호와 나이를 수정했습니다.");
				
				return;
			}
		}
		
		System.out.println("해당 아이디의 회원이 존재하지 않습니다.");
		
	}

	@Override
	public void memberDelete() {
		// 삭제할 회원의 아이디를 입력받아 해당회원 삭제하기
		
		System.out.print("삭제할 회원의 아이디: ");
		String id = scan.next();
		
		for(int i = 0; i < list.size(); i++) {
			
			Member member = list.get(i);
			
			if(member.getId().equals(id)) {
				
				list.remove(i);
				System.out.println(member.getName() + "회원을 삭제하였습니다.");
				
				return;
			}
		}
		
		System.out.println("해당 아이디의 회원이 존재하지 않습니다.");
	}

}
