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
	        JFrame jf = new JFrame("测试窗口");
	        jf.setSize(300, 300);
	        jf.setLocationRelativeTo(null);
	        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	        // 创建 内容面板，使用 边界布局
	        JPanel panel = new JPanel(new BorderLayout());

	        // 创建 一个工具栏实例
	        JToolBar toolBar = new JToolBar("测试工具栏");

	        // 创建 工具栏按钮
	        JButton previousBtn = new JButton(new ImageIcon("./src/images/1_16.ico"));
	        JButton pauseBtn = new JButton(new ImageIcon("./src/images/1_16.ico"));

	        // 添加 按钮 到 工具栏
	        toolBar.add(previousBtn);
	        toolBar.add(pauseBtn);

	        // 创建一个文本区域，用于输出相关信息
	        final JTextArea textArea = new JTextArea();
	        textArea.setLineWrap(true);

	        // 添加 按钮 的点击动作监听器，并把相关信息输入到 文本区域
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
	        

	        // 添加 工具栏 到 内容面板 的 顶部
	        panel.add(toolBar, BorderLayout.PAGE_START);
	        // 添加 文本区域 到 内容面板 的 中间
	        panel.add(textArea, BorderLayout.CENTER);

	        jf.setContentPane(panel);
	        jf.setVisible(true);
	     }
}
