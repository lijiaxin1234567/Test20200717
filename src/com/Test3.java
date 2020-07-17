package com;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test3 {
	public static void main(String[] args) {
		//网格布局
		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setLocation(200, 200);
		JPanel leftPanel=new JPanel();//左侧
		JPanel centerPanel = new JPanel();//中间
		frame.add(leftPanel,BorderLayout.WEST);//添加到左侧面板
		frame.add(centerPanel);
		//左侧,三行一列
		leftPanel.setLayout(new GridLayout(3,1)); //左侧设置网格布局
		JButton btnPrev=new JButton("前一个");
		JButton btnNext=new JButton("后一个");
		JButton btnThree=new JButton("第三个");
		leftPanel.add(btnPrev);//把按钮放在面板上
		leftPanel.add(btnNext);
		leftPanel.add(btnThree);		
		//中间的主面板,设为卡片布局
		CardLayout cl=new CardLayout(); //卡片布局
		centerPanel.setLayout(cl);   //中间面板设为卡片布局
		centerPanel.add(new JButton("A"),"1AAA");//给中间面板添加按钮，加标签
		centerPanel.add(new JButton("B"),"2AAA");
		centerPanel.add(new JButton("C"),"3AAA");
		centerPanel.add(new JButton("D"),"4AAA");
		centerPanel.add(new JButton("E"),"5AAA");
		centerPanel.add(new JButton("F"),"6AAA");		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//监听，用于按钮事件处理的内部类
		class MyActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("前一个")){//equals比较字符串
					cl.previous(centerPanel);//previous往前翻一个
				}
				else if(e.getActionCommand().equals("后一个")){
					cl.next(centerPanel);
				}
				else if(e.getActionCommand().equals("第三个")){
					cl.show(centerPanel, "3AAA");  //指定显示哪一个
				}
			}
		}
		
		MyActionListener listener = new MyActionListener();
		
		btnPrev.addActionListener(listener);
		btnNext.addActionListener(listener);
		btnThree.addActionListener(listener);
}
	
	

}
