package com.sist.main2;
//포함  
import javax.swing.*;
public class 포함 { //포함은 (has-a)는 class 포함이 더 큼 
	JFrame f = new JFrame(); //필요한 클래스를 가져다가 씀 //포함클래스
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	
	public 포함() { // 생성자
		la1 = new JLabel("아이디");
		la2 = new JLabel("비밀번호");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		f.setLayout(null);
		la1.setBounds(10, 15, 55, 30);
		la2.setBounds(10, 50, 55, 30);
		tf.setBounds(70, 15, 150, 30);
		pf.setBounds(70, 50, 150, 30);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 90, 210, 35);
		f.add(p);
		
		f.add(la1); f.add(tf);
		f.add(la2); f.add(pf);
		
		f.setSize(640, 480);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		new 포함(); //생성자 호출은 ==> new
	}

}
