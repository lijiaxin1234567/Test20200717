package com;
import javax.swing.*;

import java.awt.*;
public class Test5 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.add(new JButton("��ť1"),BorderLayout.SOUTH);   //�˲���ʧЧ
		frame.add(new JButton("��ť2"));
		frame.add(new JButton("��ť3"));
		frame.add(new JButton("��ť4"));
		frame.add(new JButton("��ť5"));
		frame.add(new JButton("��ť6"));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
