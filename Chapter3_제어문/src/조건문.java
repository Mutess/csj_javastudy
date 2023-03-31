/*
 *   자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복제어
 *   => 변수, 연산자, 제어문
 *   	 | --------------메소드
 *     여러개
 *     
 *     *****) 자바에서 지원하는 모든 제어문은 밑에 있는 명령문만 제어 할 수 있다.
 *     ex) if(조건) 
 *     		문장 1 => 제어
 *     		문장 2 => if문과 관련이 없는 문장
 *     
 *     => 한개 이상의 명령문을 수행 할때에는
 *     	   if(조건) {
 *     	   	  문장 1
 *     		  문장 2
 *         }
 *         
 *     
 *     => 조건문
 *     	= 단일 조건문
 *     	  if (조건 => 부정연산자 (!), 비교연산자, 논리연산자) => true / false
 *     	  {
 *     	  	조건이 true** 일 경우에만 수행하는 문장을 작성
 *        }
 *     	= 선택 조건문
 *      = 다중 조건문
 *     => 선택문
 *      
 *     => 반복문
 *      = while
 *      = do~while
 *      = for
 *        = 일반 for
 *        = 향상된 for => for-each (웹에서 핵심)
 *     => 반복제어문
 *      = break;
 *      = continue
 *    ==================응용 (연산자) => 54page
 *    
 *    자바 순서도 (순차실행 평문)
 *    start
 *    	|
 *    문장 (명령문)
 *    	|
 *    문장 (명령문)
 *    	|
 *    문장 (명령문)
 *    	|
 *     end
 *     
 *     main{ =>
 *     
 *     } => end
 *     
 *     자바 순서도 (조건문)
 *    start
 *    	|
 *    문장 (명령문)
 *    	|
 *     조건 (if)
 *    	|
 *    문장 (명령문)
 *    	|
 *     end
 */
//조건문 (단일 조건문) => 짝수 / 홀수
import java.util.Scanner;
public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num % 2 == 0)  //짝수조건
			System.out.println(num+"는(은) 짝수입니다.");
			System.out.println("num"+num);//  대괄호를 열지 않으면 무조건 수행하는 문장 (if하고는 관련이 없는 문장)
		
		if(num % 2 != 0)  //홀수조건
			System.out.println(num+"는(은) 홀수입니다.");
			System.out.println("프로그램 종료"); // 대괄호를 열지 않으면 무조건 수행하는 문장 (if하고는 관련이 없는 문장) // 제어문이 시작할때는 ;을 찍으면 안됨
		
		if(num % 2 == 0) {  //짝수조건
			System.out.println(num+"는(은) 짝수입니다.");
			System.out.println("num"+num);
		}
		if(num % 2 != 0) { //홀수조건
			System.out.println(num+"는(은) 홀수입니다.");
			System.out.println("프로그램 종료"); 
		}
	}

}
