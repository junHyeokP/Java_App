package member.management;

import java.util.HashMap;
import java.util.Map;

public class MyMemberService implements MemberService  {


	private static Map<String, Member> manager = new HashMap<>();
	private static NoMemberException noMemberException = new NoMemberException();
	
    void test() {
    	
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
		
		noMemberException.checkMember(manager.remove(id), id);
		
		if (!manager.containsKey(id)) {
			System.out.println("successfully removed");
			
		}
	}

	@Override
	public boolean login(String id, String password) {
		
		noMemberException.checkMember(manager.get(id), id);
		
		if (manager.containsKey(id)) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean logout(String id) {
		
		noMemberException.checkMember(manager.get(id), id);
		
		if (manager.containsKey(id)) {
			System.out.println("logout");
			return true;
		}
		else return false;
	}

	@Override
	public void info(String id, String password) {	
		
		Member mem = manager.get(id);
		
		noMemberException.checkMember(mem, id);
		
		if (id.equals(mem.getID()) && password.equals(mem.getPassword())) {
			System.out.println(mem.toString());
		}
	}

}
