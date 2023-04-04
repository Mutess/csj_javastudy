//break /continue
import java.util.Scanner;
public class 반복제어문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 3자리 정수 입력 //3자리가 아니면 처음으로 continue, 정상 수행시 break
		 * 조건 1. 0을 포함 할 수 없음
		 * 조건 2. 같은 수를 입력할 수 없음 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("3자리 정수를 입력 : ");
			int input = scan.nextInt();
			if (input < 100 || input > 999) {
				System.out.println("잘못된 입력입니다.");
				continue; //while 처음부터 다시 수행 ==> 조건식부터
			}
			// 369/100 =>  3 
			int a = input / 100;
			int b = (input%100) / 10; // 369%100 ==> 69/10 => 6
			int c = input % 10;  // ==> 9
			
			System.out.println("input : "+input);
			System.out.println("a= "+a + ", b= "+b + ", c= "+c);
			//0을 포함할 수 없다
			if (a == 0 || b == 0 || c == 0) {
				System.out.println("0은 사용할 수 없습니다.");
				continue;
			}
			//같은 숫자가 있는 경우X
			if (a == b || b == c || c == a) {
				System.out.println("같은 숫자를 사용할 수 없습니다.");
				continue;
			}
			//정상 수행시
			System.out.println("입력값 : "+input);
			break; //종료
		}
		
		//for => 제외 (증가식)
		//while => 처음부터 다시 수행 (증가식)
	}

}
