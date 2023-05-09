package com.sist.client;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.util.List;
import java.net.*;
import java.awt.event.*;

import com.sist.common.ImageChange;
import com.sist.inter.FindInterface;
import com.sist.manager.*;
import com.sist.manager.TravelSystem;
public class FindPanel extends JPanel implements ActionListener, FindInterface {
	JTextField tf;
	JButton b1;
	JButton b2, b3, b4, b5, b6, b7;  //장르버튼
	JTable table;
	DefaultTableModel model;
	TravelSystem ts = new TravelSystem();
	
	public FindPanel() {
		//초기화
		tf = new JTextField();
		b1 = new JButton("검색");
		
		b2 = new JButton("명소");
		b3 = new JButton("자연");
		b4 = new JButton("엔터");
		b5 = new JButton("쇼핑");
		b6 = new JButton("음식");
		b7 = new JButton("호텔");
		
		
		//첫번째는 이미지
		String[] col = {"", "장소명", "설명"};
		Object[][] row = new Object[0][3];
		model = new DefaultTableModel(row,col) {
			
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Class<?> getColumnClass(int columnIndex) {
				// TODO Auto-generated method stub
				//이미지를 출력하기 때문에 사용
				return getValueAt(0, columnIndex).getClass();
				
			}
			
		};
		table = new JTable(model);
		//출력위치 길이 설정
		table.setRowHeight(100); //타이틀바를 고정시키는 용도
		table.getTableHeader().setReorderingAllowed(false); //이동을 못하게 만듦 
		JScrollPane js = new JScrollPane(table);
		
		//배치 750 730
		setLayout(null);
		tf.setBounds(10, 15, 300, 30);
		b1.setBounds(315, 15, 100, 30);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3,5,5));
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);

		p.setBounds(10, 55, 700, 35);
		add(p);
		
		js.setBounds(10, 100, 700, 600);
		add(tf);
		add(b1);
		add(p);
		add(js);
		try {
			List<TravelVO> list = ts.travelCategoryData(1);
			for (TravelVO vo : list) {
				URL url = new URL(vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 150, 150);
				Object[] data = {
					new ImageIcon(img),
					vo.getTitle(),
					vo.getContents(),
					vo.getPoster()
				};
				model.addRow(data);
			}
		} catch (Exception ex) {}
		
		b1.addActionListener(this);
		
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		tf.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b2) {
			findPrint(1);
			//스크롤 초기화
		}
		else if(e.getSource() == b3) {
			findPrint(2);
		}
		else if(e.getSource() == b4) {
			findPrint(3);
		}
		else if(e.getSource() == b5) {
			findPrint(4);
		}
		else if(e.getSource() == b6) {
			findPrint(5);
		}
		else if(e.getSource() == b7) {
			findPrint(6);
		}

		else if (e.getSource() == b1 || e.getSource() == tf) {  //검색버튼이나 엔터를 쳐도 되게 만둘
			String title = tf.getText();
			if (title.length() < 1) {
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요");
				tf.requestFocus();
				return;
			}
			findPrint2(title);
		}
	}
	public void findPrint(int cno) {
		for (int i = model.getRowCount()-1; i >= 0; i--) {  //뒤에서부터 지워나가야지만 끝까지 지워짐 //이건 뒤에서부터 지우는 방법
			model.removeRow(i);
		}
		try {
			List<TravelVO> list = ts.travelCategoryData(cno);
			for (TravelVO vo : list) {
				URL url = new URL(vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 150, 150);
				Object[] data = {
					new ImageIcon(img),
					vo.getTitle(),
					vo.getContents(),
					vo.getPoster()
				};
				model.addRow(data);
			}
		} catch (Exception ex) {}
	}
	public void findPrint2(String title) {
		for (int i = model.getRowCount()-1; i >= 0; i--) {  //뒤에서부터 지워나가야지만 끝까지 지워짐 //이건 뒤에서부터 지우는 방법
			model.removeRow(i);
		}
		try {
			List<TravelVO> list = ts.travelFindData(title);
			for (TravelVO vo : list) {
				URL url = new URL(vo.getPoster());
				Image img = ImageChange.getImage(new ImageIcon(url), 150, 150);
				Object[] data = {
					new ImageIcon(img),
					vo.getTitle(),
					vo.getContents(),
					vo.getPoster()
				};
				model.addRow(data);
			}
		} catch (Exception ex) {}
	}
}
