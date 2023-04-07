/*
 *  if : 무조건 조건을 쓸때 조건의 대한 결과가 무조건  true/false만 나와야 함
 */
public class 문자열_6 {

	public static void main(String[] args) {
		String menu = "나시르막 "
				+ "11,000원"
				+ "차퀘테오 "
				+ "12,000원"
				+ "나시고랭 깜풍 "
				+ "12,000원"
				+ "패닝프라운 미 "
				+ "12,500원"
				+ "깜꿍 블라찬 "
				+ "8,500원"; 
		//System.out.println(menu);
		String[] menus = menu.split("원");
		for (String m:menus) {
			System.out.println(m+"원");
		}
	}

}
