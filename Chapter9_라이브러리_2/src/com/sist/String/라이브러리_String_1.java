package com.sist.String;
/*
		305apge
		 = string : 문자열을 조작하고 처리하는 기능
		 			----------
		 			= String은 클래스, 일반 데이터형으로 취급
		 				=> 모든 클래스는 Call By Reference , String은 Call By Value
		 				A a = new A()
		 				A b = a;==> 같은 주소를 제어
		 				String s = "Hello";
		 				String s1 = s; ==> s1을 변경하면 s는 변경사항이 없다.
		 			= 메모리 할당 (저장)
		 				= String s = "Hello";
		 				= String s = new String("Hello");
		 				*** 문자열은 주소 (자체가 주소다.)
		 					=> 같은 문자열이면 같은 주소에 저장
		 					=> new를 이용해서 생성이 되면 다른 주소에 저장
 */
public class 라이브러리_String_1 {
	
	public static void main(String[] args) {
		String s1 = "Hello"; //일반 데이터형처럼 주로 사용한다.
		String s2 = "Hello";
		//같은 메모리 주소에 저장
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		//새로운 메모리에 할당(저장)
		//String => 저장은 주소를 저장하고 있다.
		//char[] => 쉽게 사용이 가능하게 만들어 준다.
 		
		if (s1 == s2) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 다르다");
		}
		
		if (s1 == s3) { //같은 곳에 저장이 되어 있는지 확인 (메모리 주소)
		//new를 사용하면 다른 주소를 가지고 있다.
			System.out.println("s1과 s3는 같다");
		}
		else {
			System.out.println("s1과 s3는 다르다");
		}
		
		//실제 => 저장된 데이터값이 같지 확인한다. : equals
		//s1에 저장된 값과 s3에 있는 값이 같은 확인
		if (s1.equals(s3)) {
			System.out.println("s1과 s3는 같다.");
		}
		else {
			System.out.println("s1과 s3는 다르다.");
		}
		
		//308page => 문자열 결합 (+)
		String ss = "Hello ";
		String ss1 = "Java!";
		String ss2 = ss+ss1;
		System.out.println(ss2); //이건 ss와 ss1을 결합하여 새로운 메모리에 값을 저장하는데 그렇게 히면 속도가 상당히 느려진다. 
		//그래서 문자열이 많은 경우에는 StringBuffer를 사용하여 속도를 높힌다.
	}
}
