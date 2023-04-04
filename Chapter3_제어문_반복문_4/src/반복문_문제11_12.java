/*
 * 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
	10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램

 */
public class 반복문_문제11_12 {
	public static void main(String[] args) {
		int cnt = 0;
	for (int i = 1; i<=10; i++) {
		int num = (int)(Math.random()*100) +1;
		System.out.println("num"+num);
		if (num%2==0) {
			cnt++;
		}
	}
	System.out.println("짝수의 총 갯수 : "+cnt);
	
	
	int cnt3 = 0, cnt5 = 0;
	for (int i =1; i <= 10; i++) {
		int num = (int)(Math.random()*100) +1;
		System.out.println("num"+num);
		if (i % 3 == 0) {
			cnt3++;
		}
		if (i % 5 == 0) {
			cnt5++;
		}
		
	}
		System.out.println("3 총 갯수 : "+cnt3);
		System.out.println("5 총 갯수 : "+cnt5);
	}

}
