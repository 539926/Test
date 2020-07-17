package com.practice;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

public class ToolBar {
	 public static void main(String[] args) {
	        JFrame jf = new JFrame("���Դ���");
	        jf.setSize(300, 300);
	        jf.setLocationRelativeTo(null);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        // ���� ������壬ʹ�� �߽粼��
	        JPanel panel = new JPanel(new BorderLayout());

	        // ���� һ��������ʵ��
	        JToolBar toolBar = new JToolBar("���Թ�����");

	        // ���� ��������ť
	        JButton previousBtn = new JButton(new ImageIcon("./src/images/1_16.ico"));
	        JButton pauseBtn = new JButton(new ImageIcon("./src/images/1_16.ico"));

	        // ��� ��ť �� ������
	        toolBar.add(previousBtn);
	        toolBar.add(pauseBtn);

	        // ����һ���ı�����������������Ϣ
	        final JTextArea textArea = new JTextArea();
	        textArea.setLineWrap(true);

	        // ��� ��ť �ĵ�����������������������Ϣ���뵽 �ı�����
	        previousBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                textArea.append("1\n");
	            }
	        });
	        pauseBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                textArea.append("2\n");
	            }
	        });
	        

	        // ��� ������ �� ������� �� ����
	        panel.add(toolBar, BorderLayout.PAGE_START);
	        // ��� �ı����� �� ������� �� �м�
	        panel.add(textArea, BorderLayout.CENTER);

	        jf.setContentPane(panel);
	        jf.setVisible(true);
	     }
}
