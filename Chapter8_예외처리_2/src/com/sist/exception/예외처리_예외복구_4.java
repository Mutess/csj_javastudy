package com.sist.exception;
/*
 		배열에 데이터를 저장 => 배열범위 초과
 		나누기를 처리 => 0
 		기타 예외처리 => 통합
 		-------------------------- RuntimeException : 실행시에 나타나는 모든 에러를 잡아줌
 		
 	**  가장 큰 예외처리는 마지막에 사용한다.
 */
public class 예외처리_예외복구_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] arr = new int[2];
			arr[0] = 10;
			arr[1] = 2;
			System.out.println(arr[0]/arr[1]);  // 여기는 무조건 정상수행 문장을 작성
		}catch (ArithmeticException e) { 
			System.out.println("0으로 나눌 수 없습니다.");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 초과");
			
		}catch (RuntimeException e) { 			// 계층구조에서 얘가 제일 상위계층이라서 ArrayIndexOutOfBoundsException나 ArithmeticException이거를 잡아드릴 수 있고 
			System.out.println("예측못한 에러");    // 찾는 순서가 위에서부터 내려오는 거라 제일 상위계층을 밑으로 내리면 예상못한 에러도 잡을 수 있음			
		}
		System.out.println("프로그램 종료");
	}

}
