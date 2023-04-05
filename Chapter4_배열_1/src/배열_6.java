import java.util.Arrays;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		// arr[0] ~ arr[4]
		// arr[0] 값읽기/ 값변경가능		
		
		// 1. 배열의 크기를 출력
		System.out.println(arr.length);
		// 2. 3번쨰 값을 300
		arr[2] = 300;
		System.out.println(Arrays.toString(arr)); // arr의 배열 전체 값을 가져올떄 Arrays.toString(arr)
		// 3. 5번째을 출력
		System.out.println("5번째 값: "+arr[4]);

	}

}
