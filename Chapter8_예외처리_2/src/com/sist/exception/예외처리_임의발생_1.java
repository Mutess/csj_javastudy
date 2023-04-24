package com.sist.exception;
/*
		임의발생 : 테스트 목적
		----------------- 프로그램 배포전 (배포 : 상용화)
		형식)
			throw new 예외처리생성자()
 */
public class 예외처리_임의발생_1 {

	public static void main(String[] args) /*  throws Exception 이것의 단점은 복구가 안됨 */{
//		try {
//			
//		}catch (InterruptedException/*여기엔 밑에 3개가 다 올수도 있지만 예외처리만 하려면 Exception*/ e) {}
//		//InterruptedException < Exception(예외처리) < Throwable(오류처리) 
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			int a = 10;
			if (a % 2 == 0) {
				System.out.println("임의로 예외발생!!");
				throw new NumberFormatException(" : 정수 변환 안됨");
				// ==>throw 문장 밑에는 소스코딩을 하면 안됨 바로 catch로 이동 => 소스코딩을 할 수 없다.
				// ==> throw : 사용자 정의 예외처리
				// getMessage변경 => 생성자 매개변수 이용
				/*
				 		class NumberFormatException extends Exception {
				 			private String message="For input string: "  10";
				 			public NumberFormatException (String message)
				 			{
				 				this.message = message;
				 			}
				 			getter/setter
				 		}
				 */
				//Integer.parseInt(" 10");
			}
		}catch (ClassCastException e) {
			System.out.println(e.getMessage());  //getMessage : 생성자 안에 값이 들어가는 것
			// 에러 확인 ==> 에러부분을 수정
		}catch (NumberFormatException e) {
			System.out.println("NumberFormatException"+e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
