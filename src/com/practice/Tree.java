package com.practice;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.WindowConstants;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
	public static void main(String[] args) {
        JFrame jf = new JFrame("���Դ���");
        jf.setSize(300, 300);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // �������ڵ�
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("�й�");

        // ���������ڵ�
        DefaultMutableTreeNode gdNode = new DefaultMutableTreeNode("������");
        DefaultMutableTreeNode fjNode = new DefaultMutableTreeNode("���");
        DefaultMutableTreeNode shNode = new DefaultMutableTreeNode("�Ϻ�");
        DefaultMutableTreeNode twNode = new DefaultMutableTreeNode("����");

        // �Ѷ����ڵ���Ϊ�ӽڵ���ӵ����ڵ�
        rootNode.add(gdNode);
        rootNode.add(fjNode);
        //rootNode.add(shNode);
        rootNode.add(twNode);

        // ���������ڵ�
        DefaultMutableTreeNode gzNode = new DefaultMutableTreeNode("������");
        DefaultMutableTreeNode szNode = new DefaultMutableTreeNode("ĵ����");

        DefaultMutableTreeNode fzNode = new DefaultMutableTreeNode("����");

        DefaultMutableTreeNode tbNode = new DefaultMutableTreeNode("̨��");
        DefaultMutableTreeNode gxNode = new DefaultMutableTreeNode("����");
        DefaultMutableTreeNode jlNode = new DefaultMutableTreeNode("��¡");

        // �������ڵ���Ϊ�ӽڵ���ӵ���Ӧ�Ķ����ڵ�
        gdNode.add(gzNode);
        gdNode.add(szNode);

        fjNode.add(fzNode);

        twNode.add(tbNode);
        twNode.add(gxNode);
        twNode.add(jlNode);

        // ʹ�ø��ڵ㴴�������
        JTree tree = new JTree(rootNode);

        // ��������ʾ���ڵ���
        tree.setShowsRootHandles(true);

        // �������ڵ�ɱ༭
        tree.setEditable(true);

        // ���ýڵ�ѡ�м�����
        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                System.out.println("��ǰ��ѡ�еĽڵ�: " + e.getPath());
            }
        });

        // ����������壬����������Ϊ���ڵ�չ���������Ҫ�ܴ�Ŀռ�����ʾ��������Ҫ��һ�����������������
        JScrollPane scrollPane = new JScrollPane(tree);

        // ��ӹ�����嵽���������
        panel.add(scrollPane, BorderLayout.CENTER);

        // ���ô���������岢��ʾ
        jf.setContentPane(panel);
        jf.setVisible(true);
    }
}
