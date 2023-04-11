import java.util.Arrays;

/*
 * 2. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
		임의의 정수 입력 (배열 생성후)
		정렬 처리
		출력 

 */

public class 문제2_정렬 {
	static void sort () {
		int[] arr = new int[5];
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
		System.out.println("정렬 전 : "+Arrays.toString(arr));
	
		
		for (int i = 0; i<arr.length-1; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("오름차순 정렬 후 : "+Arrays.toString(arr));
		for (int i = 0; i<arr.length-1; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("내림차순 정렬 후 : "+Arrays.toString(arr));
		
	}
	
	static void rand (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) +1;
		}
	}
	
	static void sort1(int[] arr, int n) { 
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j< arr.length; j++) {
				boolean bCheck = false;
				if (n == 1) {
					bCheck = arr[i] > arr[j];
				}
				else {
					bCheck = arr[i] < arr[j];
				}
				if (bCheck) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sort();
		int[] arr = new int[5];
		rand(arr);
		System.out.println("정렬 전 : "+ Arrays.toString(arr));
		sort1(arr, 1);
		System.out.println("오름차순 : "+Arrays.toString(arr));
		sort1(arr,2);
		System.out.println("내림차순 : "+Arrays.toString(arr));
	}

}
