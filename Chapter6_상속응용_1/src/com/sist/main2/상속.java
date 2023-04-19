package com.sist.main2;

//상속   //상속을 해야 오버라이딩이 가능
import javax.swing.*;
import java.awt.*;
//생성자, 초기화 블록, static => 상속에서 제외
/*
 	class A
 	class B
 	
 	class B extends A == A > B
 	
 	class B
 	{
 		A a;
 	}==> B > A
 */

public class 상속 extends JFrame{ //window창  // 상속(is-a)는 class 상속보단 상속을 내려준 JFrame이 더 큼
	//시작하자마자 동작을 해야하면 생성자 사용
	JLabel la1, la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1, b2;
	public 상속() { //생성자
		la1 = new JLabel("아이디");
		la2 = new JLabel("비밀번호");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		setLayout(null);
		la1.setBounds(10, 15, 55, 30);
		la2.setBounds(10, 50, 55, 30);
		tf.setBounds(70, 15, 150, 30);
		pf.setBounds(70, 50, 150, 30);
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(10, 90, 210, 35);
		add(p);
		
		add(la1); add(tf);
		add(la2); add(pf);
		setSize(640, 480);
		setVisible(true); //자동로그인이 필요하면 
		
	}

	public static void main(String[] args) {
		상속  m = new 상속();
	}

}
