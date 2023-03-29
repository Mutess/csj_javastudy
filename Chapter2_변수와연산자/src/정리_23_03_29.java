/*
 *   4page : 자바 실행과정
 *   A.java ========> A.class ======> 화면에 결과값 출력
 *   		컴파일(javac)		  인터프리터(java) ==> 동시에 처리 단축키 (ctrl + f11)
 *   
 *   5page : 운영체제의 독립적이다.(운영체제가 같은 번역을 함. 그래서 다른 운영체제가 java를 인식함)
 *   
 *   19page
 *   	1) 파일명과 클래스명이 동일해야 된다.
 *   	2) 가급적이면 한개의 파일에 한개의 클래스를 사용하는 것을 권장.
 *   	3) 저장명을 잡을 땐 먼저 public, main, 둘다 없으면 아무클래스로 결정가능
 *   	4) 클래스명은 대문자
 *   	5) 실행을 위해선 main함수 꼭 생성
 *   
 *   	java에 화면 출력 메소드
 *   	------------------
 *   	system.out.print(); 옆에 출력
 *   	system.out.println(); \n 랑 같은 (다음줄에 출력)
 *   	system.out.printf(); => 출력 형식을 만들 경우
 *   
 *   	22page : 들여쓰기
 *   	주석을 열고 코딩 설명하는 글 작성해야 됨
 *   
 *   	23page
 *   	주석 : 번역이 안되는 부분 (//)
 *   		단축키 기억
 *   
 *   	25page
 *   	변수 : 한 개의 데이터만 저장하는 메모리 공간 => 데이터값을 변경할 수 있다.
 *   	필요한 내용을 저장 후 가공
 *   
 *   	26page 변수 선언 규칙
 *   		   데이터형 변수명 = 초기값
 *   		   예) int a = 10;
 *   			A+ 
 *   			char a = 'A' char op ='+'
 */
public class 정리_23_03_29 {

	public static void main(String[] args) {
		char a = 'A';
		char op = '+';
		System.out.println(a+""+op);
	}

}
