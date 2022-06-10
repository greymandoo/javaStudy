package org.java.loop;

public class While3 {

	public static void main(String[] args) {
		System.out.println("do-while문");
		
		for(int i2=2;i2<1;i2++) {
			System.out.println(i2);
		} //실행안됨
		int i2=2;
		while(i2<1) {
			System.out.println(i2);
		} //실행안됨
		do {
			System.out.println(i2);
		} while(i2<1); //한번 실행됨
		

		int i=2;
		do {
			System.out.println(i+"단입니다");
			int j=1;
			do {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			} while (j<10);
			i++;
		} while (i<10);
		

		

	}

}
