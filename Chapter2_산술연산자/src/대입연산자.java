/*
 *   대입 연산자
 *   연산 순서 (오른쪽에서 왼쪽으로)  ex) a = 10 + 30이면 10 + 30 한뒤에 a에다가 대입하는 식
 *   
 *   = 대입 연산자
 *   ----------------- 복합 대입 연산자
 *   += *** ==> 갑을 누적할때 사용 (총합)
 *   -= ***
 *   *=
 *   /=
 *   %=
 *   <<=
 *   >>=
 *   &=
 *   |=
 *   ^=
 *   -----------------
 *   
 *   +=
 *   ---
 *   int a = 10;
 *   a += 10; ==> a = a + 10 => 20
 *   a+=1, a = a + 1, a++, ++a 같은 것임
 *   ------------------------------
 *   a += 20 === a = a + 20
 *   a -= 20 === a = a - 20
 *   a *= 10 === a = a * 10
 *   a /= 10 === a = a / 10
 *   a %= 10 === a = a % 10
 *   
 *   조건을 걸때는 비교, 논리, 부정연산자로만 가능하다.
 *    
 */
public class 대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a = 10;
		a++;
		a++;
		a++;
		System.out.println(a); */
		
		/*int a = 10;
		a += 3; //a = a + 3;
		System.out.println(a); */
		
		int a = 10;
		a= a + 3; // a+=3;
		System.out.println(a);

	}

}
