import java.util.Arrays;

/*
 * 배열 : 같은 데이터를 모아서 괸리
 * 		 --------
 * 변수
 * 		------
 * 		10 => a ==> int a = 10; (한개만 저장하는 공간)
 * 		------			--- 기본형 (자바에서 지원하는 데이터형) 
 * 배열 => 연속적으로 메모리 배치 => 인덱스 번호를 이용한다.
 * 		arr[0]  arr[1]    arr[2]   arr[3]   arr[4]
 * 		-------------------------------------------
 * 		  1   |    2    |     3  |    4  |     5
 * 		|------------------------------------------
 * 		arr
 * 		int[] arr = }1, 2, 3, 4, 5
 * 	자바의 메모리 구조
 *  -----------------------------------------------
 *  Method Area => method, static
 *  -----------------------------------------------
 *  Stack => 메모리 관리 (지역변수, 매개변수)
 *  				   ------
 *  				   {}안에서만 사용이 가능
 *  -----------------------------------------------
 *  heap => 동적 메모리 할당 (new) => 배열 / 클래스
 *  -----------------------------------------------
 *  순서 및 사용법
 *  
 *  1. 배열선언
 *     데이터형[] 배열명;
 *     데이터형 배열[];
 *  2. 배열할당 (연속적으로 몇개를 만들지 여부)
 *     데이터형[] 배열명 = new : 메모리를 생성해주고 다음에 만든 메모리의 주소값을 넘겨준다.
 *     				   --- malloc(sizeof(10)) => (승격)연산자로 바뀜
 *     				   예전에는 사용후 Delete
 *     									free()라는 걸 만들었지만--> 개발자가 사용을 안해서 --> 가비지 컬렉션(GC)을 만듬
 *     									GC => 사용하지 않거나 / null값을 경우 자동 회수 (프로그램 끝나고 실행함)
 *     									프로그램 중간에 사용하려면 system.gc()
 *    
 *     데이터형 배열명[] = new 데이터형[크기결정]
 *     
 *     예) 
 *       int[] arr = new int[5];
 *       ----------  ----------
 *        Stack			 Heap(실제 데이터가 저장)
 *       ----------		-------------------------
 *       arr
 *       -----		---[0]-[1]-[2]-[3]-[4]--
 *       0x100			0	0	0	0	0
 *       -----	   |------------------------
 *         |	  0x100
 *         |
 *        new
 *        실제 저장된 데이터의 메모리주소를 이용해서 데이터 관리 (참조변수) ==> 배열 / 클래스 
 *        
 *        사용법 
 *        **변수 (변수, 배열, 클래스) => 초기화후 시용
 *        		
 *        1. 인덱스를 이용해는 방법 => 초기화
 *        	  int [] arr = new int[3];
 *        	  arr[0] = 10;
 *            arr[1] = 20;
 *            arr[2] = 30;
 *            
 *            ----[0]----[1]----[2]----
 *            	   0	  0	     0
 *            	  10	 20  	 30
 *            -------------------------
 *        2. for문을 이용하는 방법 => 초기화
 *        	 for (int i = 0; i<arr.length; i++){
 *        	 	arr[i] = (i+1)*10
 *        	 }
 *        	  ----[0]----[1]----[2]----
 *            	   0	  0	     0
 *            	   10	  20  	 30
 *            -------------------------
 *        3. 선언과 동시에 초기화
 *        	 ---------------
 *        	 영화 / 뮤직...... (파일, 오라클, 크롤링)
 *        	 int[] arr = {1, 2, 3, 4, 5} => (javascript)[1, 2, 3, 4, 5]
 *        	 연산자 : (자바) : == !=, (자바스크립트) : === !== , (오라클) : = 
 *        	 -----------------------------------------------------------]
 *        	 char[] c = {'A', 'B'....}
 *        	 String[] s= {"", "", "",...} => 웹에서는 (80%)
 *        4. 배열 => 고정
 *        배열 확장 ==> 새로운 배열을 만들어여함
 *        배열 복사
 *        -------
 *        얕은 복사 ==> 주소를 동일하게 만든다.
 *        int[] = arr={}
 *        int[] = arr1=arr;
 *        
 *        깊은 복사 ==> 새로운 주소를 만든다.
 *        int[] arr={}
 *        ***int[] arr1=arr.clone() => 같은 크기여야함
 *        배열을 확장
 *        ***=> arraycopy()
 *        ***=> for문을 이용해서 데이터값만 복사
 *        
 *    *** new를 사용하는 경우 => 기본 디폴트 값이 설정된다.
 *    	  int[] ===> 0
 *    	  char[] ===> '/u0000'
 *    	  String[] ==> null(모든 클래스는 기본 디폴트는 null)
 *    											 ----- 메모리 주소가 없는 경우
 *    											 -----NullPointException
 *    	  double ==> 0.0
 *    	  boolean[] ==> false
 *        
 *        
 *        클래스(사용자 정의 데이터형) 저장법 => 클래스는 제일 많이 사용됨(데이터형에 상관없이 저장가능) ==> 영화정보, 회원, 게시물,...
 *        ------------
 *          ---------
 *             10
 *          ---------
 *            10.5
 *           -------
 *            "홍길동"
 *            ------
 *           ---------
 *       
 */	
public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char배열 선언 => 26개 ==> 초기값 => A~Z
		char[] alpha = new char[26];
		char c = 'A';
		for (int i = 0; i<alpha.length; i++) { //25라서
			alpha[i] = c++;  //c++로 하나 증가시켜 26개 만듬
		} 
		//출력
		for (char cc:alpha) {
			System.out.print(cc+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(alpha));

	}

}
