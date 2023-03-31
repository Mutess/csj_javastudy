/*
 * 54 page
 * 단일 조건문
 * 1. 형식
 * if(조건문) {
 *   수행문 => 조건이 true일 경우에만 수행이 가능
 * }
 * => {}이 없는 경우에는 한개의 문장만 수행이 가능
 * => 여러개를 동시에 제어시에는 반드시 {}을 사용해서 사용
 * 
 * 2. if 중첩 조건문
 * if (조건) { ============> 이걸 이렇게 하면 한문장으로 할 수 있음 if(조건 && 조건)
 *   if{
 *   
 *   }
 * }
 */
// 계산기 만들기 (사칙연산) ==> 
// 1. 정수 두개 2. 연산자
import java.util.Scanner;
public class 조건문_계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println("연산자를 입력(+,-,*,/) : ");
		char op = scan.next().charAt(0); //문자열을 받아서 char를 한개 가지고 온다.
		
		System.out.println("num1= "+ num1);
		System.out.println("num2= "+ num2);
		System.out.println("op= "+ op);
		
		if (op == '+') {
			System.out.printf("%d+%d=%d", num1, num2, num1+num2);
		}
		if (op == '-' ) {
			System.out.printf("%d-%d=%d", num1, num2, num1-num2);
		}
		if (op == '*') {
			System.out.printf("%d*%d=%d", num1, num2, num1*num2);
		}
		if (op == '/') {
			if (num2 == 0) 
				System.out.println("0으로 나눌수 없습니다.");
			if(num2 != 0)
				System.out.printf("%d/%d=%d", num1,num2, num1/num2);
			
		}

	}

}
