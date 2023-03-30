/*
 *   단항연산자 (++, --)
 *   a++ + a++ + ++a + ++a
 *   ex) a++, ++a, a--, --a
 *   	==> 왼쪽에서 오른쪽으로 (계산방식)
 *   
 *   산술연산자 (쉬프트, 비트연산자)
 *    ==> 왼쪽에서 오른쪽으로(계산방식)
 *    --------- *, /, +,- (우선순위)
 *    ex) 10+3*5 이면
 *    		 --- 먼저
 *		  --- 다음
 *    
 *    대입연산자, 삼항연산자
 *    ----------------
 *    오른쪽에서 왼쪽으로 (계산방식)
 *    ex) int a = 10
 *    	  int a = b + c
 *    -------------------> () : 괄호연산자 ==> 최우선순위 연산자
 *   
 *   비교연산자 => 결과값 (boolean) => true/faㅣse
 *   ==  같다 
 *   !=  같지 않다
 *   <   작다
 *   >   크다 (왼쪽이 기준점 (왼쪽이 크다))
 *   <=  작거나 같다
 *   >=  크거나 같다
 *   
 *   7==6 false
 *   7!=6 true
 *   ---- byte, int, short, long, double, float, boolean, char
 *   "a" == "a" 문자열은 다름 그래서
 *   ==> equals()를 사용해서 연산 (보통 아이디 비밀번호 동일하냐 안하냐 할때 사용***)
 *   
 *   'A' < 'B' 65 < 66 ==> true
 *   10 > 5 true
 *   10 <= 10 true  ex) 10<10 || 10==10
 *   10 >= 10 true  ex) 10>10 || 10==10
 *   
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100) + 1;
		/*
		 * 	  (int)(Math.random()*100) + 1;
		 * 			-------------
		 * 				  1
		 * 			 (0.0 ~ 0.99)
		 * 						 -----
		 * 						   2 ==> 0.0 ~ 99.0
		 * 	  ----
		 *      3 (0 ~ 99)
		 *      						---
		 *      						 4 (1 ~ 100)
		 */
		int b = (int)(Math.random()*100) + 1;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//1. ==
		boolean b1 = a==b;
		System.out.println("a==b : "+ b1);
		//2 !=
		b1 = a != b;
		System.out.println("a!=b : " + b1);
		//3 <
		b1 = a < b;
		System.out.println("a < b : " + b1);
		//4 >
		b1 = a > b;
		System.out.println("a > b : "+ b1);
		//5 <=
		b1 = a<=b;
		System.out.println("a<=b : " + b1);
		//6 >=
		b1 = a >= b;
		System.out.println("a >= b : " + b1);
		
		

	}

}
