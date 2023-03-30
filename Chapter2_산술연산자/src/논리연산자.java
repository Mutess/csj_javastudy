/*
 *   && , || 
 *   
 *   	(조건) && (조건)
 *   	-----	 -----
 *   	  | 	   |
 *   	  ----------
 *   		   |
 *   		  결과
 *   && => 범위나 기간에 포함될때 사용 (예약사이트에서 사용)
 *   --------------------------
 *    true  true	=> true
 *   --------------------------
 *    true  false	=> false
 *   --------------------------
 *    false true 	=> false
 *   --------------------------
 *    false false 	=> false
 *   --------------------------
 *   
 *   
 *   || => 범위나 기간을 벗어난 경우에 사용 (범위를 벗어나면 행사종료 벗어난게 아니면 행사중)
 *   --------------------------
 *    true  true	=> true
 *   --------------------------
 *    true  false	=> true
 *   --------------------------
 *    false true 	=> true
 *   --------------------------
 *    false false 	=> false
 *   --------------------------
 *   
 *   => 효율적 연산
 *   	() && ()  // 앞에 연산이 false이면 뒤를 연산할 필요가 없기에 연산이 빨라짐 (효율적)
 *   		  --
 *   
 *   	() || ()  // 앞에 연산이 true이면 뒤를 연산할 필요가 없음
 *   		  --
 *   
 *   	int a = 10;
 *   	int b = 9;
 *   
 *   	(a<b) && ++b==a  //앞에가 false이기 때문에 뒤에 ++b를 연산 자체를 하지 않음** 그래서 9임
 */
public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		int b = 9;
//		
//		boolean bCheck = (a<b) && ++b == a; //앞에가 false라서 연산안함
//		boolean cCheck = (a<b) || ++b == a;
//		System.out.println(bCheck);
//		System.out.println("b= " + b);
		
		/*int a = 100;
		int b = 99;
		boolean bCheck = (a>b) && (b==a);
		//				  true 	   false ==> false
		System.out.println(bCheck);
		
		bCheck = (a>b || b==a);
		System.out.println(bCheck); */
		
		/*char c = (char)((Math.random()*26)+65);
		boolean bCheck = c >= 'A' && c<='Z'; //c값이 A~Z사이에 들어있는지 물어보는 예제
		System.out.println("c=" + c);
		System.out.println(bCheck); 
		
		bCheck = c >= 'A' && c<='Z';
		system.out.println("c=" + c);
		system.out.println(bCheck)
		*/
		
		/*char sex = 'M';
		int score = 87;
		
		boolean bCheck = (sex == 'M' && score >= 80);
		//					true			true		==> true  // 아이디 비밀번호가 맞는지 아닌지 판단할때 사용
		System.out.println(bCheck);
		
		bCheck = (sex == 'M' && score <= 80);
		System.out.println(bCheck); */
		
		/*int a = 10;
		boolean bCheck = a % 2 == 0 || a < 2;
		System.out.println(bCheck); */
		
		int year = 2024;
		boolean bCheck = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0); //true 
		System.out.println(bCheck);		// 윤년 계산법
		
		

	}

}
