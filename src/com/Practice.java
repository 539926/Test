package com;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

public class Practice {
	public static void main(String[] args) {
		/*
		 * JFrame jframe = new JFrame("用户登录");
		 * jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 * 
		 * // 第 1 个 JPanel, 使用默认的浮动布局 JPanel panel01 = new JPanel(); panel01.add(new
		 * JLabel("用户名")); panel01.add(new JTextField(10));
		 * 
		 * // 第 2 个 JPanel, 使用默认的浮动布局 JPanel panel02 = new JPanel(); panel02.add(new
		 * JLabel("密   码")); panel02.add(new JPasswordField(10));
		 * 
		 * // 第 3 个 JPanel, 使用浮动布局, 并且容器内组件居中显示 JPanel panel03 = new JPanel(new
		 * FlowLayout(FlowLayout.CENTER)); panel03.add(new JButton("登录"));
		 * panel03.add(new JButton("注册"));
		 * 
		 * // 创建一个垂直盒子容器, 把上面 3 个 JPanel 串起来作为内容面板添加到窗口 Box vBox =
		 * Box.createVerticalBox(); vBox.add(panel01); vBox.add(panel02);
		 * vBox.add(panel03);
		 * 
		 * jframe.setContentPane(vBox);
		 * 
		 * jframe.pack(); jframe.setLocationRelativeTo(null);
		 * jframe.setVisible(true);
		 */
		
		
		/*
		 * //滚动面板 JFrame jframe = new JFrame("滚动面板测试窗口"); jframe.setSize(400, 400);
		 * jframe.setLocationRelativeTo(null);
		 * jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		 * 
		 * // 创建文本区域组件 JTextArea textArea = new JTextArea();
		 * textArea.setLineWrap(false);// 不自动换行
		 * 
		 * // 创建滚动面板, 垂直滚动条和水平滚动条一直显示 JScrollPane scrollPane = new JScrollPane(
		 * textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
		 * ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS );
		 * jframe.setContentPane(scrollPane);
		 */
		
		/*//选项卡面板
		JFrame jframe = new JFrame("选项卡面板测试窗口");
        jframe.setSize(300, 300);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setLocationRelativeTo(null);

        // 创建选项卡面板
        final JTabbedPane tabbedPane = new JTabbedPane();


        // 创建第 1 个选项卡
        tabbedPane.addTab("选项卡1", createTextPanel("1"));

        // 创建第 2 个选项卡
        tabbedPane.addTab("选项卡2", createTextPanel("2"));

        // 创建第 3 个选项卡,有提示
        tabbedPane.addTab("选项卡3", new ImageIcon(""), createTextPanel("3"), "选项卡3");


        // 添加选项卡选中状态改变的监听器
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println("当前选中的选项卡: " + (tabbedPane.getSelectedIndex()+1));
            }
        });

        // 设置默认选中的选项卡
        tabbedPane.setSelectedIndex(1);

        jframe.setContentPane(tabbedPane);
        jframe.setVisible(true);
    }

    *//**
     * 创建一个面板，面板中心显示一个标签，用于表示某个选项卡需要显示的内容
     *//*
    private static JComponent createTextPanel(String text) {
        // 创建面板, 使用一个 1 行 1 列的网格布局（为了让标签的宽高自动撑满面板）
        JPanel panel = new JPanel(new GridLayout(1, 1));

        // 创建标签
        JLabel label = new JLabel(text);
        label.setFont(new Font(null, Font.PLAIN, 50));
        label.setHorizontalAlignment(SwingConstants.CENTER);

        // 添加标签到面板
        panel.add(label);

        return panel;
	}*/
    
		JFrame jf = new JFrame("测试窗口");
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);

        // 创建分隔面板
        JSplitPane splitPane = new JSplitPane();

        // 设置左右两边显示的组件
        JButton button1 = new JButton("LeftButton");
        JButton button2 = new JButton("RightButton");
        button1.setEnabled(false);
        button1.setForeground(new Color(0, 0, 0));
        button2.setEnabled(false);
        splitPane.setLeftComponent(button1);
        splitPane.setRightComponent(button2);

        // 分隔条上显示快速 折叠/展开 两边组件的小按钮
        splitPane.setOneTouchExpandable(true);

        // 拖动分隔条时连续重绘组件
        splitPane.setContinuousLayout(true);

        // 设置分隔条的初始位置
        splitPane.setDividerLocation(150);

        // 把分隔面板作为内容面板添加到窗口并显示
        jf.setContentPane(splitPane);
        jf.setVisible(true);
    }
		
  
}
