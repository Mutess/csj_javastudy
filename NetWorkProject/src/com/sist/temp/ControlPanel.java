package com.sist.temp;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	LocationPanel lp = new LocationPanel();
	HomePanel hp = new HomePanel();
	Acomm ap = new Acomm();
	EnterPanel ep = new EnterPanel();
	CardLayout card = new CardLayout();
	public ControlPanel() {
		setLayout(card);
		add("Home", hp);  //순서대로 화면을 넣어야함
		add("location", lp);
		add("enter", ep);
		add("acomm", ap);
		add("find", fp);
		add("news", np);
		add("chat", cp);
		
		
		
		
	}
}
