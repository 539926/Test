package com;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeftPanel extends JPanel {
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	
	public LeftPanel() {
		initComponents();
		setVisible(true);
	}

	private void initComponents() {
		this.setLayout(null);
		
		btn1 = new JButton("菜单一");
		btn1.setBounds(10, 0, 80, 150);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				
				//获得内容中间容器
				CenterPanel jpCenter = main.getCenterPanel();
				
				//移除所有组件
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("菜单一"), BorderLayout.CENTER);
				
				//重新校验 控件是否有效
				jpCenter.revalidate();
				//重新绘制 CenterPanel
				jpCenter.repaint();
			}
			
		});
		
		btn2 = new JButton("菜单二");
		btn2.setBounds(10, 150, 80, 150);
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				
				//获得内容中间容器
				CenterPanel jpCenter = main.getCenterPanel();
				
				//移除所有组件
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("菜单二"), BorderLayout.CENTER);
				
				//重新校验 控件是否有效
				jpCenter.revalidate();
				//重新绘制 CenterPanel
				jpCenter.repaint();
			}
			
		});		
		
		
		btn3 = new JButton("菜单三");
		btn3.setBounds(10, 300, 80, 200);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				MainFrame main = SwingUtil.getMainframe();
				
				//获得内容中间容器
				CenterPanel jpCenter = main.getCenterPanel();
				
				//移除所有组件
				jpCenter.removeAll();
				
				jpCenter.setLayout(new BorderLayout());
				jpCenter.add(new JLabel("菜单三"), BorderLayout.CENTER);
				
				//重新校验 控件是否有效
				jpCenter.revalidate();
				//重新绘制 CenterPanel
				jpCenter.repaint();
			}
			
		});			
		
		add(btn1);
		add(btn2);
		add(btn3);
		
	}	
}
