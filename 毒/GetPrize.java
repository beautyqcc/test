package com.iotek.GetPrize;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GetPrize extends JFrame implements ActionListener{
	JButton jbStart=new JButton("抽奖");
	JButton jbStop=new JButton("停止");
	JTextField showPrize=new JTextField(10);
	JLabel jlShow=new JLabel();
	static JTextField jtsend=new JTextField(10);
	JButton jbsend=new JButton("发送");
	JLabel jlsend=new JLabel("输入你想要的奖品,点击发送");
	String value="";
	Boolean flag=false;
	JLabel jbtime=new JLabel("你有三次抽奖机会哦,但只能选一个奖品呢");
	int count=3;
	static int j=0;
	static String []prize=new String[4];
	static int receive=0;
	static String sendend=null;
	public GetPrize(){
		jbStart.addActionListener(this);
		jbStop.addActionListener(this);
		jbsend.addActionListener(this);
		this.setLayout(new FlowLayout());
		this.add(showPrize);
		this.add(jbStart);
		this.add(jbStop);
		this.add(jlShow);
		this.add(jbtime);
		this.add(jlsend);
		this.add(jtsend);
		this.add(jbsend);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.addWindowListener(new SureExit());
	}
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==jbStart){
			jlShow.setText("");
			flag=true;
			new Begin().start();
			count--;
			jbtime.setText("还剩"+count+"机会");
			if(count==0){
				jbStart.setVisible(false);
			}
		}else if(ae.getSource()==jbStop){
			flag=false;
			prize[j]=value;
			UPDDemo1.udsend();
			j++;
			if(j>2){
					j=2;
				}
			
			}
		if(ae.getSource()==jbsend && count==0){
			j++;
			if(j>3){
				return;
			}
			prize[j]=jtsend.getText()+"c";
			
			UPDDemo1.udsend();
			UPDDemo1.udpreveive();
			
		}
		
			if(value.equals( "谢谢参与")){
				jlShow.setText("糟糕了,奖品消失在二次元世界");
			}
			else jlShow.setText("小样运气还不错嘛,抽到"+value);
		}
	
	class SureExit extends WindowAdapter{
		
		public void windowClosing(WindowEvent e){//关闭窗体发送消息给UDPReceive
			if(e.getSource()==GetPrize.this){
				try {
					DatagramSocket socket=new DatagramSocket();
					sendend="end";
					byte []buff=sendend.getBytes();
					DatagramPacket packet=new DatagramPacket(buff,buff.length,
							InetAddress.getByName("182.85.228.94"),8810);
					 
					//IPv4 地址: 182.85.228.94
					
					socket.send(packet);
					
					socket.close();
				} catch (SocketException e1) {
					
					e1.printStackTrace();
				} catch (UnknownHostException e1) {
					
					e1.printStackTrace();
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
			}
		}
	}
	class Begin extends Thread{
		int j=0;
		public void run(){
			
			while(flag){
				
				int i=(int)(Math.random()*(26));
				Prize.setPrize();
			if(i!=0){
				 value=Prize.prize.get(i);
				showPrize.setText(value);
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GetPrize();
		
	}

}

