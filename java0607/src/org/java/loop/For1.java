package org.java.loop;

public class For1 {

	public static void main(String[] args) {
		System.out.println("for문");

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
		} // i가 10이 되면 {}실행 안하고 여기로

		System.out.println("");

		// 1~10까지 출력
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + ", ");
		}
		System.out.println("");

		// 10뒤에 , 빼기
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				System.out.print(i + 1);
				break; // 하위 명령문 실행 안하고 반복문이 종료
			}
			System.out.print((i + 1) + ", ");
		} // break문
		System.out.println("");
		
		
		for(int i=0;i<10;i++) {
			
//			String url = "";
			
			System.out.println("url(img/bg"+i+".jpg) no-repeat 50%/cover");
			
		}
		
		

	}

}
