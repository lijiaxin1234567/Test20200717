package com;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Test1 {
	public static void main(String[] args) {
		JFrame jframe=new JFrame("新窗口");//创建窗体有标题
		jframe.setLocation(200, 200);//设置位置
		jframe.setSize(1000,1000);//设置大小
		//设置流式布局
		jframe.setLayout(new FlowLayout());
		//frame.setBackground(Color.black);窗体不显示颜色
		//内容面板
		Container con=jframe.getContentPane();
		//在内容面板中添加组件
		 //添加文本
		JLabel username=new JLabel("用户名：");
		//username.setText("用户名：");
		JLabel image=new JLabel(new ImageIcon("./src/com/sehun 1.PNG"));//设置图片
		con.add(username);
		con.add(image);
		//添加文本框
		JTextField userName = new JTextField("ljx"); 
		System.out.println(userName.getText());    //得到文本框中的值
		con.add(userName);
		//设置文本域
		JTextArea textArea = new JTextArea(10,10); 
		textArea.setText("请阅读：");
		textArea.append("好好学习");  //追加文本
		con.add(textArea);
		//设置按钮
		JButton button = new JButton("添加");
		con.add(button);
		//设置复选框
		JCheckBox checkbox = new JCheckBox("电脑",true);
		System.out.println(checkbox.getText());
		con.add(checkbox);
		//设置单选按钮
		JRadioButton radio1 = new JRadioButton("男",true);
		con.add(radio1);
		JRadioButton radio2 = new JRadioButton("女",false);
		con.add(radio2);
		//设置单选按钮组
		ButtonGroup bg = new ButtonGroup();
		bg.add(radio1);
		bg.add(radio2);
		//设置下拉列表
		String [] items = {"选项一","选项二","选项三"};
		JComboBox<String> sel = new JComboBox<String>(items);
		sel.addItem("选项四");
		sel.setSelectedIndex(2);  //按索引设置默认项
		System.out.println(sel.getSelectedItem());
		con.add(sel);
		//设置表格
		//没有显示列名
		   /*String [] colName = {"姓名","性别","年龄","分数"};  //列名
		   String [][]  rowData = {{"张三","男","15","96"},{"张三","男","15","96"},{"张三","男","15","96"}};  //数据
		   JTable table = new JTable(rowData,colName);
		   con.add(table);*/
		String [] colName = {"姓名","性别","年龄","分数"}; 
		DefaultTableModel dt = new DefaultTableModel(colName,0);
		dt.addRow(new String[]{"张三","男","15","96"});
		dt.addRow(new String[]{"张三","男","15","96"});
		dt.addRow(new String[]{"张三","男","15","96"});
		dt.addRow(new String[]{"张三","男","15","96"});
		dt.addRow(new String[]{"张三","男","15","96"});
		JTable table = new JTable(dt);
		table.setRowHeight(60);
		JScrollPane jp = new JScrollPane(table);   //设置滚动面板
		jp.setPreferredSize(new Dimension(400, 200));  //设置滚动面板大小
		jframe.add(jp);  //在窗体中添加滚动面板
		
		JMenuBar menuBar=new JMenuBar();//创建菜单栏
	    //jframe.add(menuBar);
	    jframe.setJMenuBar(menuBar);//把菜单栏设置到窗口
	    JMenu fileMenu=new JMenu("文件");
	    JMenu editMenu=new JMenu("编辑");
	    JMenu viewMenu=new JMenu("视图");
	    JMenu helpMenu=new JMenu("帮助");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu); // 一级菜单添加到菜单栏
		//显示窗体
		jframe.setVisible(true);
		//窗口关闭
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
