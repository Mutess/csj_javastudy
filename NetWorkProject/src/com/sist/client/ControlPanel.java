package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	LocationPanel lp = new LocationPanel();
	HomePanel hp;
	AcommPanel ap = new AcommPanel();
	EnterPanel ep = new EnterPanel();
	DetailPanel dp;
	CardLayout card = new CardLayout();
	public ControlPanel() {
		hp = new HomePanel(this);
		dp = new DetailPanel(this);
		setLayout(card);
		add("home", hp);  //순서대로 화면을 넣어야함
		add("location", lp);
		add("enter", ep);
		add("acomm", ap);
		add("find", fp);
		add("news", np);
		add("chat", cp);
		add("detail", dp);
		
		
		
		
	}
}
