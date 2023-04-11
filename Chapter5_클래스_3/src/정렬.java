import java.util.Arrays;

public class 정렬 {
	static void sort (int n) {
		int[] arr = new int[5];
		for (int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100) +1;
		}
		System.out.println("정렬 전: "+Arrays.toString(arr));
			for (int i = 0;i<arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					boolean bCheck = false;
					if (n == 1) {
						bCheck = arr[i] > arr[j];
					}
					else {
						bCheck = arr[i] < arr[j];
					}
					
					
					if (bCheck) {
							int temp = arr[i];  //arr[i] = 50 , temp = 50
							arr[i] = arr[j]; //arr[j] = 40, arr[i] = 40
							arr[j] = temp; //arr[j] = 50
					} 
				}
			}
			System.out.println("정렬 후 : "+Arrays.toString(arr));
			System.out.println("정렬 후 :  "+Arrays.toString(arr));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort(1);
		sort(2);
	}

}
