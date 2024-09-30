package member_Management;

import java.util.HashMap;
import java.util.Map;

public class MyMemberService implements MemberService  {

	private static Map<String, Member> manager = new HashMap<String, Member>();
	
    void test() {
		/*if (member.getID().equals(manager.get(member.getID()))) {
			return member;
		}
		else return null;*/
		
		Member mem = new Member("hong1234", "gildong", "5678");
		manager.put(mem.getID(), mem);
		
		if (manager.containsKey(mem.getID())) {
			System.out.println("success");
		}
		
	}

	@Override
	public void regist(Member member) {
		
		manager.put(member.getID(), member);
		
		if (manager.containsKey(member.getID())) {
			System.out.println("successfully put");
		}
		
	}

	@Override
	public void remove(String id) {
		
		manager.remove(id);
		
		if (!manager.containsKey(id)) {
			System.out.println("successfully removed");
			
		}
	}

	@Override
	public boolean login(String id, String password) {
		
		if (manager.containsKey(id)) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean logout(String id) {
		
		if (manager.containsKey(id)) {
			System.out.println("logout");
			return true;
		}
		else return false;
	}

	@Override
	public void info(String id, String password) {
		
		Member mem = manager.get(id);
		if (mem == null) {
			System.out.println("아이디 혹은 비밀번호와 일치하는 정보가 없습니다.");
			return;
		}
		
		if (id.equals(mem.getID()) && password.equals(mem.getPassword())) {
			System.out.println(mem.toString());
		}
		
	}
    
    

}
