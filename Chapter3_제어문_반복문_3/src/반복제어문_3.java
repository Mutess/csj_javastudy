/*
 * 3개의 정수를 받아서 총점과 평균을 내라
 */
import java.util.Scanner;
public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int kor, eng, math;
		// 0~100까지의 범위에 맞나 안맞나 
		while (true) {
			System.out.print("국어점수 입럭(0~100) : ");
			kor = scan.nextInt();
			if (kor < 0 || kor > 100) {
				System.out.println("잘못된 점수입니다.");
				continue;
			} 
			break;
			}
			while (true) {
				System.out.print("영어점수 입럭(0~100) : ");
				eng = scan.nextInt();
				if (eng < 0 || eng > 100) {
					System.out.println("잘못된 점수입니다.");
					continue;
				}
				break;
				}
			while (true) {
				System.out.print("수학점수 입럭(0~100) : ");
				math = scan.nextInt();
				if (math < 0 || math > 100) {
					System.out.println("잘못된 점수입니다.");
					continue; //잘못된 입력 처리
				}
				break; //종료시에 사용
			}
			int total = kor + eng + math;
			double avg = total/3.0;
			
			System.out.println("총점 : "+total );
			System.out.printf("평균 : %.2f\n", avg);
			

	}

}
