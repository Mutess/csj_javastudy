/*
 * 4의 배수가 아닌 수의 갯수와 합
 */
public class 제어문_문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, cnt = 0;
		
		for (int i = 100; i <= 999; i++) {
			if (i % 4 != 0) {
				sum += i;
				cnt++;
			}
			
		}
		System.out.println("갯수 : "+ cnt);
		System.out.println("합계 : "+ sum);

	}

}
