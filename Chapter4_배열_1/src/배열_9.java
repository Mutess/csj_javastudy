import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 확장
		int[] arr1= {10,20,30,40,50};
		int[] arr2= new int[10];
		System.arraycopy(arr1, 1, arr2, 0, arr1.length); //복사할 변수, 몇 번째부터 복사, 붙혀넣을 변수, 몇번째부터 붙혀넣기, 몇개)
		
		System.out.println(Arrays.toString(arr2));

	}

}
