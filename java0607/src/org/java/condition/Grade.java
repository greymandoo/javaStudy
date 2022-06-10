package org.java.condition;

public class Grade {
	//member : field, construct, method
	
	//field
	private int kor; //instance(field, property)
	private int eng;
	private int math;
	
	//constructor(생성자) : 특수 method
	public Grade (int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}

	//method
	public void sumGrade() {
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		int sum = kor + eng + math;
		System.out.println("총점: " + sum);
	}
	
	//method
	public void avgGrade() {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		System.out.println("평균: " + avg);
	}
	
	//method
	public double avgGet() {
		int sum = kor + eng + math;
		double avg = sum/3.0;
		return avg;
	}
}
