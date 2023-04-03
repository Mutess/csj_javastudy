/*
 *   3개의 정수를 입력받아서 총점 / 평균 / 학점을 출력
 */
import java.util.Scanner;




public class 단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor, eng, math;
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		//결과값 출력
		int total = kor + eng + math;
		double avg = total / 3.0;
		//학점
		int temp = (int)avg;
		char score = 'A'; //독립적인 문장 => 모든 if을 수행한다. 그래서 속도가 느림
		
		if(temp >= 90 && temp <= 100) //각 점수의 범위를 조절할 때 &&문으로 점수의 범위를 조절
			score = 'A';
		if(temp >= 80 && temp < 90)
			score = 'B';
		if(temp >= 70 && temp < 80)
			score = 'C';
		if(temp >= 60 && temp < 70)
			score = 'D';
		if (temp < 60)
			score ='F';
		
		System.out.println("국어점수 : "+ kor);
		System.out.println("영어점수 : "+ eng);
		System.out.println("수학점수 : "+ math);
		System.out.println("총점 : "+ total);
		System.out.printf("평균 :%.2f\n" , avg);
		System.out.println("학점 : " + score);

	}

}
