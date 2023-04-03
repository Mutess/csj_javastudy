/*
 * 성적계산 프로그램 => Rank, 정렬
 * 3개의 정수를 받아서 평군을 구해서 => 등급을 출력
 * 다중 조건문 사용
 * 
 *  >= 90 
 *  >= 80
 *  >= 70
 *  >= 60
 *  --------------else <60
 *  
 *  Web 개발 / 호스팅 (AWS) => 운영체제와 고정IP를 빌려서 (PaaS)
 *  ---------------------------------------------------
 *  Java / Oracle / HTML / CSS / JavaScript
 *  --------------------------------------- Spring/MyBatis/JPA/
 *  Java : 데이터 관리							|
 *  Oracle : 데이터 저장 (공유)					|MyBatis/JPA/
 *  HTML/CSS : 브라우저에서 인식하는 언어			|Spring 
 *  JavaScript : 동적(클라이언트)				|==> ReactJS/ Ajax / VueJS
 */
import java.util.Scanner;
public class 다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // 키보드 입력값을 받아 메모리에 저장해주는 역할
		//정수 : nextLInt(), 실수 : nextDouble(), nextBoolean
		//next(). :  문자열 => char는 존재하지 않음
		//Scanner는 도스창에서만 사용
		System.out.print("3개의 정수를 입력하세요 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int avg = (kor + eng + math) / 3;
		
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균 : %.2f\n", (kor+eng+math)/3.0);
		
		//학점 계산

		char score = 'F'; //값이 변경이 없는 경우에 처리되는 값(default)
		if (avg >= 90) {
			score ='A';  //수행 후 조건이 맞으면 종료
		}
		else if (avg >= 80) {
			score ='B';  //수행 후 조건이 맞으면 종료
		}
		else if (avg >= 70) {
			score = 'C';  //수행 후 조건이 맞으면 종료
		}
		else if (avg >= 60) {
			score = 'D';//수행 후 조건이 맞으면 종료
		}
//		else
//			score = 'F';  생략이 가능
		
		System.out.println("학점 : "+ score);

	}

}
