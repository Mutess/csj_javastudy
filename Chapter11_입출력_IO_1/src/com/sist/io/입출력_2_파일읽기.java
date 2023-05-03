package com.sist.io;
/*
		파일 읽기
		FileInputStream (1byte) / FileReader (2byte)
		한글이 포함 ==> 반드시 2byte씩 읽어야 => 한글깨짐 방지가 가능하다
 */
import java.io.*;
public class 입출력_2_파일읽기 {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("c:\\javaDev\\movie.txt");
			// 8192byte의 문자 배열을 만들어서 사용
			BufferedReader in = new BufferedReader(reader);
			// 네트워크 통신시에도 많이 사용
			int i = 0; //한글자씩 읽기 => read()
			// read() 메소드는 매개변수가 int ==> 글자의 ASC코드를 읽어옴 (정수)
			// A => read() ==> 65
			// int read(byte[], int, int) => 읽은 바이트수
			long start = System.currentTimeMillis();
/*			while ((i=in.read())!= -1) { 
				// -1 => 읽을 데이터가 없는 경우 => 즉, 데이터 전체를 다 읽은 경우
				// EOF (End Of File)
				System.out.print((char)i);
			} */
			while (true) {
				String data = in.readLine(); //한줄씩 읽기
				if (data == null) {
					break;
				}
				System.out.println(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("읽은 시간 : "+(end - start));
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch (Exception ex) {}
		}
	}
}
