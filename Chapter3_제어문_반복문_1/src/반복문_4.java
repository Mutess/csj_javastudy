/*
 * 1~10까지의 합 ==> 값
 * for => 반드시 숫자의 패턴
 * 1 2 3 1 2 3 1 2 3
 */
public class 반복문_4 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2==0) {
				sum -= i;
			}
			else {
				sum += i;
			}
		}
		System.out.println("sum : " + sum);
	}
}
