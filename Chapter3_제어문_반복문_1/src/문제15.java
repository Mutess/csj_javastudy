/*
 * 입력한 숫자가 10의 자리와 1의 자리의 정수가 같은 것을 출력
 * 
 * 프로그램 짤때 오류처리를 먼저!
 */
import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리의 수 입력(10~99) : ");
		int a = scan.nextInt();
		System.out.println(a);
		
		if (a >= 10 && a<= 99) {
			
		
			if (a % 11 == 0) {
				System.out.println("10자리와 1의 자리가 같습니다");
			}
			else {
				System.out.println("10자리와 1의 자리가 같지 않습니다");
			}
		
		
		}
		else {
			System.out.println("잘못된 입력입니다.");
		}
	}

}
