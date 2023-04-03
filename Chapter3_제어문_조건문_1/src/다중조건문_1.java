/*
 * if (조건문) {
 * 	조건문이 true인 상태에서만 수행되는 문장 (단일)
 * }
 * 다증 조건문
 * if (조건문)
 * 	문장수행
 * 	   | false
 * else if (조건문)
 * 	문장수행
 * 	   | false
 * else ==> 맞는 조건이 없을때 사용 (생략가능)
 * ---------------------------------------
 * 
 * 다중 조건문 : 조건이 맞는 문장을 수행하고 종료 (한개의 문장만 수행)
 * 		=> 여러개를 수행 : 단일 조건문을 사용해야 된다.
 * 예) 1~100까지 숫자중 3의 배수, 5의 배수, 7의 배수의 합을 출력
 * 			   ----------------------------- 단일조건문(중복 수행시) 3개 사용
 * 
 * 다중 조건문 형식)
 * 				if (조건문) { 
 * 					true 일때 수행하는 문장 작성 ==> 종료
 * 						false (다음 조건문으로 넘어감)
 * 				}
 * 				else if (조건문){
 * * 					true 일때 수행하는 문장 작성 ==> 종료
 * 						false (다음 조건문으로 넘어감)
 * 				}
 * 				else if (조건문) {
 * * 					true 일때 수행하는 문장 작성 ==> 종료
 * 						false (다음 조건문으로 넘어감)
 * 				}
 * 				else ==> 생략이 가능 {
 * 						해당 조건문이 없는 경우 처리되는 문장
 * 				}
 * 
 * 				사칙연산시 (+, -, *, /) ==> 일때 % 이걸 누른다면 else에서 처리할 수 있음
 * ----------------------------------------------------------------------------
 * 단일 if문에서 
 *  if
 *  if
 *  ---------------
 *  if
 *  else 이 둘이 짝이라서 위에 있는 if문이 실행되도 else문이 실행됨
 */
// 사칙연산 처리
import java.util.Scanner;
public class 다중조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		System.out.print("연산자 입력(+,-,*,/) : ");
		char op = scan.next().charAt(0); // 문자열중에 첫번째에 있는 문자를 추출
		// +-*/   ==> charAt(1)이면 첫번째 자리의 문자를 가져옴 => 자바의 단점 : char는 받을 수 없다 (문자열은 받을 수 있음)
			 // +, - , * , / , 다른 문자 입력시 (else)
		if (op == '+') {
			System.out.printf("%d+%d=%d", num1, num2, num1+num2);
		}
		else if (op == '-') {
			System.out.printf("%d-%d=%d", num1, num2, num1-num2);
		}
		else if (op == '*') {
			System.out.printf("%d*%d=%d", num1, num2, num1*num2);
		}
		else if (op == '/') {
			if (num2 == 0) 
				System.out.println("0으로 나눌 수 없습니다.");
			else
				System.out.printf("%d/%d=%.2f\n", num1, num2, num1/(double)num2);
		}
		else {
			System.out.println("잘못된 연산자입니다.");
		}
		

	}

}
