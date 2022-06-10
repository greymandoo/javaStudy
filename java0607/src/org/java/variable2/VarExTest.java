package org.java.variable2;

import java.util.Scanner;

public class VarExTest {
	public static void main(String[] args) {
		System.out.println("원의 넓이 구하기");
		
		final double PI=3.14;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("반지름(정수)을 입력하시오.");
		int radius=scn.nextInt();
		double area=radius*radius*PI;
		System.out.println("입력된 반지름: "+radius);
		System.out.println(radius+"*"+radius+"*"+PI+"="+(radius*radius*PI));
		System.out.println("원의 넓이: "+area);
		
		int area2=(int)(radius*radius*PI);
		System.out.println("원의 넓이(정수): "+area2);
		
		scn.close();
	}
}