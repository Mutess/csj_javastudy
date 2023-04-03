/*
 * 한개의 정수를 입력받아서 절대값을 출력
 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요 : ");
		int i = scan.nextInt();
		
		if (i < 0) {
			
			System.out.println(-i);
		}
		else {
			System.out.println(i);
		}
		//System.out.println(Math.abs(i)); //라이브러리

	}

}
