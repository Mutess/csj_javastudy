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
	
	public List<TravelVO> travelListData(int page) {
		List<TravelVO> glist = new ArrayList<TravelVO>();
		int j = 0; //20개씩 나눠주는 변슈
		int rowsize = 20;
		int start = (page - 1) * rowsize;
		/*
				1page => 0~19
				2page => 20~39
				
				2page면 1page는 스킵
		 */
		for (int i = 0; i < list.size(); i++) {
			if (j < rowsize && i>=start) {
				glist.add(list.get(i));
				j++;
			}
		}
		return glist;
	}
	
	public int travelTotalPage() {
		return (int)(Math.ceil(list.size()/20.0));
	}
	public List<TravelVO> travelCategoryData(int cno) {
		List<TravelVO> slist = new ArrayList<TravelVO>();
		for (TravelVO vo : list) {
			if (vo.getCno() == cno) {
					slist.add(vo);
					//System.out.println(vo.getNo()+"."+vo.getTitle());
			}
		}
		return slist;
	}
	public List<TravelVO> travelFindData(String title) {
		List<TravelVO> slist = new ArrayList<TravelVO>();
		for (TravelVO vo : list) {
			if (vo.getTitle().contains(title)) {
				slist.add(vo);
			}
		}
		return slist;
	}
	public TravelVO travelDetailData(String title) {
		TravelVO vo = new TravelVO();
		for (TravelVO gvo:list) {
			if (gvo.getTitle().equals(title)) {
				vo = gvo;
				break;
			}
		}
		return vo;
	}
	public static void main(String[] args) {
		TravelSystem ts = new TravelSystem();
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("(1), (2), (3), (4), (5), (6) : ");
			String cno = in.readLine();
			ts.travelCategoryData(Integer.parseInt(cno)-1);
		} catch (Exception e) {}
	}
}

