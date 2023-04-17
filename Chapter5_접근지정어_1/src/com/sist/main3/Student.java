package com.sist.main3;

//데이터형으로만 사용
public class Student {
	private int Hakbun;
	public String name;
	int kor,eng,math;
	protected String sex;
	private int total;
	private double avg;
	private char score;
	private int rank;
	//private로 클래스 변수를 만들때 getter / setter 꼭 기억해야 함
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getScore() {
		return score;
	}
	public void setScore(char score) {
		this.score = score;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	//겟터/ 세터로 접근이 가능하게 만듦
	public int getHakbun() {
		return Hakbun;
	}
	public void setHakbun(int hakbun) {
		Hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
