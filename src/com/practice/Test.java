package com.practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {
	public static void main(String[] args) {
		JFrame jframe = new JFrame("Test");
		jframe.setSize(500, 500);
		jframe.setLocation(200,150);
		
		//选择对话框
		JButton button = new JButton("Test"); button.addActionListener(new
		ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) { 
			  // TODO Auto-generated method stub 
				Object[] sel = new Object[] {"苹果","香蕉","梨"}; 
				int input = JOptionPane.showOptionDialog(null, "请选择一项", "title",
							  JOptionPane.YES_NO_CANCEL_OPTION, 
							  JOptionPane.OK_CANCEL_OPTION, null, sel, sel[0]); 
				if(input >= 0) { 
					System.out.println(sel[input]); 
					} 
				} 
			}
		);
		 
		
		
		 /*//输入对话框，文本输入 
		 JButton button = new JButton("输入"); 
		 button.addActionListener(new ActionListener() {
		 	@Override public 
		 	void actionPerformed(ActionEvent e) { 
		 	// 显示输入对话框, 返回输入的内容
		 	String inputContent = JOptionPane.showInputDialog(jframe, "输入你的名字:", "");
		 	System.out.println("输入的内容: " + inputContent); 
		 	} 
		 	}
		 	);*/
		 
		//下拉框
		/*JButton button = new JButton("showInputDialog（下拉框选择）");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] selectionValues = new Object[]{"香蕉", "雪梨", "苹果"};

                // 显示输入对话框, 返回选择的内容, 点击取消或关闭, 则返回null
                Object inputContent = JOptionPane.showInputDialog(
                        jframe,
                        "选择一项: ",
                        "标题",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        selectionValues,
                        selectionValues[0]
                );
            }
        });*/
		
		//消息对话框
		/*JButton button = new JButton("消息");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 消息对话框无返回, 仅做通知作用
                JOptionPane.showMessageDialog(
                        jframe,
                        "Hello",
                        "消息标题",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });*/
		
		
		jframe.add(button);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
