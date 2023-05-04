package com.sist.manager;

import java.io.*;
import java.util.*;

public class TravelSystem {
	private static List<TravelVO> list = new ArrayList<TravelVO>();
	static {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:\\java_datas\\Travel.txt");
			ois = new ObjectInputStream(fis);
			list = (List<TravelVO>)ois.readObject();
		}catch (Exception ex) {
			ex.printStackTrace();
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (Exception ex) {}
		}
	}
	
	public List<TravelVO> seoulCategoryData(int cno) {
		List<TravelVO> slist = new ArrayList<TravelVO>();
		for (TravelVO vo : list) {
			if (vo.getCno() == cno) {
				if (vo.getCno() == cno) {
					slist.add(vo);
					//System.out.println(vo.getNo()+"."+vo.getTitle());
				}
			}
		}
		return slist;
	}
	public List<TravelVO> seoulFindData(String title) {
		List<TravelVO> slist = new ArrayList<TravelVO>();
		for (TravelVO vo : list) {
			if (vo.getTitle().contains(title)) {
				slist.add(vo);
			}
		}
		return slist;
	}
	public static void main(String[] args) {
		TravelSystem ts = new TravelSystem();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("가요(1), POP(2), OST(3), 트롯(4), JAZZ(5), CLASSIC(6) : ");
			String cno = in.readLine();
			ts.seoulCategoryData(Integer.parseInt(cno)-1);
		} catch (Exception e) {}
	}
}

