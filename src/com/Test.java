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
		 * System.out.println("�������"); }
		 * 
		 * @Override public void windowIconified(WindowEvent arg0) {
		 * System.out.println("������С����"); }
		 * 
		 * @Override public void windowDeiconified(WindowEvent arg0) {
		 * System.out.println("������С������ԭ��"); }
		 * 
		 * @Override public void windowDeactivated(WindowEvent arg0) {
		 * System.out.println("����ʧȥ������"); }
		 * 
		 * @Override public void windowClosing(WindowEvent arg0) {
		 * System.out.println("����ر�"); //frame.dispose();
		 * //��windowClosing������ִ��dispose������windowClosed����ִ��,���ʹ����frame.
		 * //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)����windowClosed������ִ�� }
		 * 
		 * @Override public void windowClosed(WindowEvent arg0) {
		 * System.out.println("�����Ѿ��ر���"); }
		 * 
		 * @Override public void windowActivated(WindowEvent arg0) {
		 * System.out.println("�����ý���"); } });
		 */
		 

		
		/*
		 * jframe.addWindowListener(new WindowAdapter() {
		 * 
		 * @Override public void windowOpened(WindowEvent e) {
		 * System.out.println("���ڴ�"); }
		 * 
		 * @Override public void windowClosing(WindowEvent e) {
		 * System.out.println("���ڹر�"); }
		 * 
		 * });
		 */
		 

		
		  jframe.setLayout(new FlowLayout());
		  
		  JButton button = new JButton("���԰�ť"); 
		  button.setBounds(170, 250, 250, 40);
		  jframe.add(button);
		  
		  // ������ť�¼� 
		  button.addActionListener(new ActionListener() {
		  
		  @Override public void actionPerformed(ActionEvent e) { 
		  JOptionPane.showConfirmDialog(null, "��ѡ��:", "ȷ����Ϣ", JOptionPane.YES_NO_OPTION); 
		  //JOptionPane.showMessageDialog(null, "���棡��", "���󣡣���", JOptionPane.ERROR_MESSAGE); 
		  } 
		  }
		  );
		 

		jframe.setSize(600, 600);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
	}

}
