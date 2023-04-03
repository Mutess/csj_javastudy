/*
 * 	UpDown 게임
 * 	1. 컴퓨터가 난수 발생(1~100사이의 난수) // 사용자가 이걸 맞추는 게임
 *  2. 입력시에 힌트를 줘야함 (업인지 다운인지)
 *  3. for문은 횟수를 모르기에 무한루프(for (;;) = while(true)          맟추면 system.exit(0) 이걸로 종료
 */
import java.util.Scanner;
public class 반복문_6_업다운_게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*100) + 1;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		for (;;) {    //무한루프 => 보통 while문으로 많이 사용 //꼭 종료시점을 정해야 함
			System.err.print("1~100사이의 정수 입력 : ");
			int user = scan.nextInt();
			count++; // 비정상적인 입력일때 if문 위에
			
			if (user >= 1 && user <= 100) {
				count++;   //정상적인 입력일 if문 아래에 
				//힌트
				if(com>user) {
					System.out.println("입력한 수보다 큰값을 입력하세요(UP) : ");
				}
				else if (com < user) {
					System.out.println("입력한 수보다 작은 값을 입력하세요(Down) : ");
				}
				else if (com == user ) {
					System.out.println("정답입니다.");
					System.out.println("도전한 횟수 : " + count);
					System.exit(0);
				}
			
	
			}
			else {
				System.out.println("잘못된 입력입니다.");
			}
			System.out.println("비정상 입력 : "+ count);
		}
	}

}
