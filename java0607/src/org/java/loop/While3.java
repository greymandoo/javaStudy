package org.java.loop;

public class While3 {

	public static void main(String[] args) {
		System.out.println("do-while��");
		
		for(int i2=2;i2<1;i2++) {
			System.out.println(i2);
		} //����ȵ�
		int i2=2;
		while(i2<1) {
			System.out.println(i2);
		} //����ȵ�
		do {
			System.out.println(i2);
		} while(i2<1); //�ѹ� �����
		

		int i=2;
		do {
			System.out.println(i+"���Դϴ�");
			int j=1;
			do {
				System.out.println(i + " * " + j + " = " + i*j);
				j++;
			} while (j<10);
			i++;
		} while (i<10);
		

		

	}

}
