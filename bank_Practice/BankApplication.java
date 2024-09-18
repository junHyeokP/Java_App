package bank_Practice;

import java.util.Scanner;

public class BankApplication{
	
	String[] Account;
	int Account_seq;
	
	BankApplication() {
		this.Account = new String[100];
	}
	
	void start() {
		
		boolean flag = true;
		
		while (flag) {
		
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			
		switch (input("선택 > ")) {
			case "1" -> createAccount();
			case "2" -> listOfAccount();
			case "3" -> deposit();
			case "4" -> withdrawal();
			case "5" -> flag = false;
			}
		
		}
		
	}

	private void createAccount() {
		
		Account[Account_seq++] = input("계좌번호 : ");
		Account[Account_seq++] = input("계좌주 : ");
		Account[Account_seq++] = input("조기입금액 : ");
		System.out.println("계좌 생성 완료");
		
	}
	
	
	private void listOfAccount() {
		
		for (int i = 0, c = 0; i < Account.length; i++) {
			
			if (Account[i] == null) {
				break;
			}
			
			System.out.print(Account[i]+ "     ");	
			c++;
			
			if (c % 3 == 0) {
				System.out.println();
				}
			}
		
	}
	
	private void deposit() {
		
		System.out.println("----------\n예금\n----------");
		String num = input("계좌번호 : ");
		
		for (int i = 0, c = 0; i < Account.length; i++, c++) {
			
			if (num.equals(Account[i])) {
				int n1 = Integer.parseInt(Account[c+2]) + Integer.parseInt(input("예금액 : "));
				 
				Account[c+2] = n1 + "";
				break;
			}

			}
		
		
	}
	
	private void credit() {
		
		System.out.println("----------\n출금\n----------");
		String num = input("계좌번호 : ");
		
		for (int i = 0, c = 0; i < Account.length; i++, c++) {
			
			if (num.equals(Account[i])) {
				int n1 = Integer.parseInt(Account[c+2]) - Integer.parseInt(input("예금액 : "));
				 
				Account[c+2] = n1 + "";
				break;
				} 

			}
		System.out.println("출금 성공");
	}
	
	private void withdrawal() {
		
		
	}
	


	String input(String message) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print(message);
		
		return sc.nextLine();
	}
}
