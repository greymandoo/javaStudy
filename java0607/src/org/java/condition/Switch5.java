package org.java.condition;

import java.util.Scanner;

public class Switch5 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);		
		
		System.out.println("정수를 입력(0~100)");
		int num = scn.nextInt();
		char grade = ' ';
		switch(num/10) {
		case 10: //100
		case 9: //90~99
			grade = 'A';
			break;
		case 8: //80~89
			grade = 'B';
			break;
		case 7: //70~79
			grade = 'C';
			break;
		case 6: //60~69
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		
		System.out.println("학점 : " + grade);
		
		scn.close();
		
		
	}
	
}
