import java.util.Arrays;

/*
 *   정렬(sort) : ASC(오름차순), DESC(내림차순)
 *   ------------------------------------
 *   선택정렬 (Select Sort)
 *   {10, 30, 50, 20, 40} => 10, 20, 30, 40, 50(ASC), 50, 40, 30, 20, 10(DESC)
 *    --  --
 *  내림 비교
 *    30 10
 *   --       --
 *   	 비교
 *    50      30
 *    --		  --
 *    		비교
 *    50		  20
 *    --		  --
 *    		비교
 *    50			  40  --1round ==> 0일떄 4바퀴 0 - 4
 *    --			  --
 *    -------------------
 *    50  10  30  20  40
 *   	  --  --
 *   	  30  10
 *   	  --  --
 *        30      20
 *        --      --
 *        30		  40
 *        --		  --
 *        40		  30  --2round ==> 1일때 3바퀴 1 - 3 
 *   --------------------
 *   50  40  10  20  30  
 *   		 --  -- 
 *   		 20  10
 *   	 	 --  --
 *   		 20      30
 *   		 --      --
 *   		 30 	 20 -- 3round ==> 2일때 2바퀴 2 - 2
 *   -------------------
 *   50  40  30  10  20
 *   			 --  -- 
 *   			 20  10 -- 4round ==> 3일때 1바퀴 3 - 1
 *   ------------------
 *   50 40  30  20  10
 *   
 *   	i 		j
 *    start	   횟수
 *      0		4
 *      1		3
 *      2		2
 *      3		1
 *   ---------------  i + j = 4  ==> j = 4 - i
 *   									   - length - 1
 *   버블정렬
 *   
 */
public class 배열응용_알고리즘_1_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for (int i = 0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100) +1;
		}
		System.out.println("==========정렬 전==========");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("\n==========(내림차순(DESC))정렬 후==========");
		
		for (int i = 0; i<arr.length-1; i++) {  //선택정렬은 마지믹에 돌지 않기에 한바퀴 덜 돌리는 것
			for (int j = i+1; j<arr.length;j++)  {// 비교 시작할때 첫째 자리와 첫째 자리를 비교할 이유가 없기에 두번째부터 비교하려고 i + 1를 해준것
				if (arr[i] < arr[j]) {  //서로 비교하는데 무조건 임시변수 하나가 필요함 int = temp; 그래야 숫자가 교환되거나 비교가 됨
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}
			System.out.println("===for"+(i+1)+"회차===");
			System.out.println(Arrays.toString(arr));
		} 
		//System.out.println(Arrays.toString(arr));
		
		System.out.println("\n==========(오름차순(ASC))정렬 후==========");
		for (int i = 0; i<arr.length-1; i++) {  //선택정렬은 마지믹에 돌지 않기에 한바퀴 덜 돌리는 것
			for (int j = i+1; j<arr.length;j++)  {// 비교 시작할때 첫째 자리와 첫째 자리를 비교할 이유가 없기에 두번째부터 비교하려고 i + 1를 해준것
				if (arr[i] > arr[j]) {  //서로 비교하는데 무조건 임시변수 하나가 필요함 int = temp; 그래야 숫자가 교환되거나 비교가 됨
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;	
				}
			}System.out.println("===for"+(i+1)+"회차===");
			System.out.println(Arrays.toString(arr));
		}
		
		//System.out.println(Arrays.toString(arr));
	}

}
