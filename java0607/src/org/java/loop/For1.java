package org.java.loop;

public class For1 {

	public static void main(String[] args) {
		System.out.println("for��");

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		} // i�� 10�� �Ǹ� {}���� ���ϰ� �����

		System.out.println("");

		// 1~10���� ���
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ", ");
		}
		System.out.println("");

		// 10�ڿ� , ����
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				System.out.print(i + 1);
				break; // ���� ��ɹ� ���� ���ϰ� �ݺ����� ����
			}
			System.out.print((i + 1) + ", ");
		} // break��
		System.out.println("");
		
		
		for(int i=0;i<10;i++) {
			
//			String url = "";
			
			System.out.println("url(img/bg"+i+".jpg) no-repeat 50%/cover");
			
		}
		
		

	}

}
