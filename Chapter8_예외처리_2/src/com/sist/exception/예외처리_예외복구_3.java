package com.sist.exception;
/*
 		문자열로 2개의 정수를 받아서 => 정수로 변환 후에 : NumberformatExcepion
 		배열로 저장 : ArrayIndexOutofBoundsException
 		나누기 한값을 구한다. : ArithmeticException
 */
import java.util.*;
public class 예외처리_예외복구_3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		String num1 = scan.next();
		
		System.out.print("두번째 정수 입력 : ");
		String num2 = scan.next();
		
		int[] arr = new int[2];
		// 다중 catch => 예상되는 에러가 많은 경우 주로 처리
		// 다중 catch절은 이중에 한개만 수행한다. => 다중 조건문하고 비슷
		try {
			int n1 = Integer.parseInt(num1); //문자열을 정수로 변환
			int n2 = Integer.parseInt(num2);
			// 배열에 대입
			arr[0] = n1;
			arr[1] = n2;
			
			System.out.println(arr[0]/arr[1]);
		}catch (NumberFormatException e) {
			System.out.println("정수 변환 에러 발생!");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 초과 에러 발생!");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("프로그램 종료"); //이문장 출력 => 정상 수행
	}
}
