package com.iotek.Love;

import java.io.File;

import javax.swing.JOptionPane;

public class Hint extends JOptionPane{
	int i=0;
	String str;
	File file=new File("D:\\love letter");
	Enter enter=null;
	public Hint(Enter enter){
		/*if(i==0){
			this.showMessageDialog(null,"请将我给你的图片放在D:\\love letter文件下,么有可以创建哦");
			i=1;
		}if(i==1){
			while(true){
				str=this.showInputDialog("创建好了输入.最喜欢李志坚欧巴了.:");
				if(str.equals("最喜欢李志坚欧巴了"))
					break;
				else 
					this.showMessageDialog(null, "哎哟，有点小伤心呢");
			}
		}
		if(found(file)){
			this.showMessageDialog(null, "李志坚欧巴已经检测到你很乖哦");
		}else
			this.showMessageDialog(null, "瞿超超不乖呢，没有按欧巴说的做呢,不开心");*/
		enter.setVisible(false);
		showDialog();
		
	}
	public void showDialog(){
		if(i==0){
			this.showMessageDialog(null,"请将我给你的图片放在D:\\love letter文件下,么有可以创建哦");
			i=1;
		}if(i==1){
			while(true){
				str=this.showInputDialog("创建好了输入.最喜欢李志坚欧巴了.:");
				if(str.equals("最喜欢李志坚欧巴了"))
					break;
				else 
					this.showMessageDialog(null, "哎哟，有点小伤心呢,竟然打错字了你，好蠢那");
			}
		}
		if(found()){
			this.showMessageDialog(null, "李志坚欧巴已经检测到你很乖哦");
			new BackGroud();
		}else
			this.showMessageDialog(null, "瞿超超不乖呢，没有按欧巴说的做呢,不开心");
	}
	public  boolean found(){
		try{
			File[] stu=file.listFiles();
			for(File name:stu)
				System.out.println(name.getName());
			try{
				if(stu[0].getName().equals("quan1.jpg"))
					return true;
				else {
					this.showMessageDialog(null, "没有把我给你的图片放进去吧,蠢死了");
					return false;
				}
			}catch(ArrayIndexOutOfBoundsException e){
				this.showMessageDialog(null, "没有把我给你的图片放进去吧,蠢死了");
				return false;
			}
		}catch(NullPointerException e){
				this.showMessageDialog(null,"瞿超超都没在D盘下创建love letter文件夹呢");
				return false;
			}
	}
}
