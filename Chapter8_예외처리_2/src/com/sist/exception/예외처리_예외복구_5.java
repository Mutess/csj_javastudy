package com.sist.exception;
/*
 	finally => 생략이 가능
 	finally => try, catch를 수행하던지 말건지 상관없이 무조건 수행해야하는 문장
 	파일 닫기, 오라클 연결 해제, 서버 연결 해제, 네트워크 연결 해제
 	
 	try {
 		정상수행이 가능
 		=> 에러 (예상하지 못한 에러가 발생할 수 있다.)
 			프로그래머의 실수, 사용자의 입력값 오류...
 	}catch (예상되는 예외클래스(Exception) ) {
 		에러가 발생시에 처리
 		= 에러를 확인
 		= 복구를 할 수 있다. => 오류 메세지 전송도 가능
 	}
 	finally { ==> 생략이 가능 // 파일이나 서버연결 해제할때는 무조건 사용
 		무조건 수행하는 문장을 코딩
 		파일 닫기, 오라클 연결 해제, 서버 연결 해제 => 오라클 연결, 네트워크 연결
 	}
 	
 	실행 순서
 	-------
 	문장 1
 	문장 2
 	try {
 		문장3
 		문장4  ==> 에러발생
 		문장5
 	
 	}catch (1. 예외처리 클래스) 
 	{
 		문장6
 	}
 
 	catch (2. 예외처리 클래스) 
 	{
 		문장7
 	}
 
 	catch (3. 예외처리 클래스) 
 	{
 		문장8
 	}
 	finally
 	{
 		문장9
 	}
 	문장 10
 	문장 11
 	
 	=> 1. try가 정상 수행
 	문장 1 -> 2 -> 3-> -> 4 -> 5 -> 9 -> 10 -> 11
 	
 	=> 2.try(문장4에서)가 에러
 	문장 1 -> 2 -> 3-> -> (catch(1) 이동) 6 -> 9 -> 10 -> 11
 	
 	=> 3.try(문장4에서)가 에러
 	문장 1 -> 2 -> 3-> -> (catch(2) 이동) 7 -> 9 -> 10 -> 11
 	
 	=> 4.try(문장4에서)가 에러
 	문장 1 -> 2 -> 3-> -> (catch(3) 이동) 8 -> 9 -> 10 -> 11
 	=> 목적 : 에러시에 에러발생 문장을 제외하고 다음 문장을 수행하기 위함 
 	
 	
 	=> 멀티 예외처리
 	
 */
public class 예외처리_예외복구_5 {

	public static void main(String[] args) {
		try {
			int[] arr = new int[2];
			arr[0] = 10;
			arr[1] = 0;
			System.out.println(arr[0]/arr[1]);
			//멀티예외처리(멀티블록)
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {  
			System.out.println("에러발생");
		}
		System.out.println("프로그램 종료");
	
	}
}
