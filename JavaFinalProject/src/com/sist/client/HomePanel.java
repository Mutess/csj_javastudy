package com.sist.client;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;
import java.net.*;
import javax.swing.*;

import com.sist.common.ImageChange;
import com.sist.inter.HomeInterface;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;

public class HomePanel extends JPanel implements HomeInterface, MouseListener {
	PosterCard[] pcs = new PosterCard[20];
	JPanel pan = new JPanel();
	JButton b1, b2;
	JLabel pageLa;
	ControlPanel cp;
	MusicSystem ms = new MusicSystem();
	
	public HomePanel(ControlPanel cp)  {
		this.cp = cp;
		b1 = new JButton("이전");
		b2 = new JButton("다음");
		pageLa = new JLabel("0 page / 0 page");
		setLayout(null);
		pan.setLayout(new GridLayout(4,5,5,5)); //4줄 만들고 한줄에 5개씩 생성
		pan.setBounds(10, 15, 730, 700);
		add(pan);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(pageLa);
		p.add(b2);
		p.setBounds(10, 720, 730, 35);
		add(p);
	}

	public void CardPrint(List<GenieMusicVO> list) {
		int i = 0;
		for (GenieMusicVO vo:list) {
			pcs[i] = new PosterCard(vo);
			pan.add(pcs[i]);
			i++;
		}
		for (int j = 0; j<pcs.length;j++) {
			pcs[j].addMouseListener(this);
		}

	}
	public void cardInit(List<GenieMusicVO> list) {
//		for (int i = 0; i <list.size(); i++) {
//			pcs[i].poLa.setIcon(null);
//			pcs[i].tLa.setText("");
//		}
		pan.removeAll(); // 데이터 제거
		pan.validate();  // Panel 재배치
	}
	// 자동호출 => 콜백함수 (시스템에 의해 호출되는 메소드)

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i<pcs.length; i++) {
			if(e.getSource() == pcs[i]) {
//				JOptionPane.showMessageDialog(this, i+"번째 호출");
				String title = pcs[i].tLa.getText();
//				JOptionPane.showMessageDialog(this, title);
				GenieMusicVO vo = ms.musicDetailData(title);
				try {
					URL url = new URL("http:"+vo.getPoster());
					Image img = ImageChange.getImage(new ImageIcon(url), 530, 350);
					cp.dp.imgLa.setIcon(new ImageIcon(img));
					cp.dp.titleLa.setText(vo.getTitle());
					cp.dp.singerLa.setText(vo.getSinger());
					cp.dp.albumLa.setText(vo.getAlbum());
					cp.dp.stateLa.setText(vo.getState());
					cp.dp.crementLa.setText(vo.getIdcrement()==0?"":String.valueOf(vo.getIdcrement()));
					cp.dp.keyLa.setText(vo.getKey());
					cp.card.show(cp, "detail");
				} catch (Exception e2) {}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
