package com.sist.main5;
import java.util.*;

//객체지향 = > 묶는 것이다.
/*
 *    1. 관련된 데이터를 묶는다.
 *    	 배열 / 클래스
 *    2. 관련된 명령문을 묶는다. 
 *    	 메소드
 *    3. 관련된 클래스를 묶는다. 
 *    	 상속(extends) / 인터페이스*** (implement)
 *    	 => 하위클래스에서 기능을 추가하면 => 접근할 수 없다.
 *    ----------------------- 객체
 *    4. 상속
 *    	 접근지정어
 *    	 	=> default, protected, public
 *    		=> private : 상속은 된다. => 접근이 불가능
 *    		   금고 => 상속을 받음 (키번호가 없음) 이러면 사용 불가 ==> 이래서 나온것이 protected
 *     	---------
 *    	 제어어 
 *    		=> 변수 : 접근지정어 , static , final
 *    		=> 메소드 : 접근지정어 , static , final , abstract
 *    		-----------------------
 *    		=> 생성자 : 접근지정어만 사용한다.
 *    	-------------------------------
 */
public class MainClass {

	public static void main(String[] args) {
/*		Human h = new Human();
		h.print();
		
		h = new Member();
		h.print();
		
		h = new Sawon();
		h.print();*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("선택(Human(1), Member(2), Sawon(3)) :");
		//상위클래스 하나로 하위클래스를 제어가능
		int select = scan.nextInt();
/*		if (select == 1) {
			Human h = new Human();
			h.print();
			h.aaa();
			h.bbb();
		}
		else if (select == 2) {
			Member h = new Member();
			h.print();
			h.aaa();
			h.bbb();
		}
		else if (select == 3) {
			Sawon h = new Sawon();
			h.print();
			h.aaa();
			h.bbb();
		}*/
		
		Human h = null;  //접근 가능한 값이 print , aaa, bbb임 여기서 추가하면 오류가 발생 //null값을 주고 1번을 누르면 
		if (select == 1) {
			h = new Human();
		}
		else if (select == 2) {
			h = new Member(); //new가 되면 전에 있던 값이 Member값으로 덮어써짐
		}
		else if (select == 3) {
			h = new Sawon();
		}
		
		h.print();
		h.aaa();
		h.bbb();
	}

}
