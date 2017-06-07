package com.iotek.Love;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class BackGroud extends JFrame implements ActionListener{
	int []xx={250,185,125,65,125,185,250,325,390,450,390,325};
	int []yy={125,65,65,125,175,225,275,225,175,125,65,65};
	JPanel jp=null;
	JLabel jl=null;
	JLabel []showTxt=new JLabel[13];
	JLabel jlove=null;
	Image []arry_image=new Image[3];
	int xc=256,xy=180;
	int cont=0;
	
	JButton start;
	String []small=new String[12];
	public BackGroud(){
		for(int i=0;i<small.length;i++){
			small[i]="love";
		}
	
		jp=new JPanel(){//JPanel中重写paintComponent(Graphice g)
			protected void paintComponent(Graphics g){
					ImageIcon ico=new ImageIcon("D:\\love letter\\quan1.jpg");
					Image img=ico.getImage();
					g.drawImage(img,0, 0, ico.getIconWidth(),ico.getIconHeight()
							, ico.getImageObserver());
				Font f=new Font("黑体", Font.BOLD, 15);
				g.setColor(Color.BLACK);
				g.setFont(f);
				for(int i=0;i<12 ;i++)
					if(i==0)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==1)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==2)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==3)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==4)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==5)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==6)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==7)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==8)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==9)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==10)
						g.drawString(small[i],xx[i], yy[i]);
					else if(i==11)
						g.drawString(small[i],xx[i], yy[i]);
					g.drawString("超",xc,xy);
				if(cont==1)
					g.drawString("小的", 520, 180);
			}
		};
		JPanel jp2=new JPanel();
		jl=new JLabel();
		JPanel jpstart=new JPanel();
		start=new JButton("开始");
		start.addActionListener(this);
		jp.add(jl,BorderLayout.EAST);//将标签放入面板中
		this.setSize(700,600);
		//jp.add(jp2, BorderLayout.EAST);
		jpstart.setBackground(Color.gray);
		jpstart.add(start);
		jp.add(jpstart, BorderLayout.SOUTH);
		this.add(jp);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
		
	}
	private class WThread implements Runnable{
		int i=0;
		int len=0;
		
		StringBuilder sb=new StringBuilder();
		public void run(){
			int i=0;
			while(true){
				try{
					
					jl.setText((Word.word.substring(0, i)));
					i++;
					if(i==Word.word.length())
						break;
					Thread.sleep(500);
				}catch(Exception e){
						e.printStackTrace();
					}
				
			
				
			}
		}
	}
	class MoveWord implements Runnable{
		public void run(){
			while(true){
				for(int i=0;i<xx.length;i++){
					if(i==1){
						if(xx[i]==185){
							xx[i]=185;
						}else if(xx[i]!=185) xx[i]++; 
						if(yy[i]==125) yy[i]=125;
						else if(yy[i]!=125) yy[i]++;
					}else if(i==2){
						if(xx[i]==185){
							xx[i]=185;
						}else if(xx[i]!=185) xx[i]++;
						if(yy[i]==185) yy[i]=185;
						else if(yy[i]!=185) yy[i]++;
					}else if(i==3){
						if(xx[i]==185){
							xx[i]=185;
						}else if(xx[i]!=185) xx[i]++;
						if(yy[i]==245) yy[i]=245;
						else if(yy[i]!=245) yy[i]++;
						
					}else if(i==4){
						if(xx[i]==185){
							xx[i]=185;
						}else if(xx[i]!=185) xx[i]++;
						 if(yy[i]==305) yy[i]=305;
						 else if(yy[i]!=305) yy[i]++;
					}else if(i==5){
						if(xx[i]==245){
							xx[i]=245;
						}else if(xx[i]!=245) xx[i]++;
						 if(yy[i]==305){
							yy[i]=305;
						}else if(yy[i]!=305){
							
							yy[i]++;
						}
					}else if(i==6){
						if(xx[i]==290){
							xx[i]=290;
						}else if(xx[i]!=290) xx[i]++;
						 if(yy[i]==305){
							yy[i]=305;
						}else if(yy[i]!=305) yy[i]++;
							
							
						
					}else if(i==7){
						if(xx[i]==365) xx[i]=365;
						else if(xx[i]!=365) xx[i]++;
						if(yy[i]==305) yy[i]=305;
						else if(yy[i]!=305) yy[i]++;
					}else if(i==8){
						if(xx[i]==305) xx[i]=305;
						else if(xx[i]!=305) xx[i]--;
						if(yy[i]==125)  yy[i]=125;
						else if(yy[i]!=125) yy[i]--;
					}else if(i==9){
						if(xx[i]==330) xx[i]=330;
						else if(xx[i]!=330) xx[i]--;
						if(yy[i]==200)  yy[i]=200;
						else if(yy[i]!=200) yy[i]++;
					}else if(i==10){
						if(yy[i]==200) yy[i]=200;
						else if(yy[i]!=200) yy[i]++;
						if(xx[i]==400) xx[i]=400;
						else if(xx[i]!=400) xx[i]++; 
					}
					else if(i==11){
						if(xx[i]==420) xx[i]=420;
						else if(xx[i]!=420) xx[i]++;
						if(yy[i]==125)  yy[i]=125;
						else if(yy[i]!=125) yy[i]++;
					}
				}
				if(xc>=600)
					{xc=600;cont=1;}
				
				else xc+=3;
				if(xx[0]>=560){
					xx[0]=560;
				}else xx[0]+=2;
				if(yy[0]==xy || yy[0]==(xy+1)) yy[0]=xy;
				else yy[0]+=1;
				repaint();
				try{
					Thread.sleep(100);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
			
		}
	}
	public void actionPerformed(ActionEvent e){
		new Thread(new WThread()).start();
		new Thread(new MoveWord()).start();
		new SaveFile();
	}
	public void init(){
		for(int i=0;i<arry_image.length;i++){
			arry_image[i]=new ImageIcon("D:\\li\\a"+(i+1)+".jpg").getImage();
		}
	}

}

