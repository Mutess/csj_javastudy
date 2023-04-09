import java.io.FileReader;

public class 파일읽기 {
	public static void main(String[] args) {
		System.out.println("페이지읽기");
		try {
			//FileWriter = 파일 쓰기 ,, FileReader = 파일읽기
			FileReader fr = new FileReader("C:\\javaDev\\javaStudy\\2주차정리\\src\\제어문정리_2.java");
			int i = 0;
			while ((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception ex) {}
	}
}
