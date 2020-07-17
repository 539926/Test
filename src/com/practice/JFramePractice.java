package com.practice;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JFramePractice {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("旧窗口");
		jframe.setLocation(200, 200);
        jframe.setSize(400, 400);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btn = new JButton("创建新窗口");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 点击按钮, 显示新的一个窗口
                showNewWindow(jframe);
            }
        });
        panel.add(btn);

        jframe.setContentPane(panel);
        jframe.setVisible(true);
    }

    public static void showNewWindow(JFrame relativeWindow) {
        // 创建一个新窗口
        JFrame newJFrame = new JFrame("新窗口");
        newJFrame.setSize(250, 250);
        newJFrame.setLocation(250, 250);
        newJFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // 窗口设置为不可改变大小
        newJFrame.setResizable(false);

        JPanel panel = new JPanel(new FlowLayout());

        // 在新窗口中显示一个标签
        JLabel label = new JLabel("这是新窗口");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        panel.add(label);

        newJFrame.setContentPane(panel);
        newJFrame.setVisible(true);

	}
}
