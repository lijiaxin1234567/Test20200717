package com;
import javax.swing.*;
import java.awt.*;

public class Test8 {
	public static void main(String[] args) {
		JFrame jf=new JFrame("���Դ���");
		jf.setSize(300, 400);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 // ���� 3 �� 3 �� �����񲼾�
        GridLayout layout = new GridLayout(3, 3);
        // ���� ˮƽ �� ��ֱ ��϶
        layout.setHgap(10);
        layout.setVgap(10);
	}

}
