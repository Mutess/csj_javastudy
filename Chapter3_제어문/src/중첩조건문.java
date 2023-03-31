/*
 * 중첩 조건문 
 * => 3개의 정수를 받아서 총점/평균/학점(A+, A0, A-)
 * 97 이상이면 A+ 94 이상일때 A0 그 밑에는 A-
 */
import java.util.Scanner;

public class 중첩조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor = 0, eng = 0, math = 0, total = 0;
		double avg = 0.0;
		char score = 'F', option = '-'; // option에서 if문에 두개의 조건에 둘다 만족하지 않으면 기본값을 수행
		// 사용자의 입력값을 받음
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 점수를 입력하세요 : "); // 90 90 90
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		int temp = (int)avg;
		if (temp>=90 && temp<=100) {
			score = 'A';
			if (temp >= 97 && temp <= 100)
				option = '+';
			if (temp>=94 && temp < 97)
				option = '0'; //중첩 if문
			
		}
		if (temp>=80 && temp< 90) {
			score = 'B';
			if (temp >= 87 && temp < 90)
				option = '+'; 
		}
		if (temp>=70 && temp < 80) {
			score = 'C';
		}
		if (temp>=60 && temp< 70) {
			score = 'D';
		}
		if (temp < 60) {
			score = 'F';
			option = ' ';
		}
		
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ math);
		System.out.println("총점 : "+ total);
		System.out.printf("평균 :%.2f\n", avg);
		System.out.println("학점 : " + score + option);
		

	}

}
