package org.java.condition;

public class Grade {
	//member : field, construct, method
	
	//field
	private int kor; //instance(field, property)
	private int eng;
	private int math;
	
	//constructor(������) : Ư�� method
	public Grade (int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	//method
	public void sumGrade() {
		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + math);
		int sum = kor + eng + math;
		System.out.println("����: " + sum);
	}
	
	//method
	public void avgGrade() {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		System.out.println("���: " + avg);
	}
	
	//method
	public double avgGet() {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		return avg;
	}
}
