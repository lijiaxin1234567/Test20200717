package com;
import javax.swing.*;

import java.awt.*;
public class Hw {
	public static void main(String[] args) {
		JFrame jframe=new JFrame("���Դ���");//���������б���
		jframe.setLocation(200, 200);//����λ��
		jframe.setSize(500,500);//���ô�С
		
        
        JPanel centerPanel = new JPanel();
        JPanel panel_east=new JPanel();//�����Ҳ����
        panel_east.setLayout(null);
		centerPanel.setLayout(null);
		panel_east.setPreferredSize(new Dimension(250, 200));
        ImageIcon image = new ImageIcon("./src/com/sehun 1.PNG");
        image.setImage(image.getImage().getScaledInstance(190, 260,
				Image.SCALE_AREA_AVERAGING));
		JLabel jimage = new JLabel();
		jimage.setIcon(image);
		jframe.add(panel_east, BorderLayout.WEST);
		jimage.setBounds(0, 0, 200, 300);
		panel_east.add(jimage);
  
        jframe.add(centerPanel);
        JLabel userName1 = new JLabel("ѧ�ţ�"); //����ı�
        JLabel userName2 = new JLabel("������");
        JLabel userName3 = new JLabel("סַ��");
        JLabel userName4 = new JLabel("���䣺");
        JLabel userName5 = new JLabel("�ֻ���");
        JLabel userName6 = new JLabel("�Ա�");
        
        //���õ�ѡ��ť
      	JRadioButton radio1 = new JRadioButton("��",true);
      	JRadioButton radio2 = new JRadioButton("Ů",false);
      	//���õ�ѡ��ť��
      	ButtonGroup bg = new ButtonGroup();
      	bg.add(radio1);
      	bg.add(radio2);
      	userName1.setBounds(100, 50, 50, 50);
        userName2.setBounds(100, 80, 50, 50);
        userName3.setBounds(100, 145, 50, 50);
        userName4.setBounds(100, 175, 50, 50);
        userName5.setBounds(100, 205, 50, 50);
        userName6.setBounds(100, 115, 50, 50);
      	radio1.setBounds(150, 130, 50, 20);
		radio2.setBounds(200, 130, 50, 20);
      	
      	JTextField jf1 = new JTextField(10);//�����ı���
		JTextField jf2 = new JTextField(10);
		JTextField jf3 = new JTextField(10);
		JTextField jf4 = new JTextField(10);
		JTextField jf5 = new JTextField(10);
		jf1.setBounds(150, 65, 150, 20);
		jf2.setBounds(150, 95, 150, 20);
		jf3.setBounds(150, 160, 150, 20);
		jf4.setBounds(150, 190, 150, 20);
		jf5.setBounds(150, 220, 150, 20);
		
		JButton jb1 = new JButton("���ͼƬ");//��Ӱ�ť
		JButton jb2 = new JButton("���Ӽ�¼");
		JButton jb3 = new JButton("�޸ļ�¼");
		JButton jb4 = new JButton("ɾ����¼");
		jb1.setBounds(0, 300, 90, 30);
		jb2.setBounds(120, 300, 90, 30);
		jb3.setBounds(240, 300, 90, 30);
		jb4.setBounds(360, 300, 90, 30);
        
		centerPanel.add(userName1);
		centerPanel.add(userName2);
		centerPanel.add(userName3);
		centerPanel.add(userName4);
		centerPanel.add(userName5);
		centerPanel.add(userName6);
		centerPanel.add(jf1);
		centerPanel.add(jf2);
		centerPanel.add(jf3);
		centerPanel.add(jf4);
		centerPanel.add(jf5);
		centerPanel.add(radio1);
		centerPanel.add(radio2);
		centerPanel.add(jb1);
		centerPanel.add(jb2);
		centerPanel.add(jb3);
		centerPanel.add(jb4);
	
		jframe.setVisible(true);//��ʾ����
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���ڹر�
	    JMenuBar menuBar=new JMenuBar();//�����˵���
	    jframe.setJMenuBar(menuBar);//�Ѳ˵������õ�����
	    JMenu fileMenu=new JMenu("�ļ�");
	    JMenu editMenu=new JMenu("�༭");
	    JMenu viewMenu=new JMenu("��ͼ");
	    JMenu helpMenu=new JMenu("����");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu); // һ���˵���ӵ��˵���
	
	
	
	}

}
