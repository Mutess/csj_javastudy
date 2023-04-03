/*
 *  자바에서 지원하는 반복문
 *  ------------------
 *  for : 반복 횟수가 지정된 경우에 주로 사용 ==> 중첩 (2차) for문을 공부해야됨 ==> 코테가 다 중첩 for문이라서
 *  = 일반 for
 *  = for - each : 출력용(웹에서 가장 많이 등장, 향상된 for문)  *** 배열, 컬렉션에서 배울 수 있음
 *  while : 반복 횟수를 모르는 경우 (선 조건)
 *  do ~ while : 반복횟수를 모르는 경우 경우 (후조건) => 무조건 1번 이상은 수행이 가능
 *  
 *  => 유사한 내용을 여러번 출력을 할때 주로 사용
 *  	합계구하기, 통계, 목록을 출력,...등에 사용
 *  => for (형식)
 *  	for (int i = 1; i <= 10 i++) { //10번을 수행
 *  	
 *  	}
 *  	for (int i = 0; i<10;; i++) { //10번 수행 동일
 *  	}
 *  	for (초기값; 조건식; 증감식) {
 *  		반복 실행문장
 *  	}
 *  	
 *  	초기값 : 시작점 ==> 한번만 수행
 *  	조건식 : 수행을 중단할때 (종료점)
 *  	증감식 : 초기값 ~ 조건식까지 돌릴때 조건이 false가 될때까지 수행
 *  	---- 감소도 가능
 *  	for (int i = 10;i>=10;i++)
 *  	증가는 여러개 증가도 가능
 *  	for (int i =1; i>=10; i+=2) .... 1 = 1, i = 3, i = 5
 *  						  ---- 복합 대입연산자 i += 5, i+=10...
 *  										   i -= 5, i -= 5...
 *  										   i++, i--
 *  
 *  실행 순서 (*** 프로그램에서 가장 많이 사용되는 제어문 : for, if) 중요(*****)
 *  => for문은 한문자만 수행이 가능 
 *     여러문장 사용시에는 {}을 이용해서 처리한다.
 				  false (반복문 종료)
 *     		① ->   ②    <-④ 
 *  => for(초기값; 조건식; 증감식) {
 						↗
 *  				↓ true
 *  		반복적으로 실행할 문장
 *  	}
 *  
 *  	1) 초기값 => 2)조건식에 대입 => false => 종료(for)
 *  					   => true => 3) 반복 수행문장 수행 => 4)초기값 증가 
 *  				한바퀴 후에 2) => 3) =>  4) 반복
 *  						 |
 *  						false면 종료
 */
public class 반복문_1 {

	public static void main(String[] args) {
		//hello Java 10번 출력
/*		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java"); */
		
		//반복문 이용
		System.out.println("============for 문 이용 =============");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". Hello Java");
		}
		System.out.println("============for 문 이용 =============");
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1) + ". Hello Java");
		}
		

	}

}
