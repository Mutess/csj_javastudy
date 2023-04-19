package com.sist.main4;

public class Mainclass {
	public static void main(String[] args) {
		Human man = new Human();
		man.setData("심청이");
		System.out.println(man.getData());
		Student s = new Student();  
		s.setData("박문수");
		System.out.println(s.getData());
		
		System.out.println(man.getData()); //static이라서 메모리 공간이 하나인데 man은 값이 심청이였지만 같은 공간을 쓰고 있는 s가 값을 박문수로 주면 하나의 메모리 공간에 박문수로 데이터가 바뀌어버림 
	}
}
