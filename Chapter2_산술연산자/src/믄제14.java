import java.util.Scanner;
public class 믄제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나눌 2개의 정수를 입력하세요 : ");
		
		int i = scan.nextInt();
		int j = scan.nextInt();
		
		int div = i % j;
		
		System.out.println(div);

	}

}
