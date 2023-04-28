package com.sist.gn;

import java.util.*;

//class A {
//	int a;
//}
//class B extends A {
//	int b;
//}
// A => a   B => a, b
// Object는 사원클래스에 접근 불가
/*
		
 */
class Sawon {
//	int a;
//  여기에는 Object가 가지고 있는 모든 것을 가지고 있음
	private int sabun;
	private String name;
	private String dept;
	private String job;
	private int pay;
	
	
	public Sawon(int sabun, String name, String dept, String job, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.job = job;
		this.pay = pay;
	}
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
	
	
}
// Sawon s = new Sawon(); s.addr
class Human {
	public String name;
	public String addr;
}
public class 라이브러리_제네릭_1 {

	public static void main(String[] args) {
//		Object o = new Sawon(); //이건 Object는 새로 추가된 내용은 못받으므로 Object로 받으면 안되고
//		Sawon s = new Sawon(); //상속받은 클래스로 사용해야함
//		Object hong = new Sawon();
		
		List<Sawon> list = new ArrayList<Sawon>(); //LikedList, Vector를 사용하는 이유는 같은 메소드를 사용하게 때문에
		//데이터추가
		list.add(new Sawon(1,"홍길동", "개발부", "대리", 4500)); //0
		list.add(new Sawon(2,"박문수", "총무부", "과장", 5500)); //1
		list.add(new Sawon(3,"이순신", "기획부", "사원", 3500)); //2
		list.add(new Sawon(4,"강감찬", "자재부", "부장", 6500)); //3
		list.add(new Sawon(5,"심청이", "영업부", "부장", 6500)); //4
		
		//출력
		for (Sawon s:list) {
			System.out.println(s.getSabun()+ " "
							 +s.getName()+ " "
							 +s.getDept()+" "
							 +s.getJob()+" "
							 +s.getPay());
			
		}
		System.out.println("\n=======삭제 후=========\n");
		// 삭제 => remove 인덱스 번호 2번 삭제 ==> 중간중간 삭제시 속도가 느려짐
		// List => 데이터 첨부 => 데이터 읽기 => 데이터 갯수
		// 수정, 삭제 => 오라클
		list.remove(2);
		for (Sawon s:list) {
			System.out.println(s.getSabun()+ " "
							 +s.getName()+ " "
							 +s.getDept()+" "
							 +s.getJob()+" "
							 +s.getPay());
			
		}
		System.out.println("===========================");
		System.out.println("현재인원은 : "+list.size());
		System.out.println("===========================");
		
		//수정
		Sawon sa = new Sawon(6, "춘향이", "개발부", "사원", 3500);
		list.set(3, sa); //(인덱스번호, 번호에 들어갈 값)
		for (Sawon s:list) {
			System.out.println(s.getSabun()+ " "
							 +s.getName()+ " "
							 +s.getDept()+" "
							 +s.getJob()+" "
							 +s.getPay());
			
		}
		System.out.println("===========================");
		list.clear();
		System.out.println("현재인원은 : "+list.size());
		/*
				add, addAll, size, get, clear 정도가 웹에서 사용되는 메소드()
				
		 */
	}
}
