/*
 *   do~while문 => 후조건 : 무조건 한번은 수행한다는 장점
 *   1. 초기화
 *   2. 게임
 *   3. 형식) 
 *   		초기값-----------------1
 *   		do {
 *   			반복 수행문장 -------2
 *   			증가식 ------------3
 *   		}while(조건식); => 증가된 변수로 조건검색
 * 		
 */
import java.util.Scanner; //3개이상 불러올땐 *로 써도 됨
public class 반복문_6 {

	public static void main(String[] args) {
		//1~10까지 출력
		int i = 1;
		do {
			System.out.print(i+" ");
			i++;
			// i = 2... i = 10... i = 11(종료) (메모리에 i = 11로 남음
		}while(i<=10);
		
		System.out.println("\n=======================");
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int dan = scan.nextInt();
		i = 1;
		
		do {
			System.out.printf("%2d * %2d = %2d\n",dan,i, dan*i);  // %5d를 주면 메모리에 5칸이 생기는데 5칸안에 숫자를 채움 +는 왼쪽부터 0이 들어가서 00010이 되고 -는 오른쪽부터 10000처럼됨
			i++;
		}while (i <= 9);
		System.out.println("==================================");
		i = 10;
		System.out.println("============for============선조건");
		for (i = 10; i < 10; i++) {
			System.out.println("i="+i);
		}
		i = 10;
		System.out.println("===========while==========선조건");
		while(i < 10) {
			System.out.println("i="+i);
			i++;
		}
		System.out.println("==========do~while========후조건");
		i = 10;
		do {
			System.out.println("i="+i);
			i++;
		}while (i < 10);
	}

}
