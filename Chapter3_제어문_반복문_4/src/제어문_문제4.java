/*
 * 1~100 3의 배수 and 5의 배수를 출력하는 프로그램
 */
public class 제어문_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(i+ " ");
			}
		}

	}

}
