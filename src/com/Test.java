package com;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();

		
		/*
		 * jframe.addWindowListener(new WindowListener() {
		 * 
		 * @Override public void windowOpened(WindowEvent arg0) {
		 * System.out.println("窗体打开了"); }
		 * 
		 * @Override public void windowIconified(WindowEvent arg0) {
		 * System.out.println("窗体最小化了"); }
		 * 
		 * @Override public void windowDeiconified(WindowEvent arg0) {
		 * System.out.println("窗体最小化被还原了"); }
		 * 
		 * @Override public void windowDeactivated(WindowEvent arg0) {
		 * System.out.println("窗体失去焦点了"); }
		 * 
		 * @Override public void windowClosing(WindowEvent arg0) {
		 * System.out.println("窗体关闭"); //frame.dispose();
		 * //在windowClosing方法中执行dispose方法，windowClosed方法执行,如果使用了frame.
		 * //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)，则windowClosed方法不执行 }
		 * 
		 * @Override public void windowClosed(WindowEvent arg0) {
		 * System.out.println("窗体已经关闭了"); }
		 * 
		 * @Override public void windowActivated(WindowEvent arg0) {
		 * System.out.println("窗体获得焦点"); } });
		 */
		 

		
		/*
		 * jframe.addWindowListener(new WindowAdapter() {
		 * 
		 * @Override public void windowOpened(WindowEvent e) {
		 * System.out.println("窗口打开"); }
		 * 
		 * @Override public void windowClosing(WindowEvent e) {
		 * System.out.println("窗口关闭"); }
		 * 
		 * });
		 */
		 

		
		  jframe.setLayout(new FlowLayout());
		  
		  JButton button = new JButton("测试按钮"); 
		  button.setBounds(170, 250, 250, 40);
		  jframe.add(button);
		  
		  // 监听按钮事件 
		  button.addActionListener(new ActionListener() {
		  
		  @Override public void actionPerformed(ActionEvent e) { 
		  JOptionPane.showConfirmDialog(null, "请选择:", "确认信息", JOptionPane.YES_NO_OPTION); 
		  //JOptionPane.showMessageDialog(null, "警告！！", "错误！！！", JOptionPane.ERROR_MESSAGE); 
		  } 
		  }
		  );
		 

		jframe.setSize(600, 600);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}

}
