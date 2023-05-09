package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	RecommandPanel rp = new RecommandPanel();
	HomePanel hp;
	DetailPanel dp;
	CardLayout card = new CardLayout();
	public ControlPanel() {
		hp = new HomePanel(this);
		dp = new DetailPanel(this);
		setLayout(card);
		add("home", hp);  //순서대로 화면을 넣어야함
		add("news", np);
		// @RequestMapping("main/main.do")
		add("chat", cp);
		add("find", fp);
		add("recomm", rp);
		add("detail", dp);
	}
}
