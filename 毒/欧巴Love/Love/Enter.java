package com.iotek.Love;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;




public class Enter extends JFrame{
	private BackGroud show=null;
	private JLabel l_name=null;
	private JLabel l_password=null;
	public static JTextField uesrname=new JTextField(10);
	private JPasswordField password=null;
	private JButton jb=null;
	private JLabel name_err=new JLabel("");
	private JLabel password_err=new JLabel("");
	public Enter(){}
	public Enter(String title){
		super(title);
		init();
		registerListener();
	}
	public void init(){
		l_name=new JLabel("用户名:");
		l_password=new JLabel("密码:");
		
		password=new JPasswordField(10);
		jb=new JButton("确定");
		this.setLayout(null);
		
		l_name.setBounds(50,50,50,40);
		l_password.setBounds(60, 100, 50, 40);
		uesrname.setBounds(100,60,100,20);
		password.setBounds(100,105,100,20);
		jb.setBounds(100, 150, 80, 30);
		
		name_err.setBounds(210, 20, 100, 100);
		password_err.setBounds(210, 60, 100, 100);
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int screenWidth=screenSize.width;
		int screenHeight=screenSize.height;
		int windowWidth=this.getWidth();
		int windowHeight=this.getHeight();
		this.setLocation((screenWidth + windowWidth) / 2, 
				(screenHeight + windowHeight) / 2);
		
		this.getContentPane().setBackground(Color.PINK);
		this.add(l_name);
		this.add(l_password);
		this.add(uesrname);
		this.add(password);
		this.add(jb);
		this.add(name_err);
		this.add(password_err);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setBackground(Color.CYAN);
		this.setSize(300,300 );
		this.setVisible(true);
	}
	public void registerListener(){
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				goToWelcome();
			}
		});
	}
	public void goToWelcome(){
		if(uesrname.getText().equals("qcc") && password.getText().equals("940803")){
		 
		  password_err.setText("");
		  name_err.setText("");
		 // show=new BackGroud();
		 new Hint(LoveDemo.en);
		 this.setVisible(false);
		  System.out.println("aa");
	}else if(!uesrname.equals("qcc") && password.getText().equals("940803")){
			name_err.setText("错了,真是蠢∩▂∩");
			password_err.setText("");
		}else if(!password.getText().equals("940803") && uesrname.getText().equals("qcc")){
			password_err.setText("错了,真是蠢∩▂∩");
			name_err.setText("");
		}else{
			name_err.setText("错了,真是蠢∩▂∩");
			password_err.setText("错了,真是蠢∩▂∩");
		}
	}
	
}