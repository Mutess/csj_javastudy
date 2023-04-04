/*
 * 5~16까지의 합을 구하시오

 */
public class 반복문_문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 3; i <=4462; i++) {
			if(i % 2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
