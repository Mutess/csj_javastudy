package com.sist.lib;
import java.util.*;
class Person implements Cloneable{
	//복제
	private String name;
	private int age;
	
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
	//Object의 메소드를 오버라이딩시킴 => 주소값을 접근하게 되어있지만 => 값을 가져오게 설정
	public String toString() {
		return name+"("+age+")";
	}
	
	//복제 => 새로운 메모리를 만들어서 사용
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	// 매개변수 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class 라이브러리_Set_1_복제 {

	public static void main(String[] args) throws Exception {
		Set set = new HashSet();
		Person p1 = new Person("홍길동", 25);
		Person p2 = new Person("홍길동", 25); //새로운 메모리에 저장(새로운 주소)
		System.out.println("p1="+p1);
		System.out.println("p2="+p2); //주소값이 다르니까 다른 객체임
		
		Person p3 = p1;  // 저장이 안됨
//		System.out.println("p3="+p3);
		Person p4 = (Person)p1.clone();  //저장이 됨(새로운 메모리)//clone의 리턴형이 Object라 형변환을 시켜줘함
//		System.out.println("p4="+p4);
		System.out.println(p4.getName());
		System.out.println(p4.getAge());  //나중에 초기값을 넣을때 set으로 다른 값을 넣으면 됨
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
	}
}
