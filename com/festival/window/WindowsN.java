package com.festival.window;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowsN extends JFrame {
    int width = Toolkit.getDefaultToolkit().getScreenSize().width;// 取得屏幕的宽度
    int height = Toolkit.getDefaultToolkit().getScreenSize().height - 50;// 取得屏幕的高度

    public void nationaldaywindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(width, height);
        setResizable(false);// 不可更改窗口大小
        JPanel panel = new ImagePanel();// 实例化
        panel.setBounds(0, 0, width, height);
        getContentPane().add(panel);
        setVisible(true);
    }

    class ImagePanel extends JPanel {
        public void paint(Graphics g) {// 绘制图像
            super.paint(g);
            ImageIcon icon = new ImageIcon("assets/nationalday.gif");
            g.drawImage(icon.getImage(), 0, 0, width, height, this);
        }
    }
}