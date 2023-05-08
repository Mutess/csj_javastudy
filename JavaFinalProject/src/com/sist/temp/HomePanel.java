package com.sist.temp;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JPanel;

import com.sist.manager.GenieMusicVO;

public class HomePanel extends JPanel {
	PosterCard[] pcs = new PosterCard[20];
	JPanel pan = new JPanel();
	
	public void CardPrint(List<GenieMusicVO> list) {
		setLayout(null);
		pan.setLayout(new GridLayout(4,5,5,5)); //4줄 만들고 한줄에 5개씩 생성
		int i = 0;
		for (GenieMusicVO vo:list) {
			pcs[i] = new PosterCard(vo);
			pan.add(pcs[i]);
			i++;
		}
		pan.setBounds(10, 15, 730, 500);
		add(pan);
	}
	public void cardInit(List<GenieMusicVO> list) {
		for (int i = 0; i <list.size(); i++) {
			pcs[i].poLa.setIcon(null);
			pcs[i].tLa.setText("");
		}
		pan.removeAll(); // 데이터 제거
		pan.validate();  // Panel 재배치
	}
}
