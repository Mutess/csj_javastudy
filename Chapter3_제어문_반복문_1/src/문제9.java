/*
 * 구구단 5의 결과값만 출력
 */
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
/*		for (int i = 5; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				sum = i * j;
				System.out.printf("%d\t",sum);
			}
			
		}*/
		
		for (int i = 5; i <= 50; i+=5){
			System.out.print(i+"\t");
		}
		
	}  

}
