package member_Management;

public interface MemberService {
	
	void regist(Member member);
	void remove(String id);
	
	boolean login(String id, String password);
	boolean logout(String id);
	
	void info(String id, String password);
}
