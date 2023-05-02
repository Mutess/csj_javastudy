package com.sist.io;
/*
		FileInputStream : 단위 byte (1byte씩 읽어온다)
			=> 한글포함된 데이터는 읽을 수 있는데 한글이 깨진다.
			   ------------ FileReader
			   .zip, .ppt, .png... => 업로드 / 다운로드
			   ---------------- 웹에서 자료실, 갤러리 게시판 만들기 가능
		 	=> 주요 메소드
		 		read() => 1byte => 리턴형 => int
		 		close() 닫기
		 	=> 생성자
		 	 	new FileInputStream(File file)
		 	 	new FileInputStream(String path)
 */

import java.io.FileInputStream;
import java.io.FileReader;
// 파일은 모든게 CheckedException이라서 무조건 다 예외처리
import java.util.*;

public class FileInputStream_1 {

	public static void main(String[] args) {
/*		try {
			FileInputStream fis = new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\FileInputStream_1.java");
			int i = 0; //한개의 문자를 읽어옴 //문자번호를 넘겨줌 // 문자번호를 받는 변수
			while ((i=fis.read())!= -1) { //-1은 더 이상 읽을 데이터가 없을때까지 => EOF (End Of File) == -1
				System.out.print((char)i); // char로 형변환을 시켜야 글자가 나옴
			}
		}catch (Exception ex) {} */
		
		try {
			FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\inputOutputMain.java");
			int i = 0; //한개의 문자를 읽어옴 //문자번호를 넘겨줌 // 문자번호를 받는 변수
			while ((i=fr.read())!= -1) { //-1은 더 이상 읽을 데이터가 없을때까지 => EOF (End Of File) == -1
				System.out.print((char)i); // char로 형변환을 시켜야 글자가 나옴
			}
		}catch (Exception ex) {}
		
	}
}
