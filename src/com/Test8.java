package com;
import javax.swing.*;
import java.awt.*;

public class Test8 {
	public static void main(String[] args) {
		JFrame jf=new JFrame("测试窗口");
		jf.setSize(300, 400);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 // 创建 3 行 3 列 的网格布局
        GridLayout layout = new GridLayout(3, 3);
        // 设置 水平 和 竖直 间隙
        layout.setHgap(10);
        layout.setVgap(10);
	}

}
