package com.sist.map;
/*
		
 */
import java.util.*;

class A {
	public void execute() {
		System.out.println("A : execute() Call...");
	}
}
class B {
	public void execute() {
		System.out.println("B : execute() Call...");
	}
}
class C {
	public void execute() {
		System.out.println("C : execute() Call...");
	}
} 
//Spring방식 => 클래스 관리자 (게임)
class Container {  //모든 클래스를 묶어줌
	Map map = new HashMap<>();
	//이러한 방식이 싱글턴 ==> 메모리 누수현상을 방지 (한개의 객체로 재사용을 하는 프로그)
	// Map => 클래스 관리시에 주로 사용된다.
	public Container () {
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	public Object getBean (String key) {
		return map.get(key);
	}
}
public class 라이브러리_Map_2 {

	public static void main(String[] args) {
		Container c = new Container(); //c라는 한개의 주소 생성
		A aa = (A)c.getBean("a"); //c라는 주소값을 집어넣음  // getBean은 map.put("a", new A());에서 키값의 클래스A를 
		aa.execute();
		A bb = (A)c.getBean("a"); //한개의 주소를 리턴하는 것
		bb.execute();
	}
}
