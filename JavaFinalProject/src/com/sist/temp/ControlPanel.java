package com.sist.temp;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	RecommandPanel rp = new RecommandPanel();
	HomePanel hp = new HomePanel();
	CardLayout card = new CardLayout();
	public ControlPanel() {
		setLayout(card);
		add("Home", hp);  //순서대로 화면을 넣어야함
		add("news", np);
		add("chat", cp);
		add("find", fp);
		add("recomm", rp);
	}
}
