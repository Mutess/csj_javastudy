/*
 * 	 문제 1
 *   1. 메모리 저장
 *   int a;  int b;
 *   2. System.out.printf() => 서식이 있는 출려을 할때 사용 
 *   (ex) 
 *   %d => 정수값
 *   
 *   %f => 실수값
 *     	==> %.(소수점 원하는 자리 숫자)f
 *   %c => 문자
 *   
 *   %s => 문자열
 *   
 *   
 *   
 *   
 *   
 *   문제 2
 *   + (산술, 문자열) => 
 *   / 0으로 나눌 수 없다, 정수/정수 = 정수 (소숫점 이하를 가져올 수 없음)
 *   % 결과값의 부호는 왼쪽편을 따라간다.
 *   
 *   
 *   
 *   
 *   
 *   문제 3
 *   num2 = 10 % 3 ==> 1
 *   		------
 *   		1 + 9 % 3 이런식으로 연산됨
 *   
 *   
 *   
 *   
 *   
 *   
 *   문제 4
 *   항상 메모리에 있는 값이 바뀌면 전에 있는 값은 사라짐
 *   
 *   문제 5
 *   증가하거나 감소한 다음 출력이면 값은 무조건 올라가거나 내려간 값이 출력됨
 *   
 *   
 *   문제 10
 *   
 *   증감연산자가 a++ 이렇게 있으면 그 다음줄에 증가된 값이 적용됨
 *   하지만 ++a 이렇게 있으면 그 줄에서 증가된 값이 적용됨
 *   
 *   문제 12
 *   1. 변수 int a, b;
 *   2. 초기화 : Scanner
 *   3. 연산처리 a-b, a*b
 *   4. 결과출력
 *   
 *   코딩은 
 *   데이터 저장 ------------------------------------> 데이터 가공 ------------------------------------------> 결과값 출력
 *   	|												| 연산자												| System.out.println()
 *   1) 직접 입력할것인가
 *   2) 사용자로부터 입력 받을것인가
 *   3) 난수(랜덤)를 발생시킬 것인가 (Math.ramdom())
 *   4) 파일에서 읽거나
 *   5) 오라클에서 값 읽기
 *   
 *   
 *   문제 13
 *   
 *   
 */
import java.util.Scanner;
public class 문제 {

	public static void main(String[] args) {
		// 문제 1번
//		int i = 0;
//		int re = 0;
//		i = 3;
//		re = ++i;
//		System.out.println("re:" +re+"i:" + i);
//		i = 3;
//		re = i++;
//		System.out.println("re:"+re+"i:"+i);
		
//		int a = 10;
//		double d = 10.5;
//		char c = 'A';
//		
//		System.out.println("a="+a+"d="+d+"c="+c);
//		System.out.printf("a=%d, b=%.1f, c=%c", a, d, c);
//		System.out.printf("a=%3d b=%4.1f c=%2c", a, d, c);  // %앞에다가 따로 숫자를 넣으면 출력값 간격울 조절할수 있음.
		
		
		//문제 6번
//		int a = 10;
//		System.out.println(a++); //10
//		System.out.println(a++); //11
//		System.out.println(++a); //13
//		System.out.println(++a); //14 
		
		
		//문제 12번
//		Scanner scan = new Scanner(System.in);
//		System.out.print("두개의 정수를 입력하세요 : ");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		
//		System.out.println(a-b);
//		System.out.println(a*b);
		
		//문제 13번
//		Scanner scan = new Scanner(System.in);
//		int a, b, c;
//		System.out.print("세개의 정수를 입력해주세요 : ");
//		a = scan.nextInt();
//		b = scan.nextInt();
//		c = scan.nextInt();
//		
//		System.out.printf("%d * %d + %d = %d", a, b, c, a*b+c);
		
		//문제 14번
		var s = new Scanner(System.in);
		int a, b;
		a = (int)(Math.random()*100)+1;
		b = (int)(Math.random()*100)+1;
		
		System.out.printf("a=%d, b=%d, a%%b=%d", a, b, a%b);

	}


	
	}

