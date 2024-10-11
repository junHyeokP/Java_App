package member.management;

public class NoMemberException extends RuntimeException{

	/**
	 * No Member?
	 * @param Object : 회원 객체
	 * @param String : 입력한 ID
	 * 
	 * @return Error Message (입력회원 없음 : 입력했던 아이디)
	 */
	
	NoMemberException() {
		
	}
	
	public NoMemberException(String message) {
		super(message);
	}

	public void checkMember(Member mem, String id) {
		
		if (mem == null) {
			throw new NoMemberException("입력 회원 없음 : " + id);
		}
		
	}
		
}
