package com.tom.kkk;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	public MyFrame(){
        setSize(500,300);
        setVisible(true);
        JButton ok = new JButton("OK");
        JPanel north = new JPanel();
        north.add(ok);
        add(north, BorderLayout.NORTH);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }

}
