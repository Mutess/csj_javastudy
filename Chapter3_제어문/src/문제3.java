/*
 * 1학년부터 4학년까지 중간고사 시험을 보았다. 
         4학년은 70점 이상이면 합격, 그 이외의 학년은 60점 이상이면 합격이다. 
         이를 판단하는 프로그램을 작성해보자.
         점수가 0미만 100초과이면 경고문구 출력!


		if (score < 0 || score> 100) {
		경고
		}
		else {
			if (lev == 4)
			{
				if (score >= 70){
					system.out.println("합격");
				}else{
					system.out.println("불합격");
				}
			}
			
		}
		else
		{
			if(score >= 60) {
				system.out.println("합격")
			} else {
				system.out.println("불합격")
			}
			
		}
		

 */
import java.util.Scanner;
public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 : ");
		int score = scan.nextInt();
		
		System.out.print("학년을 입력해주세요 : ");
		int lev = scan.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("0~100 사이의 점수를 입력하세요");
		}
		
		else if(lev < 3 && score >= 60 && score >= 100) {
			
			System.out.println("합격입니다.");
		} 
		
		else if (lev == 4 && score >= 70 && score >= 100) {
			System.out.println("합격입니다.");
		}
		
		
		else {
			System.out.println("불합격입니다.");
		}
		
		

	}

}
