package com;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Test1 {
	public static void main(String[] args) {
		JFrame jframe=new JFrame("�´���");//���������б���
		jframe.setLocation(200, 200);//����λ��
		jframe.setSize(1000,1000);//���ô�С
		//������ʽ����
		jframe.setLayout(new FlowLayout());
		//frame.setBackground(Color.black);���岻��ʾ��ɫ
		//�������
		Container con=jframe.getContentPane();
		//�����������������
		 //����ı�
		JLabel username=new JLabel("�û�����");
		//username.setText("�û�����");
		JLabel image=new JLabel(new ImageIcon("./src/com/sehun 1.PNG"));//����ͼƬ
		con.add(username);
		con.add(image);
		//����ı���
		JTextField userName = new JTextField("ljx"); 
		System.out.println(userName.getText());    //�õ��ı����е�ֵ
		con.add(userName);
		//�����ı���
		JTextArea textArea = new JTextArea(10,10); 
		textArea.setText("���Ķ���");
		textArea.append("�ú�ѧϰ");  //׷���ı�
		con.add(textArea);
		//���ð�ť
		JButton button = new JButton("���");
		con.add(button);
		//���ø�ѡ��
		JCheckBox checkbox = new JCheckBox("����",true);
		System.out.println(checkbox.getText());
		con.add(checkbox);
		//���õ�ѡ��ť
		JRadioButton radio1 = new JRadioButton("��",true);
		con.add(radio1);
		JRadioButton radio2 = new JRadioButton("Ů",false);
		con.add(radio2);
		//���õ�ѡ��ť��
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		//���������б�
		String [] items = {"ѡ��һ","ѡ���","ѡ����"};
		JComboBox<String> sel = new JComboBox<String>(items);
		sel.addItem("ѡ����");
		sel.setSelectedIndex(2);  //����������Ĭ����
		System.out.println(sel.getSelectedItem());
		con.add(sel);
		//���ñ��
		//û����ʾ����
		   /*String [] colName = {"����","�Ա�","����","����"};  //����
		   String [][]  rowData = {{"����","��","15","96"},{"����","��","15","96"},{"����","��","15","96"}};  //����
		   JTable table = new JTable(rowData,colName);
		   con.add(table);*/
		String [] colName = {"����","�Ա�","����","����"}; 
		DefaultTableModel dt = new DefaultTableModel(colName,0);
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		dt.addRow(new String[]{"����","��","15","96"});
		JTable table = new JTable(dt);
		table.setRowHeight(60);
		JScrollPane jp = new JScrollPane(table);   //���ù������
		jp.setPreferredSize(new Dimension(400, 200));  //���ù�������С
		jframe.add(jp);  //�ڴ�������ӹ������
		
		JMenuBar menuBar=new JMenuBar();//�����˵���
	    //jframe.add(menuBar);
	    jframe.setJMenuBar(menuBar);//�Ѳ˵������õ�����
	    JMenu fileMenu=new JMenu("�ļ�");
	    JMenu editMenu=new JMenu("�༭");
	    JMenu viewMenu=new JMenu("��ͼ");
	    JMenu helpMenu=new JMenu("����");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu); // һ���˵���ӵ��˵���
		//��ʾ����
		jframe.setVisible(true);
		//���ڹر�
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
