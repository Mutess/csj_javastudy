import java.util.Scanner;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 정수를 입력하세요: ");
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		int k = scan.nextInt();
		
		
		int mix = i * j + k;
		
		System.out.println("3개의 정수를 곱하고 합한 값은 : " + mix);
		

	}

}
