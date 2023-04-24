package com.sist.exception;
/*
 		Checked Exception
 */
import java.io.*;
public class 예외처리_예외복구_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
/*		FileReader fr = null; //무조건 초기화 값을 null값으로 //지역변수의 일종임
		
		try {
			fr = new FileReader("C:\\javaDev\\javaStudy\\Chapter8_예외처리_2\\src\\com\\sist\\exception\\예외처리_예외복구_1.java"); //얘는 무조건 try-catch안에다가 넣어놔야댐
			while((i=fr.read())!= -1) {
				System.out.print((char)i);
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();  // 파일이나 연결을 닫을때도 try-catch문으로 닫아야함
			}catch (IOException e) {
				
			}
		} */
		// resourse - with => fr을 자동으로 닫는다 (finally를 사용하지 않는다.)
		try (FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\Chapter8_예외처리_2\\src\\com\\sist\\exception\\예외처리_예외복구_1.java")) {
			 i = 0;
			 while ((i=fr.read()) != -1) {
				 System.out.print((char)i);
			 }
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
