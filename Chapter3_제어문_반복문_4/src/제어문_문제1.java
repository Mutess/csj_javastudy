/*
 * 100~999 사이에 7의 배수와 합을 출력하는 프로그램
 */
public class 제어문_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, count = 0;
		for (int i = 100; i <= 999; i++) {
			if (i % 7 == 0) {
				sum += i;
				count++;
			}
		}
		
		System.out.println("7의 배수의 갯수 : "+count);
		System.out.println("7의 배수의 합계 : "+sum);

	}

}
