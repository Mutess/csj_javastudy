package com.sist.io;
import java.util.*;
import java.io.*;
public class FileOutputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//파일 지정
			File file = new File("c:\\\\java_datas\\\\school.txt");
			if (!file.exists()) { //file 존재여부 확인
				file.createNewFile(); //파일 만들기
			}
			//파일이 존재할때 사용
			FileOutputStream fos = new FileOutputStream("c:\\java_datas\\school.txt", true); //그래서 여기다가 true를 줘야 덧붙혀짐
			String msg = "안녕하세요 지금은 파일입출력을 하고 있습니다.\r\n";
			//System.out.println((int)'안');
			fos.write(msg.getBytes()); //얘는 파일을 덧붙이히는 것이 아닌 파일을 새로 만드는 것 //그래서 파일을 수정해도 이걸 실행하면 다 날라가고 새롭게 생김
			// String ==> byte[]로 변경 ==>  getBytes()
			fos.close();
			System.out.println("저장 완료");
		}catch(Exception ex) {}
	}

}
