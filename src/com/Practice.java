package com;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

public class Practice {
	public static void main(String[] args) {
		/*
		 * JFrame jframe = new JFrame("�û���¼");
		 * jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 * 
		 * // �� 1 �� JPanel, ʹ��Ĭ�ϵĸ������� JPanel panel01 = new JPanel(); panel01.add(new
		 * JLabel("�û���")); panel01.add(new JTextField(10));
		 * 
		 * // �� 2 �� JPanel, ʹ��Ĭ�ϵĸ������� JPanel panel02 = new JPanel(); panel02.add(new
		 * JLabel("��   ��")); panel02.add(new JPasswordField(10));
		 * 
		 * // �� 3 �� JPanel, ʹ�ø�������, �������������������ʾ JPanel panel03 = new JPanel(new
		 * FlowLayout(FlowLayout.CENTER)); panel03.add(new JButton("��¼"));
		 * panel03.add(new JButton("ע��"));
		 * 
		 * // ����һ����ֱ��������, ������ 3 �� JPanel ��������Ϊ���������ӵ����� Box vBox =
		 * Box.createVerticalBox(); vBox.add(panel01); vBox.add(panel02);
		 * vBox.add(panel03);
		 * 
		 * jframe.setContentPane(vBox);
		 * 
		 * jframe.pack(); jframe.setLocationRelativeTo(null);
		 * jframe.setVisible(true);
		 */
		
		
		/*
		 * //������� JFrame jframe = new JFrame("���������Դ���"); jframe.setSize(400, 400);
		 * jframe.setLocationRelativeTo(null);
		 * jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		 * 
		 * // �����ı�������� JTextArea textArea = new JTextArea();
		 * textArea.setLineWrap(false);// ���Զ�����
		 * 
		 * // �����������, ��ֱ��������ˮƽ������һֱ��ʾ JScrollPane scrollPane = new JScrollPane(
		 * textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
		 * ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );
		 * jframe.setContentPane(scrollPane);
		 */
		
		/*//ѡ����
		JFrame jframe = new JFrame("ѡ������Դ���");
        jframe.setSize(300, 300);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);

        // ����ѡ����
        final JTabbedPane tabbedPane = new JTabbedPane();


        // ������ 1 ��ѡ�
        tabbedPane.addTab("ѡ�1", createTextPanel("1"));

        // ������ 2 ��ѡ�
        tabbedPane.addTab("ѡ�2", createTextPanel("2"));

        // ������ 3 ��ѡ�,����ʾ
        tabbedPane.addTab("ѡ�3", new ImageIcon(""), createTextPanel("3"), "ѡ�3");


        // ���ѡ�ѡ��״̬�ı�ļ�����
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("��ǰѡ�е�ѡ�: " + (tabbedPane.getSelectedIndex()+1));
            }
        });

        // ����Ĭ��ѡ�е�ѡ�
        tabbedPane.setSelectedIndex(1);

        jframe.setContentPane(tabbedPane);
        jframe.setVisible(true);
    }

    *//**
     * ����һ����壬���������ʾһ����ǩ�����ڱ�ʾĳ��ѡ���Ҫ��ʾ������
     *//*
    private static JComponent createTextPanel(String text) {
        // �������, ʹ��һ�� 1 �� 1 �е����񲼾֣�Ϊ���ñ�ǩ�Ŀ���Զ�������壩
        JPanel panel = new JPanel(new GridLayout(1, 1));

        // ������ǩ
        JLabel label = new JLabel(text);
        label.setFont(new Font(null, Font.PLAIN, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // ��ӱ�ǩ�����
        panel.add(label);

        return panel;
	}*/
    
		JFrame jf = new JFrame("���Դ���");
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        // �����ָ����
        JSplitPane splitPane = new JSplitPane();

        // ��������������ʾ�����
        JButton button1 = new JButton("LeftButton");
        JButton button2 = new JButton("RightButton");
        button1.setEnabled(false);
        button1.setForeground(new Color(0, 0, 0));
        button2.setEnabled(false);
        splitPane.setLeftComponent(button1);
        splitPane.setRightComponent(button2);

        // �ָ�������ʾ���� �۵�/չ�� ���������С��ť
        splitPane.setOneTouchExpandable(true);

        // �϶��ָ���ʱ�����ػ����
        splitPane.setContinuousLayout(true);

        // ���÷ָ����ĳ�ʼλ��
        splitPane.setDividerLocation(150);

        // �ѷָ������Ϊ���������ӵ����ڲ���ʾ
        jf.setContentPane(splitPane);
        jf.setVisible(true);
    }
		
  
}
