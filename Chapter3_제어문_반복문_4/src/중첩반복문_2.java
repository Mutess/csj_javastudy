/*		1.
 * 		＊
 * 		＊＊
 * 		＊＊＊
 * 		＊＊＊＊
 * 		i,  j
 * 		// 줄수 별표
 * 			1   1
 * 			2   2
 * 			3   3
 * 			4   4  => i=j ==> j <= i 		

 * 		2. 
 * 		＊＊＊＊
 * 		＊＊＊
 * 		＊＊
 * 		＊
 * 			i,  j ====> i + j = 5    j <= 5 - i
 * 		// 줄수 별표 
 * 			1   4
 * 			2   3
 * 			3   2
 * 			4   1  ==> 역순이면 +  
 * 
 * 
 * 		==> 정렬
 * 		==> 빈도구하기
 * 		==> 등수구하기
 * 		==> 마름모/ 나비 / 모래시계 출력
 * 
 * 
 * 
 *         ＊
 * 	      ＊＊
 * 	     ＊＊＊
 * 		＊＊＊＊
 * -------------------
 * 		 i   k   j    ==> i/k  	i/j
 * 		줄수 공백 별표		  i+k = 4 ==> k = 4 - 1 = j = i
 * 		 1	 3	 1
 *       2   2   2
 *       3   1   3
 *       4   0   4
 * 		＊＊＊＊
 * 		 ＊＊＊
 * 		  ＊＊
 * 		   ＊
 * 
 * 
 */		
public class 중첩반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <=  i; j++) {
				System.out.print("＊");
			}
			System.out.println();
		}
		System.out.println("==================");
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5- i; j++) {
				System.out.print("＊");
			}
			System.out.println();
		}
		System.out.println("==================");
		
		char c = 'A';
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 1; j <=  i; j++) {
				System.out.print(c++ + "");
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		//char c = 'A';
			for (int i = 1; i <= 4; i++) {
				c = 'A';
				for (int j = 1; j <=  i; j++) {
					System.out.print(c++ + "");
				}
				System.out.println();
			}
		System.out.println("==================");
		
		for (int i = 1; i<= 4; i++) {
			System.out.println("");
			for (int j = 1; j<=4; j++) {
				if (i == j) {
					System.out.print("#");
				}
				else {
					System.out.print(j);
				}
			}
		}
		System.out.println("\n=========================");
		for (int i = 1; i <= 4; i++) {
			System.out.println("");
			for (int j = 1; j < i; j++) {
					System.out.print(" ");
				for (int k = 4; k >= i; k--) {
					System.out.print("*");
				}
				System.out.println("");
			}
			
		}

	}

}
