/*
 * 1~10 사이의 숫자중 3의 배수만 제외하고 출력
 */
public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i <= 10; i++) {
			if (i % 3 != 0) {
				System.out.print(i+"\t");
			}
		
		}

	}

}
