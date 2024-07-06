package com.abcd.chatapp.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
//
//public class DashBoard extends JFrame {
//
//	private static final long serialVersionUID = 1L;
//	private JPanel contentPane;
//
//
//	public DashBoard(String message) {
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1231, 675);
//		
//		JMenuBar menuBar = new JMenuBar();
//		setJMenuBar(menuBar);
//		
//		JMenu chatMenu = new JMenu("Chat");
//		menuBar.add(chatMenu);
//		
//		JMenuItem StartChat = new JMenuItem("Start Chat");
//		StartChat.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				try {
//					new ClientChatScreen();
//				} catch (UnknownHostException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
//		});
//		chatMenu.add(StartChat);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
//		setContentPane(contentPane);
//		setTitle(message);
//		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setBackground(Color.WHITE);
//		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/images/image3.jpg")));
//		contentPane.add(lblNewLabel,BorderLayout.CENTER);
//	}
//}
public class DashBoard extends JFrame {



	private static final long serialVersionUID = 1L;

	private JPanel contentPane;





	public DashBoard(String message) {

		setExtendedState(JFrame.MAXIMIZED_BOTH);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 1231, 675);

		

		JMenuBar menuBar = new JMenuBar();

		setJMenuBar(menuBar);

		

		JMenu chatMenu = new JMenu("MENU");

		menuBar.add(chatMenu);

		

		JMenuItem StartChat = new JMenuItem("Group Chat");

		StartChat.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				try {

					new ClientChatScreen();

				} catch (UnknownHostException e1) {

					// TODO Auto-generated catch block

					e1.printStackTrace();

				} catch (IOException e1) {

					// TODO Auto-generated catch block

					e1.printStackTrace();

				}

			}

		});

		chatMenu.add(StartChat);

		

		JMenuItem anotherMenuItem = new JMenuItem("Personal Chat");

		chatMenu.add(anotherMenuItem);

		JMenuItem anotherMenuItem1 = new JMenuItem("Help");

		chatMenu.add(anotherMenuItem1);

		JMenuItem anotherMenuItem2 = new JMenuItem("About Us");

		chatMenu.add(anotherMenuItem2);

		

		Font menuFont = new Font("Tahoma", Font.BOLD, 16);

		menuBar.setFont(menuFont);

		chatMenu.setFont(menuFont);

		Font menuFont1 = new Font("Arial", Font.PLAIN, 16);

		StartChat.setFont(menuFont1);

		anotherMenuItem.setFont(menuFont1);

		anotherMenuItem1.setFont(menuFont1);	

		anotherMenuItem2.setFont(menuFont1);		

		

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane.setLayout(new BorderLayout(0, 0));

		setContentPane(contentPane);

		setTitle(message);

		

		JLabel lblNewLabel = new JLabel("");

		lblNewLabel.setBackground(Color.WHITE);

		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		lblNewLabel.setIcon(new ImageIcon(DashBoard.class.getResource("/images/aanewback.png")));

		contentPane.add(lblNewLabel,BorderLayout.CENTER);

	}

}
