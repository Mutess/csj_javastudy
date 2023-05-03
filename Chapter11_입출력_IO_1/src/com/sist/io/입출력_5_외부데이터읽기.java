package com.sist.io;
/*
		URLConnection => url.openConnection()
			  |
		---------------------
		|					|
	HttpURLConnection	HttpsURLConnection
	
	class A
	class B extend A 
	
	B b = (B)new A(); == 이거랑 같음
	
	int a = (int)10.5
 */
import java.io.*;
import java.net.*;
public class 입출력_5_외부데이터읽기 {

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.10000recipe.com/recipe/list.html");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection(); //데이터 읽기  //상위클래스가 넘어와서 형변환
		
		if (conn!=null) {
			// 브라우저 => 1byte씩 전송
			// 1btye => 2byte로 변환
			// InputStreamReader ==> 이 메소드가 1byte를 2byte로 바꿔주는 역할
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()/*, "UTF-8"*/));
			while (true) {
				String data = in.readLine();
				if (data == null) {
					break;
				}
				System.out.println(data);
			}
			in.close();
			conn.disconnect();
		}
	}
}
