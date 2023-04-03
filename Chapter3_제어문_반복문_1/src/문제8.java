/*
 * 2의 배수를 100까지 더해라
 */
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int  i = 2; i <= 100; i+=2) {
			sum += i;
			
		} // for문이 끝나면 i값은 사라짐
		System.out.println("2+4+....100의 합은 : "+ sum);

	}

}
