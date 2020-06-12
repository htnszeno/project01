package com.example.demo;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainMenu {
	
	
	
	public MainMenu() {
		
	}
	
	public JMenuBar createMenu() {
		
//		dbTest();
		
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		fileMenu.add(new JMenuItem("New"));
		fileMenu.add(new JMenuItem("Open"));
		fileMenu.addSeparator();
		fileMenu.add(new JMenuItem("Save"));
		fileMenu.add(new JMenuItem("Save as"));
		
		mb.add(fileMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		return mb;
		
		//setJMenuBar(mb);
		
	}
	
	
}
