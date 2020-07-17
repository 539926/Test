package com;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

//������
public class MainFrame extends JFrame{

	public static void main(String[] args) {
		new MainFrame();
	}
	
	private CenterPanel centerPanel = null;
	private LeftPanel leftPanel =null;
	
	public MainFrame(){
		
		setTitle("��ҵ2");
		setLocation(150, 150);;
		setSize(600, 500);
		
		//��ʼ������
		initPanel();
		
		//��ʼ�� �м�����
		initCenterPanel();
		
		SwingUtil.setMainframe(this);
		
		//��ʾ����
		setVisible(true);
		//���ڹر�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//���������м�����
	public CenterPanel getCenterPanel() {
		return centerPanel;
	}
	
	//��ʼ���м�����
	private void initCenterPanel() {
		centerPanel = new CenterPanel();
		JLabel title = new JLabel("����ҳ��");
		title.setFont(new Font(null, Font.PLAIN, 30));
		centerPanel.add(title);
		this.add(centerPanel, BorderLayout.CENTER);
	}
	
	//��ʼ������
	private void initPanel() {
		leftPanel = new LeftPanel();
		leftPanel.setPreferredSize(new Dimension(120,575));
		this.add(leftPanel,BorderLayout.WEST);
	}
	
}
