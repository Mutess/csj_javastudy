/*
 *   메소드
 *    1) 구조화된 프로그램 (문장을 기능별로 나눠서 작업)
 *    2) 반복을 최대한 제거 ==> Spring(AOP)
 *    3) 메소드는 하나의 기능만 수행할 수 있도록 (더하기 1개, 나누기 1개, 이런식으로)
 *    ---------------------------------------------------------------
 *    리턴형 : 처리후 결과값
 *    매개변수 : 사용자가 요청하는 값 (여러개 보낼 수 있음)
 *    		  => 3개 이상이면 []배열로 묶거나, class로 묶거나
 *    
 *    하나씩 가지고 있는 건 인스턴즈
 *    하나가지고 다 같이 쓰는 건 static (공유 메소드)
 *    
 *    
 *    형식) 
 *    	 new
 *    	 리턴형 메소드명(매개변수...)
 *    				 ---------  갯수와 상관없다. (사용자 요청값)
 *    	 ---- ------ 한 자바파일안에 모든 메소드명이 같을 수도 있다.
 *    				 같은 메소드명이 있을 수도 있다(O) (매개변수가 다르면 가능하다.)
 *       요청 결과값 (한개만) ==> 여러개 : int[], class
 *       
 *       **사용자가 요청한 값 (매개변수)을 받아서 처리후에 결과값을 보내주거나 화면에 출력
 *         ---------------------- 입력, 마우스 클릭, 버튼 클릭...
 *         												결과값이 없는 상태는 (void)
 *       
 *       정수 2개를 보내고 더한값을 받는다.
 *       	=> return a+b;
 *       	=> Systme.out.println ("a+b"+(a+b))  //위 아래 둘중에 하나를 선택
 *       
 *       단을 보내고 해당 단의 구구단을 출력
 *       	=> 자체 출력이 편하다.
 *       
 *       main 메소드에서는 가급적이면 => 연결 (변수 선언(X))
 */
//void 사용 
// 구구단 => 단을 입력을 받아서 => 자체에서 출력이 가능하도록
import java.util.Scanner;
public class 메소드_1 {
	static void gugudan (int dan) {  //void는 return(을 사용하지 않음)이 없음
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%d\n", dan, i, dan*i);
		}
	}
	static void process() {
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력 : ");
		int dan = scan.nextInt();
		
		gugudan(dan);
	}
//	public static void main(int a(/*매개변수)*/) {
		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print(false);
		process();

	}

}
