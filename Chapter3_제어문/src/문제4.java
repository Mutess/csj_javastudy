/*
 * 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.

 */
import java.util.Scanner;
public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int max = 0, min = 0, total;
		double avg;
		
		total = a + b + c;
		avg = total/3.0;
		
		
		System.out.println("합계는 " + total);
		System.out.printf("평균은 %.2f\n" , avg);
		
		
		max = a;
			if (max < b) {
				max = b;
			}
			if (max < c) {
				max = c;
			}
			
		min = a;
			if (min > b) {
				min = b;
			}
			if (min > c) {
				min = c;
			} // 최대값 최소값 구하는 방법
			
			System.out.println("최대값은" + max);
			System.out.println("최소값은"+ min);
		
		

	}

}
