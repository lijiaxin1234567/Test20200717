package com;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Test3 {
	public static void main(String[] args) {
		//���񲼾�
		JFrame frame=new JFrame();
		frame.setSize(500, 500);
		frame.setLocation(200, 200);
		JPanel leftPanel=new JPanel();//���
		JPanel centerPanel = new JPanel();//�м�
		frame.add(leftPanel,BorderLayout.WEST);//��ӵ�������
		frame.add(centerPanel);
		//���,����һ��
		leftPanel.setLayout(new GridLayout(3,1)); //����������񲼾�
		JButton btnPrev=new JButton("ǰһ��");
		JButton btnNext=new JButton("��һ��");
		JButton btnThree=new JButton("������");
		leftPanel.add(btnPrev);//�Ѱ�ť���������
		leftPanel.add(btnNext);
		leftPanel.add(btnThree);		
		//�м�������,��Ϊ��Ƭ����
		CardLayout cl=new CardLayout(); //��Ƭ����
		centerPanel.setLayout(cl);   //�м������Ϊ��Ƭ����
		centerPanel.add(new JButton("A"),"1AAA");//���м������Ӱ�ť���ӱ�ǩ
		centerPanel.add(new JButton("B"),"2AAA");
		centerPanel.add(new JButton("C"),"3AAA");
		centerPanel.add(new JButton("D"),"4AAA");
		centerPanel.add(new JButton("E"),"5AAA");
		centerPanel.add(new JButton("F"),"6AAA");		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���������ڰ�ť�¼�������ڲ���
		class MyActionListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("ǰһ��")){//equals�Ƚ��ַ���
					cl.previous(centerPanel);//previous��ǰ��һ��
				}
				else if(e.getActionCommand().equals("��һ��")){
					cl.next(centerPanel);
				}
				else if(e.getActionCommand().equals("������")){
					cl.show(centerPanel, "3AAA");  //ָ����ʾ��һ��
				}
			}
		}
		
		MyActionListener listener = new MyActionListener();
		
		btnPrev.addActionListener(listener);
		btnNext.addActionListener(listener);
		btnThree.addActionListener(listener);
}
	
	

}
