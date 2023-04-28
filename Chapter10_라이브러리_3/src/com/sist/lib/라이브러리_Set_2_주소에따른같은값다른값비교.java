package com.sist.lib;
import java.util.*;

class Student {
	private String name;
	private int age;
	// 데이터보호 => 은닉화
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode();   //(name+age의 실제값)이 같을때 같은 해시코드를 부여함 //실제 주소값은 다음
	}
//	@Override
//	public boolean equals(Object obj) {  //주소값이 아닌 실제 값을 비교하게 해주는 오버라이딩 메소드()
//		// TODO Auto-generated method stub
//		if (obj instanceof Student) {
//			Student s = (Student)obj;
//			return name.equals(s.name) && age == s.age;
//		}
//		return false;
//	}
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name+"("+age+")";
//	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}
//new , clone
// = 
public class 라이브러리_Set_2_주소에따른같은값다른값비교 {

	public static void main(String[] args) {
		//객체 비교 => 메모리 주소, 실제 저장된 값
		// ------------기본 	-----------재정의(오버라이딩)
		Set set = new HashSet();
		Student s1 = new Student("홍길동", 25);
		Student s2 = new Student("홍길동", 25); //주소값은 다름 하지만 값은 같음
		if (s1.equals(s2)) {
			System.out.println("s1==s2");
		}
		else {
			System.out.println("s1!=s2");
		}
//		set.add(new Student("홍길동", 25));
//		set.add(new Student("홍길동", 25));
		System.out.println(set);
		System.out.println(s1);
		System.out.println(s2);
	}
}
