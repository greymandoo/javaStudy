package org.java.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		System.out.println("While문");

		// 구구단
		int i = 2;
		while (i < 10) {
			System.out.println(i + "단입니다");
			int j = 1;
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			i++;
		}
		
		
		// 구구단 (i=2, k=1의 차이)
		int k = 1;
		while (k < 9) {
			k++;
			System.out.println(k + "단입니다");
			int j = 1;
			while (j < 10) {
				System.out.println(k + " * " + j + " = " + (k * j));
				j++;
			}
		}
		
		//scanner 이용해서 입력단~9단까지 출력
		Scanner scn = new Scanner(System.in);
		System.out.print("단을 입력하시오> ");
		int num = scn.nextInt();
		
		while(num < 10) {
			System.out.println(num + "단입니다");
			int num2=1;
			while (num2<10) {
				System.out.println(num + " * " + num2 + " = " + num*num2);
				num2++;
			}
			num++;
		}
		
		scn.close();
		
		
		
		
		

	}

}
