package member.management;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MemberApplication {
	
	
	protected MyMemberService mms = new MyMemberService();
	private boolean key = true;
	private boolean logged = false;

	public void menu() {
		while(key) {
			switch(bufInput("1.회원등록 | 2.회원 탈퇴 | 3.로그인 | 4.로그아웃 | 5.회원정보 | 0.종료 \n")) {
			case "1" -> showRegist();
			case "2" -> showRemove();
			case "3" -> showLogin();
			case "4" -> showLogout();
			case "5" -> showInfo();
			default -> key = false;
			}
		}
	}

	private String bufInput(String message) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
		
		try {
			System.out.print(message);
			return bf.readLine();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void showRegist() {
		
		String name = bufInput("사용자 이름 입력 >> ");
		String id   = bufInput("아이디 입력 >>");
		String pass = bufInput("비밀번호 입력 >>");
		
		Member mem = new Member(id, name, pass);
		
		mms.regist(mem);
	}
	
	public void showRemove() {
		
		String id   = bufInput("아이디 입력 >>");
		mms.remove(id);
	}
	
	private void showLogin() {
		String id	 = bufInput("아이디 입력 >> ");
		String pass  = bufInput("비밀번호 입력 >>");
		
		if (mms.login(id, pass)) {
			System.out.println("login success");
			logged = true;
		} else {
			System.out.println("login failed");
			logged = false;
			
		}
	}
	
	private void showLogout() {
		
		if (logged == false) {
			System.out.println("로그인하세요.");
			return;
		}
		
		String id	 = bufInput("아이디 입력 >> ");
		logged = mms.logout(id);
	}
	
	public void showInfo() {
		
		if (logged == false) {
			System.out.println("로그인하세요.");
			return;
		}
		
		String id	 = bufInput("정보를 확인할 아이디 입력 >> ");
		String pass  = bufInput("보안상 비밀번호 입력 >>");
		
		mms.info(id, pass);
	}
	
	

}
