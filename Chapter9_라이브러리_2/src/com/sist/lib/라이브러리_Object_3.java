package com.sist.lib;
/*
		toString : 객체를 문자열화 시킨다.
		
		(String)
		.toString // 둘다 문자열변환
		------------------------
		class A {
		
		}
		A a = new A();
		1) 명시적 => system.out.println(a.toString()) => a의 주소값 출력
		2) 묵시적 => system.out.println(a)
 */
class Member {
	private int mno;
	private String name;
	
	public Member (int m, String n) {
		mno = m;
		name = n;
		// this.을 생략할 수 있다.
		// 지역변수나 매개변수를 찾는다. ==> 없는 경우에만 멤버변수를 찾는다.
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "회원번호 : "+mno+ ", 이름 : "+name; //원래는 주소값이 호출되지만 다른 값으로 변경이 가능
	}
}
//객체를 문자열로 변환
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member (1, "박문수");
		Member m2 = new Member (2, "심청이");
		
		// 오버라이딩 하지 않으면 메모리 주소값을 출력함
		// 오버라이딩을 하면 Member가 가지고 있는 값을 출력
		System.out.println("묵시적 호출 m1 : "+ m1);
		System.out.println("명시적 호출 m1 : "+ m1.toString());
		System.out.println("묵시적 호출 m1 : "+ m2);
		System.out.println("명시적 호출 m1 : "+ m2.toString());
		
	}

}
