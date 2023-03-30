/*
 *  << 왼쪽이동    오른쪽이동 >>
 *  
 *  10 << 2 
 *  2진법 1010(0)(0)
 *  => 101000 = > 40
 *  => 1010뒤에 0을 2개 채운다
 *  7 << 3
 *  2진법으로 111
 *  => 111000
 *  => 56
 *  
 *  8 << 2
 *  8을 2진법으로 1000
 *  쉬프트하면 100000
 *  => 32
 *  
 *  x << y ==> x * 2^7 //x곱하기 2의 y승
 *  
 *  9<<3이면 9 * 2의 3승 72
 *  ------------------------
 *  
 *  10 >> 2
 *  이진법으로 1010 
 *  쉬프트는 오른쪽이니 2개를 제거해라
 *  그래서 10만 남아서 
 *  => 2
 *  
 *  15 >> 3 
 *  1111이니까 3개 제거해서 
 *  => 1 이 남음
 *  
 *  27 >> 3
 *  11011이니까 뒤에서부터 3개 제거
 *  => 11 이니까 
 *  => 3
 *  
 *  27 / 2^3 ==> 27 / 8 = 3
 *  
 *  x>>y ==> x/2^y
 *  
 *  100 >> 3 
 *  100 / 2^3하면 100 / 8
 *  => 12 
 *  
 *  
 */ 
public class 쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10<<2); //40
		System.out.println(7<<3); //56
		System.out.println(8<<2); //32
		System.out.println(15>>3); //1
		System.out.println(10>>2); //2
		System.out.println();

	}

}
