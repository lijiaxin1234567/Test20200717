package com;

import javax.swing.*;
import java.awt.*;

public class Test2 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("测试窗口");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 创建内容面板，默认使用流式布局
        JPanel panel = new JPanel();
        //标签，主要现实文本或图片
        JLabel label01 = new JLabel();//只显示文本
        label01.setText("嘿嘿");
        label01.setFont(new Font(null, Font.PLAIN, 25));  // 设置字体，null 表示使用默认字体
        panel.add(label01);
        JLabel label02 = new JLabel();//只显示图片
        label02.setIcon(new ImageIcon("./src/com/sehun 1.PNG"));
        panel.add(label02);
        JLabel label03 = new JLabel();//同时现实
        label03.setText("文本和图片");
        label03.setIcon(new ImageIcon("./src/com/sehun2.PNG"));
        label03.setHorizontalTextPosition(SwingConstants.CENTER);   // 水平方向文本在图片中心
        label03.setVerticalTextPosition(SwingConstants.BOTTOM);     // 垂直方向文本在图片下方
        panel.add(label03);

        jf.setContentPane(panel);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}

