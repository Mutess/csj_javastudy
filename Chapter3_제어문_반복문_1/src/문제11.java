/*
 * 한개의 정수를 입력받아 1부터 입력받은 정수까지의 합을 구해라
 */
import java.util.Scanner;
public class 문제11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = scan.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
			
		}
		System.out.println("1~10까지의 합 : "+ sum);
		System.out.println("1~"+a+"까지의 합 : "+sum);
	}
	
	

}
