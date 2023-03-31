/*
 * 정수 3개를 입력받아서 총점과 평균을 구하고 학점을 구하는 프로그램
        작성 ( 90이상이면 A,80이상이면 B, 70이상이면 C,60이상이면 D, 
        나머지는 F)

 */
import java.util.Scanner;
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int total;
		total = a + b + c;
		double avg;
		avg = total /3.0;
		
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n" , avg);
		
		int temp = (int)avg;
		
		if (temp >= 90 && temp <= 100) {
			System.out.println('A');
		}
		else if (temp >= 80 && temp <= 90) {
			System.out.println('B');
		}
		else if (temp >= 70 && temp <= 80) {
			System.out.println('C');
		}
		else if (temp >= 60 && temp <= 70) {
			System.out.println('D');
		}
		else {
			System.out.println('F');
		}
		

	}

}
