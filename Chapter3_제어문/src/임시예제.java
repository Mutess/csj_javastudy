import java.util.Arrays;

public class 임시예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr)); //순서대로 정렬
		
	}

}
