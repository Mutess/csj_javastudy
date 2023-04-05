import java.util.Arrays;

/*
 *  알파벳 10개를 저장하는 공간을 만들어라
 *  char c1 ~c10;
 *  char[] alpha = new char[10];
 *  
 *  알파벳 100000개를 저장하는 공간을 만들어라
 *  char c1 ~c100000; ==> 가장 큰 알파벳을 출력
 *  => if (max < c2 ) =====> 99999개를 작성...
 *  char[] alpha = new char[100000];
 *  => for (int i = i; i<alpha.length; i++)
 *  
 *  *** 배열 변수가 3개 이상이면 배열
 *  하지만 관련된 데이터가 없으면 일반변수
 *  (사람 수와 같은)관련된 데이터가 있으면 배열
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // 1. 선언
		 int[] arr = new int[5];
		 // 2. 초기화
		 for (int i = 0;i<arr.length; i++ ) {
			 arr[i] = (int)(Math.random()*100) +1;
		 }
		 // 3. 출력
		 for (int a:arr) {
			 System.out.print(a+" ");
		 }
		 // 4. 제어
		 // 정렬
		 // 5. 결과값 출력
		 

	}

}
