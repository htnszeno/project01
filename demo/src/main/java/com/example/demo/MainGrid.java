package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MainGrid extends JPanel {
	private static final long serialVersionUID = 1L;
	private JButton JButtonjBtnAddRow = null;
	private JButton JButtonjBtnSaveRow = null;
	private JButton JButtonjBtnEditRow = null;
	private JButton JButtonjBtnDelRow = null;
	
	private JTable table;
	private JScrollPane scrollPane;
	
	private String driver = "";
	private String url = "";
	private String colNames[] = {"DO NO","ORDER NO", "PKG"};
	private DefaultTableModel model = new DefaultTableModel(colNames,0);
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	
	
	
}
