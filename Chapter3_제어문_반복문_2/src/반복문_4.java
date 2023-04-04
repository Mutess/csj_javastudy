/*
 * while문이 주로 사용되는 곳 (파일읽기, 네트워크 전송)
 */
import java.io.*;
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i = 0;
			FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\Chapter3_제어문_반복문_2\\src\\반복문_3.java");
			while ((i = fr.read())!=-1) { // -1 (EOF(end of file)) 파일종료
				System.out.print((char)i);
				//여기다가 네트워크 파일 전송 코드치면 파일이 전송됨
			}
		}catch(Exception ex){}

	}

}
