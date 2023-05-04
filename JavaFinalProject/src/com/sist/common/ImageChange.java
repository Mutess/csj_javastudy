package com.sist.common;

import java.awt.*;
import javax.swing.ImageIcon;

public class ImageChange {
	public static Image getImage(ImageIcon ii, int width, int height) {
		Image deImg = ii.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return deImg;
	}
}
