package com.sist.main;

/*
 *   초기화
 *   1. 디폴트 값
 *   	멤버변수에 대한 초기값
 *   	int => 0, String => null, boolean => false...
 *   	class A
 *   	{
 *   		int a;
 *   	}
 *   2. 명시적 초기화
 *   	직접 값을 설정
 *   	class A{
 *      	int a = 10;
 *      }
 *   3. 생성자 초기화
 *   	class A {
 *   		int a;
 *   		A() {
 *   			a = 100;
 *   		}
 *   	}
 *   4. 초기화 블록{}
 *   	class A {
 *   		//int a;
 *   		//a = 1000; 이건 100000프로 오류남
 *   		int a;
 *   		{
 *   			a = 1000; //이렇게 써야함
 *   		}
 *   	}
 *   
 *   	디폴트 => 명시적 => 	초기블록 => 		생성자           //명시적 초기화를 하면서 초기블록이나 생성자에서 값을 줌
 *   int a = 0  int a = 10  int a = 100;	int a = 1000;  //이렇게는 절대 사용안함
 */
/*class Student {
	int hakbun = 10;
	String name;
	{
		hakbun = 100; // 연산처리, 제어문, 파일 읽기
	}
	Student() {
		hakbun = 10000;
	}
} */
class Student {
	int hakbun;
	String name;
	Student() {  //여기에 생성자가 없으면 메인에 자동으로 생성자가 생기지만 생성자가 하나라도 있으면 생성자가 없는 상태이기에 생성자를 만들어줘야함
		System.out.println("Student() Call...");
		hakbun = 1;
		name = "홍길동";
	}
	//다르게 초기값을 주는 방법 (매개변수를 줘서 초기값을 다르게 함)
	Student(int h, String n) { //이것도 생성자 
		hakbun = h;
		name = n;
	}
}


public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s= new Student(); //생성자 호출 시에는 반드시 앞에 new로 메모리 주소를 주고 호출
		System.out.println(s.hakbun);
		System.out.println(s.name);
		
		Student s1= new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		//생성자 호출 시에는 반드시 앞에 new로 메모리 주소를 주고 호출
		//new Student();// 이렇게도 가능
		
		//초기값을 다르게 하려면 호출할때 new Student(매개변수 값입력)
		Student s2 = new Student(2, "심청이");
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		Student s3 = new Student(3, "박문수");
		System.out.println(s3.hakbun);
		System.out.println(s3.name);
	}

}
