package com.sist.client;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel {
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	HomePanel hp;
	DetailPanel dp;
	BoardListPanel bp;
	BoardInsertPanel ip;
	BoardDetailPanel bdp;
	CardLayout card = new CardLayout();
	public ControlPanel() {
		hp = new HomePanel(this);
		dp = new DetailPanel(this);
		bp = new BoardListPanel(this);
		ip = new BoardInsertPanel(this);
		bdp = new BoardDetailPanel(this);
		setLayout(card);
		add("home", hp);  //순서대로 화면을 넣어야함
		add("news", np);
		// @RequestMapping("main/main.do")
		add("chat", cp);
		add("find", fp);
		add("detail", dp);
		add("board",bp);
		add("insert", ip);
		add("bdp", bdp);
	}
}
