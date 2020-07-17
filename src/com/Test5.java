package com;
import javax.swing.*;

import java.awt.*;
public class Test5 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("按钮1"),BorderLayout.SOUTH);   //此布局失效
		frame.add(new JButton("按钮2"));
		frame.add(new JButton("按钮3"));
		frame.add(new JButton("按钮4"));
		frame.add(new JButton("按钮5"));
		frame.add(new JButton("按钮6"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
