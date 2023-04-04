/*
 * 1~1000까지의 7의 배수합, 9의 배수합
 */
public class 제어문_문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a7 = 0, a9 = 0;
		int c7 = 0, c9 = 0;
		for (int i = 1; i <=1000; i++) {
			if(i % 7 == 0) {
				a7 += i;
				c7++;
			}
			if (i % 9 == 0) {
				a9 += i;
				c9++;
			}
		}
		System.out.println("7의 배수 : "+a7);
		System.out.println("9의 배수 : "+a9);
		System.out.printf("7의 배수 + 9의 배수 : %d\n", a7 + a9);
		System.out.println("7의 배수의 갯수 : "+c7);
		System.out.println("9의 배수의 갯수 : "+c9);

	}

}
