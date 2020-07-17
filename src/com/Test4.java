package com;
import javax.swing.*;

import java.awt.*;
public class Test4 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		//±ß½ç²¼¾Ö
		frame.setLayout(new BorderLayout());
		frame.add(new JButton("1"),BorderLayout.SOUTH);
		frame.add(new JButton("2"),BorderLayout.NORTH);
		frame.add(new JButton("3"),BorderLayout.EAST);
		frame.add(new JButton("4"),"West");
		frame.add(new JButton("5"),BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
