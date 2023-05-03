package com.sist.io;

import java.io.Serializable;

// 직렬화 만드는 방법
// 직렬화 : implements Serializable
// 객체단위로 저장할 때는 직렬화를 하지 않으면 저장이 안됨

public class Sawon implements Serializable{
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	//생성자
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
	// 기본생성자   // 무조건 생성자를 만들면 기본생성자를 생성해야 함
	// 이게 값을 받아서 옴
	public Sawon() {}
	
}
