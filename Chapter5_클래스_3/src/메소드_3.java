import java.util.Arrays;

/*
 * 
 */
public class 메소드_3 {
/*	static int[] rand() {
		int[] arr = new int[5];
		for (int i = 0; i<arr.length; i++ ) {
			arr[i] = (int)(Math.random()* 100) + 1;
		}
		return arr; // 배열은 return으로 받는게 아님
	} */
	static void rand2(int[] arr) {
		for (int i = 0; i<arr.length; i++ ) {
			arr[i] = (int)(Math.random()* 100) + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int[] arr1 = rand(); //리턴형으로 값을 채운거지만 원래는 안됨
		System.out.println(Arrays.toString(arr1)); */
		
		int[] arr2 = new int[5]; // 매개변수를 이용해서 값을 채운다 ==> 활용도가 높음
		rand2(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
