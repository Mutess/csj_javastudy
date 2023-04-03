/*
 * 1~30까지 정수에서 짝수만 한줄에 3개씩
 */
public class 문제12 {

	public static void main(String[] args) {
		
		for (int i = 1; i<=30; i++) {
			if(i%2==0) {
				System.out.printf("%2d\t", i); // 2자리씩 정렬맞춰서 탭하고 출력 //-일때 왼쪽정렬 +일때 오른쪽 정렬
				if (i%3==0) {
					System.out.println(); //3의 배수일때 다음줄로 출력
				}
			}
		}

	}

}
