/*
 * 	반복제어문
 * 	= break
 * 	   => 반북문을 종료
 * 	   => 반복문 (for,while, do~while), 선택문 (switch~case)
 *     => break문 밑에는 소스코딩 불가능
 *     ex) for() {
 *     		if() {
 *     			break;
 *     			//코딩 불가
 *     		}
 *     }
 *  = continue
 *  	=> 특정 부분을 제외할때 사용 (반복문을 계속 수행)
 *  	=> 반복문(for,while,do~while)에서만 사용이 가능
 *  	=> 웹에서는 특별한 경우에만 사용
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("======break======");
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i+" "); // 출력문이 여기에 있으면 1 2 3 4 5까지 나옴
			if (i == 5) {
				break; //반복문을 중단 ==> 1 2 3 4
				
			}//System.out.print(i+" "); //여기에 있으면 반복문을 중단 ==> 1 2 3 4
			
			/*
			 * for => break종료, continue => 증가식 이동
			 * while => break종료, continue => 조건식으로 이동
			 * 					  ----------- 처음부터 다시 실행할때 
			 * 				 	  잘못하면 무한루프에 걸리 수 있다.
			 * int i = 1;
			 * while (i<=10)
			 * {
			 * 		if (i == 5){
			 * 			continue;  ==> 조건식으로 감 // 1증가가 안되서 무한루프에 걸림
			 * 		sysout(i+" ");
			 * 		i++;
			 * 		}
 			 * }
			 */
			
			}
			System.out.println("\n=======continue=============");
			for(int i = 1;i <=10; i++) {
				if (i == 5) { 
					continue; //for문은 증가식으로 이동 => i++
				}
				System.out.print(i+" ");
			
		}
			System.out.println("");
			int i = 1;
			while (i<=10) {
				  
				 	if (i == 5){
				 		continue; //==> 조건식으로 감 // 1증가가 안되서 무한루프에 걸림 //사용 예는 게임 : 잘못된 입력이 있는 경우 처음으로 다시 돌아갈때 주로 사용 또한 로그인 할때 비밀번호 틀리면 다시 돌아갈때
				 	}
				  		System.out.print(i+" ");
				 		i++;
				 	}
				  
		

	}

}
