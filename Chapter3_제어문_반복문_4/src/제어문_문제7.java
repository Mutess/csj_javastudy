/*
 * 정수을 입력 받아 60이상 합격 불합격
 */
import java.util.Scanner;
public class 제어문_문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int score = scan.nextInt();
		if (score >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		

	}

}
