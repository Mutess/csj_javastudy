package com.sist.client;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import com.sist.common.ImageChange;
public class TopPanel extends JPanel{
	Image img;
	
	public TopPanel() {
		img = Toolkit.getDefaultToolkit().getImage("c:\\java_datas\\tp1.jpg");
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}
	
}
