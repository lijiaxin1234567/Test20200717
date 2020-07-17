package com;
import javax.swing.*;

public class Test6 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(null);  //取消默认布局
		JButton btn = new JButton("按钮pu");
		btn.setBounds(70, 70, 100, 60); //（x,y,width,height）
		frame.add(btn);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		

}
