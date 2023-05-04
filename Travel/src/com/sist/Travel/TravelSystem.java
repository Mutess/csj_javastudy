package com.sist.Travel;

import java.io.*;

import java.util.*;
public class TravelSystem {
private static List<TravelVO> list = new ArrayList<TravelVO>();
	static {

		//초기화블럭 GenieMusicVO에 값을 채워넣어야함

		FileInputStream fis = null;

		ObjectInputStream ois = null;

		

		 try {

			 fis = new FileInputStream("c:\\java_datas\\travel.txt");

			 ois = new ObjectInputStream(fis);

			 list = (List<TravelVO>)ois.readObject();	//읽어온 데이터 넘겨줌_채워주기

		} catch (Exception e) {

			e.printStackTrace();

			

		} 

		 

		 finally {

			try {

				fis.close();

				ois.close();

			} catch (Exception e2) {

				// TODO: handle exception

			}

		}	

	}

	public void musicCategoryData(int cno) {

		for(TravelVO vo : list) {

			if(vo.getCno() == cno) {

				System.out.println(vo.getNo() + "." + vo.getTitle());

			}

		}

	}

	

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		TravelSystem ms = new TravelSystem();

		try {

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("가요(1), POP(2), OST(3), 트롯(4), JAZZ(5), CLASSIC(6): ");

			String cno = in.readLine();

			ms.musicCategoryData(Integer.parseInt(cno)-1);

		} catch (Exception e) {

			

		}

	}
}
