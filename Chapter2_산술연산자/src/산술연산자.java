/* 
 *  --------------------------------------------
 * 	1. 변수, 2. 연산사, 3. 제어문, 4. 메소드, 5, 클래스
 *  --------------------------------------------
 *  		필수 (문법)
 *  ------------------------- 메소드(연산자 + 제어문)
 * 	이항연산자
 *  => 피연산자가 2개
 *  --------------
 *  1) 산술연산자 ** (+ , - , * , / ,  %)
 *  2) 쉬프트연산자 (비트이동연산자) ( <<, >> )
 *  3) 비트연산자 (&, |, ^)
 *  4) 비교연산자 ** (==, !=, < , > , <= , >= )
 *  5) 논리연산자 ** (&&(직렬, and) , ||(병렬, or)) : 효율적인 연산
 *     && => true
 *     (조건) && (조건) => 앞에서 false일때 뒤에 조건은 연산하지않음 (효율적이게)
 *     
 *     || => true
 *     (조건) || (조건) => 앞에가 true일때 뒤에 조건을 실행하지 않음
 *  6) 대입연산자 ** (= , +=, -= , op(+ , - , * , / ,  %)=)
 *  
 *  38page
 *  
 *  +, -, * => 형변환 *** 자바에서 모든 연산은 같은 데이터형끼리만 연산이 된다.
 *  		   ----
 *  	 	   int + double 일떄
 *  		   ---- double 로 바꾸면
 *  		   double + double  => double
 *  		   그래서 10 + 20.5이면 
 *  		   10.0+20.5 => 30.5
 *  		   지동으로 큰 데이터형으로 변경후 연산을 한다.
 *  		   'A' + 10 (char + int)
 *  		   ---65+10 => 75
 *  		   char는 모든 연산자를 이용해서 연산처리하면 => 자동으로 int로 변경
 *  		   'A' < 60 이면 
 *  		    A = 65
 *  			*** int이하(byte, bit, char) 데이터형 연산시에 결과값은 int다
 *  			int + long => long
 *  			int + double => double
 *  			char + long => long
 *  			-------------------
 *  			byte + int => int
 *  			char + char => int
 *  			------------------
 *  			byte + byte => int
 *  
 *  	/ : 정수 / 정수 = 무조건 정수
 *  		5 / 2 = 2이라고 나옴
 *  		10 / 3 = 3
 *  		=> 평균 : 정수 / 실수
 *  		0으로 나누면 에러 발생
 *  		프로그램의 기본(코테)
 *  		----------------
 *  		1) 오류처리 
 *  		예) 문자열을 입력받아서 좌우대칭
 *  			-------------------- 먼저 문자열이 짝수가 맞는지 확인
 *  		
 *  		% : 결과값이 왼쪽부호가 남는다
 *  		5 % 2 = 1
 *  		-5 % 2 = -1
 *  		5 % -2 = 1
 *  		-5 % -2 = -1
 *  		--------------
 *  
 *   
 *  			
 */
// 사용자가 정수 3개를 입력 => 결과값 (1.총점, 2.평균)
import java.util.Scanner;
// 키보드로부터 입력된 값을 얻어오는 클래스 : Scanner (scanf())
// BufferedReader => 예외처리를 해줘야 해서 아직은 공부안함
public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); //클래스 선언
		//			   --- 동적 메모리 할당
		//						   --------- 키보드 입력값
		System.out.print("국어점수 입력 : ");
		int kor = scan.nextInt(); //입력된 정수 저장
		//System.out.println("kor="+kor);
		
		System.out.print("영어점수 입력 : ");
		int eng = scan.nextInt();
		//System.out.println("eng="+eng);
		
		System.out.print("수학점수 입력 : ");
		int math = scan.nextInt();
		//System.out.println("math="+math);   // ***** 같은 것끼리 묶지 말고 무조건 따로따로 하나씩 입력받는게 좋음 ex) 국어 따로 영어 따로 수학따로
		
		int total = kor + eng + math; //총점 = int
		double avg = total / 3.0;				//평균 = double 소수점 때문에 그래서 나눠지는 숫자도 소숫점**으로 작성
		
		System.out.println("총점= " + total);
		//System.out.println("평균= " + avg);
		System.out.printf("평균=%.2f", avg); // 형식을 출력하기 위해 printf사용  +가 아닌 ,로 그리고 %.2f로 출력 소수점 이하 2자리만 출력
		
//		System.out.print("국어점수 입력= ");
//		System.out.print("국어점수 입력= ");
//		int kor = scan.nextInt();
//		int math = scan.nextInt();
//		System.out.println("kor="+kor);
//		System.out.println("math="+math); // 한번에 입력


	}

}
