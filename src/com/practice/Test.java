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
		
		//ѡ��Ի���
		JButton button = new JButton("Test"); button.addActionListener(new
		ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) { 
			  // TODO Auto-generated method stub 
				Object[] sel = new Object[] {"ƻ��","�㽶","��"}; 
				int input = JOptionPane.showOptionDialog(null, "��ѡ��һ��", "title",
							  JOptionPane.YES_NO_CANCEL_OPTION, 
							  JOptionPane.OK_CANCEL_OPTION, null, sel, sel[0]); 
				if(input >= 0) { 
					System.out.println(sel[input]); 
					} 
				} 
			}
		);
		 
		
		
		 /*//����Ի����ı����� 
		 JButton button = new JButton("����"); 
		 button.addActionListener(new ActionListener() {
		 	@Override public 
		 	void actionPerformed(ActionEvent e) { 
		 	// ��ʾ����Ի���, �������������
		 	String inputContent = JOptionPane.showInputDialog(jframe, "�����������:", "");
		 	System.out.println("���������: " + inputContent); 
		 	} 
		 	}
		 	);*/
		 
		//������
		/*JButton button = new JButton("showInputDialog��������ѡ��");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] selectionValues = new Object[]{"�㽶", "ѩ��", "ƻ��"};

                // ��ʾ����Ի���, ����ѡ�������, ���ȡ����ر�, �򷵻�null
                Object inputContent = JOptionPane.showInputDialog(
                        jframe,
                        "ѡ��һ��: ",
                        "����",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        selectionValues,
                        selectionValues[0]
                );
            }
        });*/
		
		//��Ϣ�Ի���
		/*JButton button = new JButton("��Ϣ");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ��Ϣ�Ի����޷���, ����֪ͨ����
                JOptionPane.showMessageDialog(
                        jframe,
                        "Hello",
                        "��Ϣ����",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });*/
		
		
		jframe.add(button);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
