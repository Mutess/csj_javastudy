package com.sist.String;
import java.io.*;

public class 라이브러리_String_2 {
	
	public static void main(String[] args) {
		try {
			long start = System.currentTimeMillis();
			FileReader fr = new FileReader("C:\\javaDev\\movie.txt");
			int i = 0; //파일리더가 int로 읽어오기때문에 int로 작성
			StringBuffer data = new StringBuffer();
			while ((i = fr.read())!= -1) {
				data.append((char)i);  //append() 문자열 결합시 사용하는 메소드
			}
			long end = System.currentTimeMillis();
			
			fr.close();
			System.out.println(data.toString()); //
			System.out.println("걸린시간 : "+(end-start));
		}catch (IOException ex) {
			ex.printStackTrace();//에러위치확인
			//getMessage()
		}
	}
}
