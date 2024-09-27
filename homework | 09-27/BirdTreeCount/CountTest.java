package kr.ac.kopo.interfaces;

public class CountTest {

	public static void main(String[] args) {
		
		Countable[] c = {
						  new Bird("뻐꾸기", 5), new Bird("독수리", 2)
						 ,new Tree("사과나무", 10), new Tree("밤나무", 7)
						};
		for(int i = 0; i < c.length; i++) {
			
			c[i].count();
		}
		
		for(int i = 0; i < c.length; i++) {
			if (c[i] instanceof Bird) {
			// 타입 명시없이 c[0].fly()를 쓰면 배열 생성때 지정했던 인터페이스 타입인 Countable이 아니라며 올바른 코드가 아니라고 지적한다. 
			// 배열주소로만 접근해서 메서드를 호출하기전에 해당 인덱스 객체의 타입유무를 잘못 판단할 것 같아서 그런 것 같다.
				((Bird)c[i]).fly();
			}
			if (c[i] instanceof Tree) {
				((Tree)c[i]).ripen();
			}
		}
				
	}

}
