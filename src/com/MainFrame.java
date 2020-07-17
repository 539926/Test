package com;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

//主窗体
public class MainFrame extends JFrame{

	public static void main(String[] args) {
		new MainFrame();
	}
	
	private CenterPanel centerPanel = null;
	private LeftPanel leftPanel =null;
	
	public MainFrame(){
		
		setTitle("作业2");
		setLocation(150, 150);;
		setSize(600, 500);
		
		//初始化容器
		initPanel();
		
		//初始化 中间容器
		initCenterPanel();
		
		SwingUtil.setMainframe(this);
		
		//显示窗体
		setVisible(true);
		//窗口关闭
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//返回内容中间容器
	public CenterPanel getCenterPanel() {
		return centerPanel;
	}
	
	//初始化中间容器
	private void initCenterPanel() {
		centerPanel = new CenterPanel();
		JLabel title = new JLabel("大大的页面");
		title.setFont(new Font(null, Font.PLAIN, 30));
		centerPanel.add(title);
		this.add(centerPanel, BorderLayout.CENTER);
	}
	
	//初始化容器
	private void initPanel() {
		leftPanel = new LeftPanel();
		leftPanel.setPreferredSize(new Dimension(120,575));
		this.add(leftPanel,BorderLayout.WEST);
	}
	
}
