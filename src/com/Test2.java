package com;

import javax.swing.*;
import java.awt.*;

public class Test2 {

    public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // ����������壬Ĭ��ʹ����ʽ����
        JPanel panel = new JPanel();
        //��ǩ����Ҫ��ʵ�ı���ͼƬ
        JLabel label01 = new JLabel();//ֻ��ʾ�ı�
        label01.setText("�ٺ�");
        label01.setFont(new Font(null, Font.PLAIN, 25));  // �������壬null ��ʾʹ��Ĭ������
        panel.add(label01);
        JLabel label02 = new JLabel();//ֻ��ʾͼƬ
        label02.setIcon(new ImageIcon("./src/com/sehun 1.PNG"));
        panel.add(label02);
        JLabel label03 = new JLabel();//ͬʱ��ʵ
        label03.setText("�ı���ͼƬ");
        label03.setIcon(new ImageIcon("./src/com/sehun2.PNG"));
        label03.setHorizontalTextPosition(SwingConstants.CENTER);   // ˮƽ�����ı���ͼƬ����
        label03.setVerticalTextPosition(SwingConstants.BOTTOM);     // ��ֱ�����ı���ͼƬ�·�
        panel.add(label03);

        jf.setContentPane(panel);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}

