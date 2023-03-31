/*
 *  정수 한 개를 입력받아서, 그 수가 3의 배수인지 판단해보자.
 */
import java.util.Scanner;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 한개를 입력하세요 : ");
		int a = scan.nextInt();
		
		if (a % 3 == 0) {
			System.out.println(a +"은 3의 배수입니다");
		} else {
			System.out.println(a +"은 3의 배수가 아닙니다.");
		}
		

	}

}
