/*
 * 한개의 정수를 입력받아서 3의 배수인지 판별
 */
import java.util.Scanner;;
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("한개의 정수를 입력하세요 : ");
		int i = scan.nextInt();
		
		if (i % 3 == 0) {
			System.out.println(i+"는(은) 3의 배수입니다.");
		}
		else {
			System.out.println(i+"는(은) 3의 배수가 아닙니다.");
		}

	}

}
