package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

/*
		용어 : 예외 떠맡기기, 예외 회피...
		=> 메소드를 읽을때 => JVM에 이런 예외가 발생할 수 있다. (알려만 주는 것) => 예외선언
		=> 메소드를 호출시에 반드시 => 직접처리, 선언처리
		=> RuntimeException에 있는 클래스들은 생략이 가능 (예외처리를 안해도 된다.)
		
		 
		 상위 클래스를 이용해서 전체를 처리가 가능하다.
		 	Throwable (Exception / Error)
		 		|
		---------------------------------
		|								|
	  Error							Exception
	  (X)								|
	  						Check				Uncheck
	  						----------------------------
	  						|						|
	  				   IOException			RuntimeException
	  				   SQLException					|
	  				   						NumberFormatException, Arr..
	  				   ..
	  				   ..
	  			void method() throws RuntimeException
	  			***void method() throws Exception
	  			void method() throws NumberFormatException, ClassCastException..
	  			***void method() throws IOException
	  			***void method() throws SQLException, NumberFormatException
	  			
	  			***이 표시들은 무조건 예외처리를 해줘야하는 것들임
	  			
	  			내가 유지보수하는 입장이면 throws를 붙혀서 예외처리를 하면 되고 
	  			내가 처음부터 새로 짜는 거면 try-catch를 사용하는 게 맞음
	  			
 */		
public class 예외처리_예외회피_1 {
	public static void methods() throws Exception {
		//예외처리 대상
	}
	public static void method1() throws Exception {
		//methods(); 예외처리 대상코딩인데 그냥 쓰면 오류남
		methods();  //위에 throws Exception으로 떠넘기고 들어가도 되고(간접처리(JVM이 처리))
	}
	
	public static void method2() {
		try {
			methods();
		}catch (Exception/*여기에는 위에 throws (예외처리문장)보단 작은 계층의 클래스가 들어가면 오류가 남 ex)NumberFormatException 같은것*/ ex) {
			
		}
	}
	public static void method3() throws IOException, SQLException, ClassNotFoundException {
		
	}
	
	public static void method4() throws IOException, SQLException, ClassNotFoundException {
		method3();
	}
	public static void method5() throws Exception {
		method3();
	}
	public static void method6() throws Throwable {
		method3();
	}
 	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
