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
		JFrame jframe = new JFrame("�ɴ���");
		jframe.setLocation(200, 200);
        jframe.setSize(400, 400);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton btn = new JButton("�����´���");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // �����ť, ��ʾ�µ�һ������
                showNewWindow(jframe);
            }
        });
        panel.add(btn);

        jframe.setContentPane(panel);
        jframe.setVisible(true);
    }

    public static void showNewWindow(JFrame relativeWindow) {
        // ����һ���´���
        JFrame newJFrame = new JFrame("�´���");
        newJFrame.setSize(250, 250);
        newJFrame.setLocation(250, 250);
        newJFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        // ��������Ϊ���ɸı��С
        newJFrame.setResizable(false);

        JPanel panel = new JPanel(new FlowLayout());

        // ���´�������ʾһ����ǩ
        JLabel label = new JLabel("�����´���");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        panel.add(label);

        newJFrame.setContentPane(panel);
        newJFrame.setVisible(true);

	}
}
