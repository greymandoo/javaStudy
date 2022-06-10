package org.java.my;

import java.util.Scanner;

public class for7 {
	public static void main(String[] args) {
	
		boolean run=true;
		int balance=0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			
			System.out.print("선택> ");
			int opt = scanner.nextInt();
			
			if (opt==4) {
				break;
			} else if (opt==1) {
				System.out.print("예금액> ");
				balance = scanner.nextInt();
			} else if (opt==2) {
				System.out.print("출금액> ");
				int withdrawl = scanner.nextInt();
				balance -= withdrawl;
			} else if (opt==3) {
				System.out.println("잔고> "+balance);
			}
						
		}
			
	}
	
}
