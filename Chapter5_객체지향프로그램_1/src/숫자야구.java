/*
 * 출력은 return X
 * 
 *   숫자야구게임
 *   1. 난수발생
 *   2. 사용자 입력
 *   ------------------------
 *   3. 같은지 않은지 비교
 *   4. 힌트
 *   ------------------------  3개의 메소드
 *   5. 종료 여부 확인
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class 숫자야구 {
	
	static void inputNum (int[] com, int[] user) {		
		for (int i = 0; i < 3; i++) {
			com[i] = (int)(Math.random()*9) +1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--; // 현재 저장된 데이터에 다시 난수를 발생함//중복없는 난수발생 조건식
					break;
				}
				
			}
		}
		//System.out.println(Arrays.toString(com));
		Scanner scan = new Scanner(System.in);
		//사용자 입력
		while (true) {
			System.out.print("3자리 정수 입력(중복X) : ");
			int input = scan.nextInt();
			//정상입력 ==> &&
			//오류 처리 ==> ||
			if (input < 100 || input>999) {  //
				System.out.println("잘못된 입력입니다.");
				continue; //while의 조건식으로 이동 => 처음부터 다시
			}
			user[0] = input / 100;   // 369/100 = 3
			user[1] = (input % 100) / 10;  // (369%100) / 10 = 6
			user[2] = input % 10;
			
			if (user[0] == user[1] || user[1]==user[2] || user[0] == user[2]) {
				System.out.println("같은 숫자는 사용이 불가능합니다.");
				continue;
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0을 사용할 수 없습니다.");
				continue;
			}
			hint(com, user);
			
//				int s=hint(com, user);
//	        	if(end(s))
//	        	{
//	        		System.out.print("게임을 다시할까요?(y/n):");
//	        		char c=scan.next().charAt(0);
//	        		if(c=='y')
//	        		{
//	        			System.out.println("새 게임을 시작합니다!!");
//	        			process();
//	        		}
//	        		else
//	        		{
//	        			System.out.println("게임을 종료합니다!!");
//	        			System.exit(0);
//	        		}
//	        	}
				
	}
		
}
		static int hint(int[] com, int[] user) {
			
			int s = 0, b = 0; // s = 같은 자리의 같은 숫자가 있음 ,,, b = 다른 자리에 정답인 숫자가 어딘가에 있음
						
						for (int i = 0; i < 3; i++) { //com
							for (int j = 0; j < 3; j++) { //user
								if (com[i] == user[j]) { //같은 수가 있냐
									if (i == j) {  // 같은 자리에 있으면 s++
										s++;
									}
									else {  //다른 자리에 있으면 b++
										b++;
									}
								}
							}
					}
						System.out.printf("Input:%d%d%d,Result:%dS-%dB\n",
				    			user[0],user[1],user[2],s,b); 
						
						return s;
						
		}
		static boolean end (int s) {
			boolean bCheck = false;
			if (s == 3) {
				bCheck = true;
				
		}
			return bCheck;
}
		static void process()
	    {
	    	int[] com=new int[3];
	        int[] user=new int[3];
	        inputNum(com,user);
	    }
		
		
	

	public static void main(String[] args) {
		process();
/*		int[] com = new int[3];
		int[] user = new int[3];
		
		for (int i = 0; i < 3; i++) {
			com[i] = (int)(Math.random()*9) +1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {
					i--; // 현재 저장된 데이터에 다시 난수를 발생함//중복없는 난수발생 조건식
					break;
				}
				
			}
		}
		//System.out.println(Arrays.toString(com));
		Scanner scan = new Scanner(System.in);
		//사용자 입력
		while (true) {
			System.out.print("3자리 정수 입력(중복X) : ");
			int input = scan.nextInt();
			//정상입력 ==> &&
			//오류 처리 ==> ||
			if (input < 100 || input>999) {  //
				System.out.println("잘못된 입력입니다.");
				continue; //while의 조건식으로 이동 => 처음부터 다시
			}
			user[0] = input / 100;   // 369/100 = 3
			user[1] = (input % 100) / 10;  // (369%100) / 10 = 6
			user[2] = input % 10;
			
			if (user[0] == user[1] || user[1]==user[2] || user[0] == user[2]) {
				System.out.println("같은 숫자는 사용이 불가능합니다.");
				continue;
			}
			if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0을 사용할 수 없습니다.");
				continue;
		} */
			//비교
//			int s = 0, b = 0; // s = 같은 자리의 같은 숫자가 있음 ,,, b = 다른 자리에 정답인 숫자가 어딘가에 있음
//			
//			for (int i = 0; i < 3; i++) { //com
//				for (int j = 0; j < 3; j++) { //user
//					if (com[i] == user[j]) { //같은 수가 있냐
//						if (i == j) {  // 같은 자리에 있으면 s++
//							s++;
//						}
//						else {  //다른 자리에 있으면 b++
//							b++;
//						}
//					}
//				}
//			}
/*			System.out.printf("Input:%d, Result:%dS-%dB\n", input, s, b);
			
			//종료
			if (s == 3) {
				System.out.println("Game Over!");
				break;
			}
			
		} */
		

	}
}