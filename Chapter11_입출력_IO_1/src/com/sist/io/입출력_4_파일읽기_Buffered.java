package com.sist.io;
/*
		BufferedReader / BufferedWriter ==> 필터스트림
 */
import java.io.*;
public class 입출력_4_파일읽기_Buffered {

	public static void main(String[] args) throws Exception {
		// 기반 스트림
		FileWriter out = new FileWriter("c:\\java_datas\\movie.txt");
		// FileWriter는 파일이 없으면 자동으로 생성함, 그리고 파일이 이미 있으면 덮어쓰기함
		// 원래 있던 문장뒤에 내용을 추가가 가능한 기능을 만들고 싶으면 new new FileWriter("c:\\java_datas\\movie.txt", true); 라고 주면 됨
		FileReader in = new FileReader("c:\\javaDev\\movie.txt");
		// 필터 스트림 
		// 반드시 필터스트림을 선언시에는 기반스트림을 선언후에 필터스트림을 사용하는 것이 가능하다.
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		while(true) {
			String data = br.readLine(); //한줄씩 읽음
			if (data == null) break;
			bw.write(data+"\n"); //한줄씩 들어가게 만들어줌
		}
		System.out.println("읽기 / 쓰기 완료");
		in.close();
		out.close();
	}

}
