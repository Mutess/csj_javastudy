/*
 * 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.

	if (조건문)
		실행문장 ==> 조건이 true
		
	if (조건문)
		실행문장 ==> 조건이 false
		
	if (조건문)
		실행문장 ==> 조건이 true
	else ==> 조건 x
		실행문장 => false
 */
import java.util.Scanner;
public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 한개를 입력하세요 : ");
		int a = scan.nextInt();
		
		if (a >= 50) {
			System.out.println("50이상입니다.");
		} else {
			System.out.println("50미만입니다");
		}

	}

}
