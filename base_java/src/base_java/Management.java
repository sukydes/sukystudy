package base_java;

import java.util.Scanner;

/*
 * 인사관리를 한 명이 '직접'하는 형태
 */
public class Management {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력");
		String name = sc.nextLine();
		System.out.print("직급 입력");
		int level = sc.nextInt();
		
		System.out.println("이름: " + name + " 직급: " + level);
		
		
		// 개인정보
		PersonInfo firstP = new PersonInfo("김시은", 15);
		PersonInfo secondP = new PersonInfo("홍길동", 20, "", "", "", "");
		PersonInfo thirdP = new PersonInfo("q", 55, "3838");
		
		// 계좌정보
		BankAccount firstA = new BankAccount("김시은", "우리은행", "1002-****", 0);
		BankAccount secondA = new BankAccount("홍길동", "카카오뱅크", "9999-****", 0);
		BankAccount thirdA = new BankAccount("q", "신한은행", "1219-****", 20000);
		
		//firstP.personInfo();
		//firstA.accountInfo();
		
		//System.out.println("3번째 신입사원 사번:" + thirdP.getP_num());
		firstA.salaryInfo(name, level, thirdP);
	}
}
