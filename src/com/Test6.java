package com;
import javax.swing.*;

public class Test6 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setLayout(null);  //ȡ��Ĭ�ϲ���
		JButton btn = new JButton("��ťpu");
		btn.setBounds(70, 70, 100, 60); //��x,y,width,height��
		frame.add(btn);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		

}
