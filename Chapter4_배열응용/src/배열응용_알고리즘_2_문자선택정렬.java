import java.util.Arrays;

/*
 *   선택정렬 => 문자
 *   B  C  A  E  D    => ASC(A B C D E)/ DESC(E D C B A)
 *   - -----------
 *   i	  	j
 *   -  -
 *   B  C
 *   -	   -
 *   A	   B 
 *   -		  -
 *   A		  E
 *   - 			 -
 *   A 			 D
 *   -------------------
 *   i = 1
 *   A  C  B  E  D
 *      -  -
 *      B  C
 *      -     -
 *      B     E
 *      -		 -
 *      B        D
 *  ---------------------
 *   i = 2
 *   A  B  C  E  D
 *   	   -  -
 *   	   C  E
 *   	   -     -
 *   	   C 	 D
 *   -------------------
 *   i = 3
 *   A  B  C  E  D
 *   		  -  -
 *   		  D  E
 *   ------------------- 종료
 *   i = 4
 *   A  B  C  D  E (수행하지 않는 부분)
 *   			 -  ===  i < arr.length-1
 */ 
public class 배열응용_알고리즘_2_문자선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[100];
		
		for (int i = 0; i<arr.length; i++) {
			arr[i] = (char)((int)(Math.random()*26) + 65);
		}
		System.out.println("======정렬전======");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n======(ASC)정렬후======");
		for (int i = 0; i<arr.length-1;i++) {
			for (int j = i+1;j<arr.length; j++) {  //j = i + 1 = i의 다음 값부터 i번째에서 다음 번째부터 비교시작
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n======(DESC)정렬후======");
		for (int i = 0; i<arr.length-1;i++) {
			for (int j = i+1;j<arr.length; j++) {  //j = i + 1 = i의 다음 값부터 
				if(arr[i]<arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
