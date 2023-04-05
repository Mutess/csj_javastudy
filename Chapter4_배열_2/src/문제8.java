/*
 * 5개 정수를 입력받은 후 차례로 출력하는 프로그램 
	 입력예) 5 10 9 3 2
	 출력예) 5 10 9 3 2
   문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
	 입력예) A B C D E F G H I J
	 출력예) ABCDEFGHIJ
   정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
	 입력예) 5 3 9 6 8 4 2 8 10 1
	 출력예) 9 8 1
   10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
	 입력예) 5 10 8 55 6 31 12 24 61 2
	 출력예) 61

 */
import java.util.Arrays;
import java.util.Scanner;
public class 문제8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("정수를 입력하세요 : ");
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		arr[3] = scan.nextInt();
		arr[4] = scan.nextInt();
		
		for (int i = 0; i<arr.length; i++ ) {
			//arr[i] = (int)(Math.random()*5)+ 1;
		}
		System.out.println(" "+Arrays.toString(arr));
		
		//다음 문제
		char[] c1 = new char[10];
		
		
		for (int i = 0; i<c1.length; i++ ) {
			c1[i] = (char)((Math.random()*26)+65);
		}
		System.out.println(c1);
		
		//다음문제
		int[] arr1 = new int[10];
		
		for (int i = 0; i<arr1.length; i++ ) {
			arr1[i] = (int)(Math.random()*10)+ 1;
		}
			System.out.println(Arrays.toString(arr));
			System.out.println("세번째 : "+arr1[2]);
			System.out.println("다섯번째 : "+arr1[4]);
			System.out.println("마지막 : "+arr1[arr1.length-1]);
			
		
		
		System.out.println(" "+Arrays.toString(arr1));
		
		//다음문제
		int[] arr2 = new int[10];
		
		for (int i = 0; i<arr2.length; i++ ) {
			arr2[i] = (int)(Math.random()*100)+ 1;
			
			}
			System.out.println(Arrays.toString(arr2));
			
			int max = arr2[0];
			for (int i:arr2) {
				if (max<i) {
					max = i;
				}
			}
			System.out.println("최댓값 : "+max);
		}
		
		
		

	}


